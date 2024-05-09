package edu.hw6.task2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("MagicNumber")
public class CloneFile {
    private static final Pattern PATTERN_FIRST_CLONE_FILE = Pattern.compile("^(.* – копия)(\\..*)$");
    private static final Pattern PATTERN_MORE_CLONE_FILE = Pattern.compile("^(.* – копия) \\((\\d+)\\)(\\..*)$");
    private static final Pattern PATTERN_NONE_CLONE_FILE = Pattern.compile("^(.*)(\\..*)$");
    private static final String STRING_COPY = " – копия";
    private static final Logger LOGGER = LogManager.getLogger(CloneFile.class);

    public Path cloneFile(Path path) {
        Path pathRes = null;
        if (Files.notExists(path)) {
            return null;
        }
        Matcher matcher1 = PATTERN_MORE_CLONE_FILE.matcher(path.toString());
        Matcher matcher2 = PATTERN_FIRST_CLONE_FILE.matcher(path.toString());
        Matcher matcher3 = PATTERN_NONE_CLONE_FILE.matcher(path.toString());
        if (matcher1.find()) {
            pathRes = nextClone(Integer.parseInt(matcher1.group(2)), path, matcher1.group(1), matcher1.group(3));
        } else if (matcher2.find()) {
            pathRes = nextClone(1, path, matcher2.group(1), matcher2.group(2));
        } else if (matcher3.find()) {
            Path newPath = Path.of(matcher3.group(1) + STRING_COPY + matcher3.group(2));
            if (Files.notExists(newPath)) {
                try {
                    Files.copy(path, newPath);
                    pathRes = newPath;
                } catch (IOException e) {
                    LOGGER.error("None clone file error: {}", e.getMessage());
                }
            } else {
                pathRes = nextClone(1, path, matcher3.group(1) + STRING_COPY, matcher3.group(2));
            }
        }
        return pathRes;
    }

    private Path nextClone(int numberClone, Path path, String absolutePath, String extension) {
        Path path1;
        int cntClone = numberClone;
        while (true) {
            path1 = Path.of(
                    absolutePath
                            + " (" + (++cntClone) + ")"
                            + extension
            );
            if (Files.notExists(path1)) {
                try {
                    Files.copy(path, path1);
                } catch (Exception e) {
                    LOGGER.error("Clone error: {}", e.getMessage());
                    return null;
                }
                return path1;
            }
        }
    }
}

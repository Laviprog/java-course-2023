package edu.hw1.task8;

public class KnightBoard {
    private static boolean isGood(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    private static final int[] DX = new int[] {1, 1, 2, 2, -1, -1, -2, -2};
    private static final int[] DY = new int[] {2, -2, 1, -1, 2, -2, 1, -1};

    public boolean knightBoardCapture(final int[][] a) {
        int n = a.length;
        int m = a[0].length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (a[i][j] == 1 && !checkBoard(i, j, n, m, a)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean checkBoard(int posX, int posY, int n, int m, final int[][] a) {
        for (int w = 0; w < DX.length; ++w) {
            int vx = posX + DX[w];
            int vy = posY + DY[w];
            if (isGood(vx, vy, n, m) && a[vx][vy] == 1) {
                return false;
            }
        }
        return true;
    }
}

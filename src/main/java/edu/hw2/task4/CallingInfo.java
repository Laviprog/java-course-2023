package edu.hw2.task4;

public record CallingInfo(String className, String methodName) {
    public static CallingInfo callingInfo() {
        Throwable throwable = new Throwable();
        StackTraceElement stackTraceElements = throwable.getStackTrace()[1];
        return new CallingInfo(stackTraceElements.getClassName(), stackTraceElements.getMethodName());
    }
}

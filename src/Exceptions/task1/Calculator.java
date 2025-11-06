package Exceptions.task1;

public interface Calculator {
    public static class NullParameterException extends Exception {
        public NullParameterException(String message) {
            super(message);
        }
    }

    public static class OverFlowException extends Exception {
        public OverFlowException(String message) {
            super(message);
        }
    }

    public static class UnderFlowException extends Exception {
        public UnderFlowException(String message) {
            super(message);
        }
    }
}

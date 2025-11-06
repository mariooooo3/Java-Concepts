package Exceptions.task2;

public interface Exceptions {
    public static class NotEnoughMoneyException extends Exception {
        public NotEnoughMoneyException(String message) {
            super(message);
        }
    }

    public static class NoSuchBookException extends Exception {
        public NoSuchBookException(String message) {
            super(message);
        }
    }

}

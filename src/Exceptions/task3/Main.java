package Exceptions.task3;

public class Main {
    public static void main(String[] args) {

        ConsoleLogger consoleLogger = new ConsoleLogger();
        EmailLogger emailLogger = new EmailLogger();
        FileLogger fileLogger = new FileLogger();

        consoleLogger.setNextLogger(emailLogger);
        emailLogger.setNextLogger(fileLogger);

        consoleLogger.message("Aplicația a pornit", LogLevel.Info);
        consoleLogger.message("Eroare la încărcare", LogLevel.Error);
        consoleLogger.message("Mesaj funcțional", LogLevel.FunctionalMessage);
        consoleLogger.message("Avertisment de memorie", LogLevel.Warning);
    }
}

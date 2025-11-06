package Exceptions.task3;

import java.util.EnumSet;

public class EmailLogger extends LoggerBase {
    public EmailLogger() {
        super(EnumSet.of(LogLevel.FunctionalMessage, LogLevel.FunctionalError));
    }

    public void writeMessage(String message){
        System.out.println("[EmailLogger]" + message);
    }
}

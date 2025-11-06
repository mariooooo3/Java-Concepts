package Exceptions.task3;

import java.util.EnumSet;

public class FileLogger extends LoggerBase {
    public FileLogger() {
        super(EnumSet.of(LogLevel.Error, LogLevel.Warning));
    }

    public void writeMessage(String message){
        System.out.println("[FileLogger]" + message);
    }
}

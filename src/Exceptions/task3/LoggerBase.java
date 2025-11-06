package Exceptions.task3;

import java.util.EnumSet;

public abstract class LoggerBase {
    public EnumSet<LogLevel> loglevel;
    public LoggerBase nextLogger;


    public LoggerBase(EnumSet<LogLevel> logLevel) {
        this.loglevel = logLevel;
    }

    public void setNextLogger(LoggerBase nextLogger) {
        this.nextLogger = nextLogger;
    }

    public abstract void writeMessage(String message);

    public void message(String message, LogLevel severity)
    {
        if(loglevel.contains(severity))
            writeMessage(message);

        if(nextLogger != null)
            nextLogger.message(message, severity);
    }
}

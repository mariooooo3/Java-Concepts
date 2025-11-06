package Exceptions.task3;

public class ConsoleLogger extends LoggerBase{

    public ConsoleLogger(){
        super(LogLevel.all());
    }
    public void writeMessage(String message){
        System.out.println("[ConsoleLogger]" + message);
    }
}

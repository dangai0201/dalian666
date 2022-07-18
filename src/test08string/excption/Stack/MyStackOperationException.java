package test08string.excption.Stack;

public class MyStackOperationException extends Exception{
    public MyStackOperationException() {
    }

    public MyStackOperationException(String message) {
        super(message);
    }
}

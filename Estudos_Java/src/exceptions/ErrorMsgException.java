package exceptions;

public class ErrorMsgException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public ErrorMsgException (String msg) {
        super(msg);
    }
    
}

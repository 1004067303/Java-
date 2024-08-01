package Exceptions;

public class AgeOutRunTimeException extends RuntimeException {
    public AgeOutRunTimeException() {
    }

    public AgeOutRunTimeException(String message) {
        super(message);
    }
}

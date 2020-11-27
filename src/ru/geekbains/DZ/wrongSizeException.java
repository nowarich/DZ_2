package ru.geekbains.DZ;

public class wrongSizeException extends RuntimeException {
    public wrongSizeException(String message) {
        super(message);
    }

    public wrongSizeException(String message, Throwable cause) {
        super(message, cause);
    }
}

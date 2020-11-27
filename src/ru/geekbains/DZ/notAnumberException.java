package ru.geekbains.DZ;

public class notAnumberException extends RuntimeException {

    public notAnumberException(String message) {
        super(message);
    }

    public notAnumberException(String message, Throwable cause) {
        super(message, cause);
        message = "Not a number";
    }
}

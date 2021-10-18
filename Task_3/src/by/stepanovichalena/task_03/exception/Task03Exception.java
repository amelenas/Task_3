package by.stepanovichalena.task_03.exception;

public class Task03Exception extends Exception{
    public Task03Exception() {
    }

    public Task03Exception(String message) {
        super(message);
    }

    public Task03Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public Task03Exception(Throwable cause) {
        super(cause);
    }
}

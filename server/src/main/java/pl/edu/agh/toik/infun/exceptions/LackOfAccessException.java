package pl.edu.agh.toik.infun.exceptions;

public class LackOfAccessException extends InFunException {
    public LackOfAccessException() {
        super();
    }

    public LackOfAccessException(String message) {
        super(message);
    }

    public LackOfAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfAccessException(Throwable cause) {
        super(cause);
    }
}
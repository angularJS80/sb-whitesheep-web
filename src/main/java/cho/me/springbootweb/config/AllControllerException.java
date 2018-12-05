package cho.me.springbootweb.config;

public class AllControllerException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private String message;

    public AllControllerException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
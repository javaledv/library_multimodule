package ml.ledv.library.controller.rest.responce;

public class ErrorResponse {

    private String msg;

    public ErrorResponse(final String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(final String msg) {
        this.msg = msg;
    }
}

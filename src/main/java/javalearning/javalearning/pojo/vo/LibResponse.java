package javalearning.javalearning.pojo.vo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: liz
 * @Date: 2018/9/26
 * @Time: 下午6:02
 */
public class LibResponse {
    private Boolean success;
    private int status;
    private String message;
    private Object data;

    public static LibResponse create(Boolean success) {
        return create(success,0,null,null);
    }

    public static LibResponse create(int status, Object data) {
        return create(null, status, null, data);
    }

    public static LibResponse create(Boolean success, int status, String message, Object data){
        return new LibResponse(success,status,message,data);
    }

    private LibResponse(Boolean success, int status, String message, Object data) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public LibResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public LibResponse setStatus(int status) {
        this.status = status;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public LibResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public Object getData() {
        return data;
    }

    public LibResponse setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "LibResponse{" +
                "success=" + success +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

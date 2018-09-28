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
    private Long status;
    private String message;
    private Object data;

    public static LibResponse create(Boolean success) {
        return create(success,null,null,null);
    }

    public static LibResponse create(Long status, Object data) {
        return create(null, status, null, data);
    }

    public static LibResponse create(Boolean success, Long status, String message, Object data){
        return new LibResponse(success,status,message,data);
    }

    private LibResponse(Boolean success, Long status, String message, Object data) {
        this.success = success;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

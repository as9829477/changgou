package entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 返回实体bean
 * @param <T>
 */
@ApiModel(description ="Result",value ="Result")
public class Result<T> {

    @ApiModelProperty(value = "执行是否成功,true:成功,false:失败",required = true)
    private boolean flag; //是否成功

    @ApiModelProperty(value = "返回状态码，20000：成功，20001:失败，20002:用户名或密码错误。20003：权限不足，20004：远程调用失败，20005：重复操作",required = true)
    private Integer code; //是否成功返回码

    @ApiModelProperty(value = "提示信息",required = true)
    private String message; //返回信息
    @ApiModelProperty(value = "逻辑数据",required = true)
    private  T date; //返回信息

    public Result(boolean flag, Integer code, String message, Object date) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.date = (T)date;
    }

    public Result(boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}

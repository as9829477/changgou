package entity;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * mq消息封装
 */
public class Message implements Serializable {

    //执行的操作 1：增加 2修改 3删除
    private  int code;

    //数据
    private Object content;

    //发送的rountKey
    @JSONField(serialize = false)
    private String routeKey;

    //交换机
    @JSONField(serialize = false)
    private String exechange;

    public Message(){}
    public Message(int code,Object content){
        this.code=code;
        this.content=content;
    }
    public Message(int code,Object content,String routeKey,String exechange){
        this.code=code;
        this.content=content;
        this.routeKey=routeKey;
        this.exechange=exechange;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public String getRouteKey() {
        return routeKey;
    }

    public void setRouteKey(String routeKey) {
        this.routeKey = routeKey;
    }

    public String getExechange() {
        return exechange;
    }

    public void setExechange(String exechange) {
        this.exechange = exechange;
    }
}

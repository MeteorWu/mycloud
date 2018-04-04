package com.test.meteor.framework.model;


import com.demo.meteor.framework.constant.ResultMsg;

public class ResponseBody<T> extends Response {

    private T body;
    public ResponseBody() {
    }

    public ResponseBody(T body) {
        this.body = body;
    }

    public ResponseBody(ResultMsg resultMsg) {
        super(resultMsg);
    }

    public ResponseBody(String code, String msg) {
        super(code, msg);
    }

    public ResponseBody(String code, String msg, T  body) {
        super(code, msg);
        this.body = body;
    }

    public ResponseBody(ResultMsg resultMsg, T  body) {
        super(resultMsg);
        this.body = body;
    }

    public Object getbody() {
        return body;
    }

    public void setbody(T  body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ResponseBody{" +
                "body=" + body +
                "} " + super.toString();
    }
}

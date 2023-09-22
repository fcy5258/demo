package com.quxue.takeaway.entity;

public class Result {
    private Integer code;//状态码
    private String msg;//给前端返回错误信息
    private Object data;//回应给前端的数据及对象

    public static Result success(){
        Result result = new Result();
        result.code = 200;
        result.msg = "success";
        return result;
    }
    public static Result success(String msg){
        Result result = new Result();
        result.code = 200;
        result.msg = msg;
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.code = 200;
        result.data = data;
        return result;
    }

    public static Result error(){
        Result result = new Result();
        result.code = 500;
        result.msg = "error";
        return result;
    }

    public static Result error(String msg){
        Result result = new Result();
        result.code = 500;
        result.msg = msg;
        return result;
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.code = code;
        result.msg = msg;
        return result;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}


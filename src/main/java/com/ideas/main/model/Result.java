package com.ideas.main.model;

public class Result<T> {
    // 错误码
    private Integer code;

    // 提示信息
    private String message;

    // 具体内容
    private T content;

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

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

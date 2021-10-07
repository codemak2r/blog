package com.example.blog.enums;

import lombok.Getter;

@Getter
public enum ResponseEnums {
    SUCCESS(20000, "success"),
    FAIL(20400, "fail"),
    ERROR(20500, "error");

    private final int status;
    private final String msg;

    ResponseEnums(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}

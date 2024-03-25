package com.chandol.coinhub.BithumbResponse;

import lombok.Getter;

@Getter
public class BithumbResponse<T> {
    private String status;
    private T data;
}

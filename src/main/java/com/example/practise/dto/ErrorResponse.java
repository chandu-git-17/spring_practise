package com.example.practise.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {

    private int status;
    private String message;
    private long timeStamp;

    public ErrorResponse(int status, String message, long timeStamp){
        this.timeStamp = timeStamp;
        this.status = status;
        this.message = message;
    }
}

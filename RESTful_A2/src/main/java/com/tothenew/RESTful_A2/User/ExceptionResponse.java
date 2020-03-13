package com.tothenew.RESTful_A2.User;

import java.util.Date;

public class ExceptionResponse {
    private Date timesstamp;
    private String message;
    private String details;
    public ExceptionResponse(Date timestamp,String message,String details){
        super();
        this.timesstamp = timestamp;
        this.message = message;
        this.details = details;
    }
}

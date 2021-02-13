package com.itvillage.autorechargescannerbackend.dto.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequest {
    private String userId;
    private String phoneNo;
    private String email;
    private String shopName;
    private String mac;
    private String serial_key;
    private String active_date;
    private String expaiedDate;
    private String packageName;
    private String price;
    private String userName;
    private String initialPassword;
    private String shopAddress;
    private String packageValidity;
    private String role;
}

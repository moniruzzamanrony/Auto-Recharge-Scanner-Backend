package com.itvillage.autorechargescannerbackend.domain.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class User {
    @Id
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

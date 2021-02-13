package com.itvillage.autorechargescannerbackend.service;

import com.itvillage.autorechargescannerbackend.domain.domain.User;
import com.itvillage.autorechargescannerbackend.domain.repository.UserRepository;
import com.itvillage.autorechargescannerbackend.dto.request.UserRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public ResponseEntity<String> addNewUser(UserRequest userRequest) {

        User user = new User();
        user.setActive_date(userRequest.getActive_date());
        user.setEmail(userRequest.getEmail());
        user.setExpaiedDate(userRequest.getExpaiedDate());
        user.setInitialPassword(userRequest.getInitialPassword());
        user.setMac(userRequest.getMac());
        user.setPackageName(userRequest.getPackageName());
        user.setPackageValidity(userRequest.getPackageValidity());
        user.setPrice(userRequest.getPrice());
        user.setPhoneNo(userRequest.getPhoneNo());
        user.setRole(userRequest.getRole());
        user.setSerial_key(userRequest.getSerial_key());
        user.setShopAddress(userRequest.getShopAddress());
        user.setShopName(userRequest.getShopName());
        user.setUserId(userRequest.getUserId());
        user.setUserName(userRequest.getUserName());
        userRepository.save(user);
        return new ResponseEntity(userRequest.getUserId(), HttpStatus.OK);
    }
}

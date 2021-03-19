package com.whitepaek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    @Autowired
    private HomeMapper mapper;

    public UserDTO selUser() {

        return mapper.selUser();
    }

}

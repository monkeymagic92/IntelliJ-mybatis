package com.whitepaek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    // 생성자 주입 방법
    // final로 선언하고 아래 생성자를 통하여 mapper를 주입함
    private final HomeMapper mapper;

    public HomeService(HomeMapper mapper) {
        this.mapper = mapper;
    }


    public UserDTO selUser() {

        return mapper.selUser();
    }

}

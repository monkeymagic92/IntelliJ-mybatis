package com.whitepaek.controller;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface HomeMapper {

    UserDTO selUser();
}

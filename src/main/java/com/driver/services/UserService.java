package com.driver.services;

public interface UserService {
    User register(String username, String password, String countryName) throws Exception;

    User subscribe(Integer userId, Integer serviceProviderId);

}
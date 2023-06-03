package com.driver.services;

public interface ConnectionService {
    User connect(int userId, String countryName) throws Exception;

    public User disconnect(int userId) throws Exception;

    public User communicate(int senderId, int receiverId) throws Exception;

}
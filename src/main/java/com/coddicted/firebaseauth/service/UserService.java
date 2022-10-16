package com.coddicted.firebaseauth.service;


import com.coddicted.firebaseauth.model.User;

import java.util.concurrent.ExecutionException;

public interface UserService {
    User save(User user);
    User getUserById(String id) throws ExecutionException, InterruptedException;
    User deleteUserById(String id);
}

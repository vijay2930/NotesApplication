package com.notes.login;

import com.notes.dto.User;

interface LoginControllerViewCallBack {

    void checkLoginCredential(String email, String password);

    void addNewUser(User user);

    void exit();
}

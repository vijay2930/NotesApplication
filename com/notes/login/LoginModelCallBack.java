package com.notes.login;

import com.notes.dto.User;

public interface LoginModelCallBack {

    void checkLoginCredential(String email, String password);

    void addNewUser(User user);

    void exit();
}

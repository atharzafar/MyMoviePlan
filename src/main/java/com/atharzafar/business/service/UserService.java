package com.suryaditya.business.service;

import com.suryaditya.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}

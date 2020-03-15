package com.customer.api.domain.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public String getUser() {
        return "UserApiV1";
    }
}

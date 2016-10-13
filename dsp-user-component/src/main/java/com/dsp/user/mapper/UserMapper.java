package com.dsp.user.mapper;

import java.util.List;
import java.util.Set;

import com.dsp.model.User;

public interface UserMapper {

    List<User> findList();

    Set<String> findRoles(String username);

    Set<String> findPermissions(String username);


    User findByUsername(String username);
}

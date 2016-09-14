package com.dsp.user.mapper;

import java.util.List;

import org.springframework.stereotype.Component;

import com.dsp.model.User;

public interface UserMapper {
	public List<User> findList();
}

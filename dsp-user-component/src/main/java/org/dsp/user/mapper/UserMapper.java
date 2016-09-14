package org.dsp.user.mapper;

import java.util.List;

import org.dsp.model.User;
import org.springframework.stereotype.Component;

public interface UserMapper {
	public List<User> findList();
}

package net.project.springboot.service;

import net.project.springboot.model.User;
import net.project.springboot.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);
}
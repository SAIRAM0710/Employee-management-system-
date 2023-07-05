package net.project.springboot.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.project.springboot.model.Role;
import net.project.springboot.model.User;
import net.project.springboot.repository.UserRepository;
import net.project.springboot.web.dto.UserRegistrationDto;

@Service
public class UserServiceImpl implements UserService{
	
	
	private UserRepository userRepository;
	
	
	

	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}




	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), 
				registrationDto.getLastName(), registrationDto.getEmail(),
			registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}
}
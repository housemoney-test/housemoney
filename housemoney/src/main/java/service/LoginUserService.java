package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.User;
import form.LoginUserForm;
import mapper.UserMapper;

@Service
public class LoginUserService {

	@Autowired
	private UserMapper mapper;
	
	@Transactional
	public User login(LoginUserForm form) {
		User entity = new User();
		entity.setName(form.getName());
		entity.setPassword(form.getPassword());
		
		return mapper.login(entity);
		
	}
}

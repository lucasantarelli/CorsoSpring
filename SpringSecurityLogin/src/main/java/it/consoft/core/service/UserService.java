package it.consoft.core.service;

import it.consoft.core.model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}

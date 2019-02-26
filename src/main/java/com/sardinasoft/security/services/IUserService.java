package com.sardinasoft.security.services;

import com.sardinasoft.security.error.UserAlreadyExistException;
import com.sardinasoft.security.model.User;
import com.sardinasoft.security.user.dto.UserDto;

public interface IUserService {
	
	User registerNewUserAccount(UserDto accountDto) throws UserAlreadyExistException;

    User getUser(String verificationToken);

    void saveRegisteredUser(User user);

    void deleteUser(User user);

}

package com.sardinasoft.security.user.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sardinasoft.security.validators.PasswordMatches;
import com.sardinasoft.security.validators.ValidEmail;

import javax.validation.constraints.Email;

@PasswordMatches
public class UserDto {
	@NotNull
    @NotEmpty
    @Size(min = 1, message = "{Size.userDto.firstName}")
    private String firstName;
     
    @NotNull
    @NotEmpty
    @Size(min = 1, message = "{Size.userDto.lastName}")
    private String lastName;
     
    @NotNull
    @NotEmpty
    private String password;
    
    @NotNull
    @Size(min = 1)
    private String matchingPassword;
     
    @NotNull
    @NotEmpty
    @Email
    @ValidEmail
    @Size(min = 1, message = "{Size.userDto.email}")
    private String email;
    
    private boolean isUsing2FA;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMatchingPassword() {
		return matchingPassword;
	}

	public void setMatchingPassword(String matchingPassword) {
		this.matchingPassword = matchingPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isUsing2FA() {
		return isUsing2FA;
	}

	public void setUsing2FA(boolean isUsing2FA) {
		this.isUsing2FA = isUsing2FA;
	}
    
}

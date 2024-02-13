package com.matrimonyapplication.service.impl;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.matrimonyapplication.dto.UserDto;

@Service
public class UserServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// write your logic here
		return null;
	}

	public UserDto authenticateUser(String email, String password) {
		// write your logic here
		return null;
	}

	public UserDto getUserProfile(Long userId) {
		// write your logic here
		return null;
	}

	public UserDto updateUserProfile(Long userId, UserDto userDto) {
		// write your logic here
		return null;
	}

	public void deleteUser(Long userId) {
		// write your logic here
	}

	public List<UserDto> findMatches(Long userId) {
		// write your logic here
		return null;
	}

	public UserDto registerUser(UserDto userDto) {
		// write your logic here
		return null;
	}
}
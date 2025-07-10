package com.matrimonyapplication.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matrimonyapplication.dto.UserDto;
import com.matrimonyapplication.entity.AuthRequest;

@RestController
@RequestMapping("/api/users")
public class UserController {

	@PostMapping("/login")
	public String authenticateAndGetToken(@RequestBody AuthRequest authRequest) {
		// write your logic here
		return null;
	}

	@PostMapping("/register")
	public ResponseEntity<UserDto> registerUser(@RequestBody UserDto userDto) {
		// write your logic here
		return null;
	}

	@GetMapping("/profile/{userId}")
	public ResponseEntity<UserDto> getUserProfile(@PathVariable Long userId) {
		// write your logic here
		return null;
	}

	@PutMapping("/profile")
	public ResponseEntity<UserDto> updateUserProfile(@RequestParam Long userId, @RequestBody UserDto userDto) {
		// write your logic here
		return null;
	}

	@DeleteMapping
	public ResponseEntity<?> deleteUser(@RequestParam Long userId) {
		// write your logic here
		return null;
	}

	@GetMapping("/matches")
	public ResponseEntity<List<UserDto>> findMatches(@RequestParam Long userId) {
		// write your logic here
		return null;
	}
}
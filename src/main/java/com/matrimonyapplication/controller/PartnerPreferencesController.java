package com.matrimonyapplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matrimonyapplication.dto.PartnerPreferencesDto;

@RestController
@RequestMapping("/api/preferences")
public class PartnerPreferencesController {

	@PostMapping
	public ResponseEntity<PartnerPreferencesDto> createPreferences(
			@RequestBody PartnerPreferencesDto partnerPreferencesDto, @RequestParam Long userId) {
		// write your logic here
		return null;
	}

	@GetMapping
	public ResponseEntity<PartnerPreferencesDto> getPreferences(@RequestParam Long userId) {
		// write your logic here
		return null;
	}

	@PutMapping
	public ResponseEntity<PartnerPreferencesDto> updatePreferences(@RequestParam Long userId,
			@RequestBody PartnerPreferencesDto partnerPreferencesDto) {
		// write your logic here
		return null;
	}

	@DeleteMapping
	public ResponseEntity<?> deletePreferences(@RequestParam Long userId) {
		// write your logic here
		return null;
	}
}
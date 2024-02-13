package com.matrimonyapplication.entity;

public class PartnerPreferences {

	private Long id;

	private Integer preferredAgeStart;

	private Integer preferredAgeEnd;

	private String preferredGender;

	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPreferredAgeStart() {
		return preferredAgeStart;
	}

	public void setPreferredAgeStart(Integer preferredAgeStart) {
		this.preferredAgeStart = preferredAgeStart;
	}

	public Integer getPreferredAgeEnd() {
		return preferredAgeEnd;
	}

	public void setPreferredAgeEnd(Integer preferredAgeEnd) {
		this.preferredAgeEnd = preferredAgeEnd;
	}

	public String getPreferredGender() {
		return preferredGender;
	}

	public void setPreferredGender(String preferredGender) {
		this.preferredGender = preferredGender;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
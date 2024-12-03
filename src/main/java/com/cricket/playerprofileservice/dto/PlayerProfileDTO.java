package com.cricket.playerprofileservice.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class PlayerProfileDTO {
	
	private String firstName;
	private String lastName;
	@JsonFormat(pattern = "MM-dd-yyyy")
	private LocalDate dateOfBirth;
	private String strength;
	private int jerseyNo;
	private int age;
	private String magicID;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMagicID() {
		return magicID;
	}
	public void setMagicID(String magicID) {
		this.magicID = magicID;
	}
	public PlayerProfileDTO(String firstName, String lastName, LocalDate dateOfBirth, String strength, int jerseyNo,
			int age, String magicID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.strength = strength;
		this.jerseyNo = jerseyNo;
		this.age = age;
		this.magicID = magicID;
	}
	public PlayerProfileDTO(String firstName, String lastName, LocalDate dateOfBirth, String strength, int jerseyNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.strength = strength;
		this.jerseyNo = jerseyNo;
	}
	public PlayerProfileDTO() {
	}
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
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getStrength() {
		return strength;
	}
	public void setStrength(String strength) {
		this.strength = strength;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	
	

}

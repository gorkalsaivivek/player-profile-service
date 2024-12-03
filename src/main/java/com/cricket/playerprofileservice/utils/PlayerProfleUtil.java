package com.cricket.playerprofileservice.utils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cricket.playerprofileservice.dto.PlayerProfileDTO;
import com.cricket.playerprofileservice.entity.PlayerProfileEntity;

@Component
public class PlayerProfleUtil {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public int findAge(LocalDate dob) {
		return (int) ChronoUnit.YEARS.between(dob,LocalDate.now());
	}
	
	public String findMagicID(String firstName, String lastName, LocalDate dob) {
		return firstName.substring(0,3)+lastName.substring(0,3)+dob.getDayOfMonth();
	}
	
	
	public PlayerProfileDTO toDTO(PlayerProfileEntity entity) {
	    return modelMapper.map(entity, PlayerProfileDTO.class);
	}

	public PlayerProfileEntity toEntity(PlayerProfileDTO dto) {
	    return modelMapper.map(dto, PlayerProfileEntity.class);
	}
	
}

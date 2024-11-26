package com.cricket.playerprofileservice.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cricket.playerprofileservice.client.ScoreTrackingFeignClient;
import com.cricket.playerprofileservice.dto.PlayerProfileDTO;
import com.cricket.playerprofileservice.dto.ScoreTrackerDTO;
import com.cricket.playerprofileservice.entity.PlayerProfileEntity;
import com.cricket.playerprofileservice.repository.PlayerProfileRepository;
import com.cricket.playerprofileservice.utils.PlayerProfleUtil;
@Service
public class PlayerProfileService {
	
	@Autowired
	PlayerProfileRepository playerProfileRepository;
	
	@Autowired
	PlayerProfleUtil playerProfleUtil;
	
	@Autowired
	ScoreTrackingFeignClient scoreTrackingFeignClient;

	public PlayerProfileDTO saveOrUpdate(PlayerProfileEntity playerProfileEntity) {
		
		return playerProfleUtil.toDTO(playerProfileRepository.save(playerProfileEntity));
	}
	
	
	public List<PlayerProfileDTO> getAllPlayers(){
		 List<PlayerProfileEntity> returnedList=  playerProfileRepository.findAll();
		 List<PlayerProfileDTO> dtoList= new ArrayList<PlayerProfileDTO>();
		 for(PlayerProfileEntity entity:returnedList) {
			 dtoList.add(playerProfleUtil.toDTO(entity));
		 }
		 return dtoList;
	}
	
	public PlayerProfileEntity findByMagicID(String magicId) {
		return playerProfileRepository.findByMagicID(magicId);
		
	}


	public void deletePlayerUsingMagicId(PlayerProfileEntity playerProfileEntity) {
		playerProfileRepository.delete(playerProfileEntity);
		
	}
	
	public ScoreTrackerDTO callScoreTracker(String magicId) {
		return scoreTrackingFeignClient.getPlayerByMagicId(magicId);
	}

}

package com.cricket.playerprofileservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.playerprofileservice.dto.PlayerDTO;
import com.cricket.playerprofileservice.dto.PlayerProfileDTO;
import com.cricket.playerprofileservice.dto.ScoreTrackerDTO;
import com.cricket.playerprofileservice.entity.PlayerProfileEntity;
import com.cricket.playerprofileservice.service.PlayerProfileService;
import com.cricket.playerprofileservice.utils.PlayerProfleUtil;

@RestController
public class PlayerProfileController {
	
	@Autowired
	PlayerProfileService playerProfileService;
	
	@Autowired
	PlayerProfleUtil playerProfleUtil;
	
	@PostMapping(path = "/addPlayer")
	public PlayerProfileDTO addProfiles(@RequestBody PlayerProfileDTO playerProfileDTO) {
		PlayerProfileEntity playerProfileEntity=new PlayerProfileEntity();
		
		playerProfileEntity.setFirstName(playerProfileDTO.getFirstName());
		playerProfileEntity.setLastName(playerProfileDTO.getLastName());
		playerProfileEntity.setDateOfBirth(playerProfileDTO.getDateOfBirth());
		playerProfileEntity.setStrength(playerProfileDTO.getStrength());
		int playerAge=playerProfleUtil.findAge(playerProfileDTO.getDateOfBirth());
		String playerMagicID=playerProfleUtil.findMagicID(playerProfileDTO.getFirstName(),playerProfileDTO.getLastName(),playerProfileDTO.getDateOfBirth());
		playerProfileEntity.setAge(playerAge);
		//playerProfileDTO.setAge(playerAge);
		playerProfileEntity.setJerseyNo(playerProfileDTO.getJerseyNo());
		playerProfileEntity.setMagicID(playerMagicID.toLowerCase());
		//playerProfileDTO.setMagicID(playerMagicID.toLowerCase());
		playerProfileService.saveOrUpdate(playerProfileEntity);
		return playerProfleUtil.toDTO(playerProfileEntity);
	}
	@GetMapping(path = "/getPlayers")
	public ResponseEntity<List<PlayerProfileDTO>> getPlayersProfiles () {
		List<PlayerProfileDTO> dtoList=playerProfileService.getAllPlayers();
		return ResponseEntity.ok(dtoList);
		
	}
	
	@PutMapping(path = "/editPlayer")
	public PlayerProfileDTO editProfiles(@RequestBody PlayerProfileDTO playerProfileDTO) {
		PlayerProfileEntity playerProfileEntity=playerProfileService.findByMagicID(playerProfileDTO.getMagicID());
		
		if(playerProfileDTO.getFirstName()!=null) {
			playerProfileEntity.setFirstName(playerProfileDTO.getFirstName());
		}
		if(playerProfileDTO.getLastName()!=null) {
			playerProfileEntity.setLastName(playerProfileDTO.getLastName());
		}
		if(playerProfileDTO.getStrength()!=null) {
			playerProfileEntity.setStrength(playerProfileDTO.getStrength());
		}
		if(playerProfileDTO.getDateOfBirth()!=null) {
			playerProfileEntity.setDateOfBirth(playerProfileDTO.getDateOfBirth());
		}
		if(playerProfileDTO.getJerseyNo()!=0) {
			playerProfileEntity.setJerseyNo(playerProfileDTO.getJerseyNo());
		}
		return playerProfileService.saveOrUpdate(playerProfileEntity);
	}
	
	@DeleteMapping("/getPlayers/{magicId}")
	public PlayerProfileDTO deletePlayer (@PathVariable String  magicId) {
	PlayerProfileEntity playerProfileEntity=playerProfileService.findByMagicID(magicId);
	playerProfileService.deletePlayerUsingMagicId(playerProfileEntity);
	return playerProfleUtil.toDTO(playerProfileEntity);
	}

	@GetMapping(path = "/getBothData/{magicId}")
	public ResponseEntity<PlayerDTO> getBothPlayersProfiles (@PathVariable String  magicId) {
		PlayerProfileEntity playerProfileEntity=playerProfileService.findByMagicID(magicId);
		PlayerProfileDTO playerProfileDTO=playerProfleUtil.toDTO(playerProfileEntity);
		ScoreTrackerDTO scoreTrackerDTO=playerProfileService.callScoreTracker(magicId);
		
		PlayerDTO playerDTO=new PlayerDTO();
		playerDTO.setPlayerProfileDTO(playerProfileDTO);
		playerDTO.setScoreTrackerDTO(scoreTrackerDTO);
		
		return ResponseEntity.ok(playerDTO);
		
	}
	
}

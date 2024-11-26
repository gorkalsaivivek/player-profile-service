package com.cricket.playerprofileservice.dto;

public class PlayerDTO {
	private PlayerProfileDTO playerProfileDTO;
	private ScoreTrackerDTO scoreTrackerDTO;
	public PlayerProfileDTO getPlayerProfileDTO() {
		return playerProfileDTO;
	}
	public void setPlayerProfileDTO(PlayerProfileDTO playerProfileDTO) {
		this.playerProfileDTO = playerProfileDTO;
	}
	public ScoreTrackerDTO getScoreTrackerDTO() {
		return scoreTrackerDTO;
	}
	public void setScoreTrackerDTO(ScoreTrackerDTO scoreTrackerDTO) {
		this.scoreTrackerDTO = scoreTrackerDTO;
	}
	

}

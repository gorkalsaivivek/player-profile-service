package com.cricket.playerprofileservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cricket.playerprofileservice.dto.ScoreTrackerDTO;


@FeignClient(name="SCORE-TRACKING-SERVICE")
public interface ScoreTrackingFeignClient {
	
	
	@GetMapping("/getScore/{magicId}")
	public ScoreTrackerDTO getPlayerByMagicId (@PathVariable String  magicId);

}

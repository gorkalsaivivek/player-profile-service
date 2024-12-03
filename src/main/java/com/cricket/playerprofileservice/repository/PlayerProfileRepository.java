package com.cricket.playerprofileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricket.playerprofileservice.entity.PlayerProfileEntity;

public interface PlayerProfileRepository extends JpaRepository<PlayerProfileEntity, Long> {
	
	PlayerProfileEntity findByMagicID(String magicID);

}

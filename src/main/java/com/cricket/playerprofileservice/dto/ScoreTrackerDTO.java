package com.cricket.playerprofileservice.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ScoreTrackerDTO {
	private Long id;
    private String magicId;
    private String opponents;
    private int noOfRunsScored;
    private int noOfBallsFaced;
    private int noOfRunsConceded;
    private int noOfWicketsTaken;
    private double noOfOversBowled;
    private int noOfCatchesTaken;
    private int noOfStumpingsTaken;
    private int noOfDirectRunoutsDone;
    private double noOfRunoutsWithTeammate;
    @JsonFormat(pattern = "MM-dd-yyyy")
    private LocalDate dateOfMatch;
    private int noOfFoursScored;
    private int noOfSixesScored;
    private Boolean isPlayerNotOut;

    public Boolean getIsPlayerNotOut() {
        return isPlayerNotOut;
    }

    public void setIsPlayerNotOut(Boolean isPlayerNotOut) {
        this.isPlayerNotOut = isPlayerNotOut;
    }
	public String getMagicId() {
		return magicId;
	}
	public void setMagicId(String magicId) {
		this.magicId = magicId;
	}
	public String getOpponents() {
		return opponents;
	}
	public void setOpponents(String opponents) {
		this.opponents = opponents;
	}
	public int getNoOfRunsScored() {
		return noOfRunsScored;
	}
	public void setNoOfRunsScored(int noOfRunsScored) {
		this.noOfRunsScored = noOfRunsScored;
	}
	public int getNoOfBallsFaced() {
		return noOfBallsFaced;
	}
	public void setNoOfBallsFaced(int noOfBallsFaced) {
		this.noOfBallsFaced = noOfBallsFaced;
	}
	public int getNoOfRunsConceded() {
		return noOfRunsConceded;
	}
	public void setNoOfRunsConceded(int noOfRunsConceded) {
		this.noOfRunsConceded = noOfRunsConceded;
	}
	public int getNoOfWicketsTaken() {
		return noOfWicketsTaken;
	}
	public void setNoOfWicketsTaken(int noOfWicketsTaken) {
		this.noOfWicketsTaken = noOfWicketsTaken;
	}
	public double getNoOfOversBowled() {
		return noOfOversBowled;
	}
	public void setNoOfOversBowled(double noOfOversBowled) {
		this.noOfOversBowled = noOfOversBowled;
	}
	public int getNoOfCatchesTaken() {
		return noOfCatchesTaken;
	}
	public void setNoOfCatchesTaken(int noOfCatchesTaken) {
		this.noOfCatchesTaken = noOfCatchesTaken;
	}
	public int getNoOfStumpingsTaken() {
		return noOfStumpingsTaken;
	}
	public void setNoOfStumpingsTaken(int noOfStumpingsTaken) {
		this.noOfStumpingsTaken = noOfStumpingsTaken;
	}
	public int getNoOfDirectRunoutsDone() {
		return noOfDirectRunoutsDone;
	}
	public void setNoOfDirectRunoutsDone(int noOfDirectRunoutsDone) {
		this.noOfDirectRunoutsDone = noOfDirectRunoutsDone;
	}
	public double getNoOfRunoutsWithTeammate() {
		return noOfRunoutsWithTeammate;
	}
	public void setNoOfRunoutsWithTeammate(double noOfRunoutsWithTeammate) {
		this.noOfRunoutsWithTeammate = noOfRunoutsWithTeammate;
	}
	public LocalDate getDateOfMatch() {
		return dateOfMatch;
	}
	public void setDateOfMatch(LocalDate dateOfMatch) {
		this.dateOfMatch = dateOfMatch;
	}
	public int getNoOfFoursScored() {
		return noOfFoursScored;
	}
	public void setNoOfFoursScored(int noOfFoursScored) {
		this.noOfFoursScored = noOfFoursScored;
	}
	public int getNoOfSixesScored() {
		return noOfSixesScored;
	}
	public void setNoOfSixesScored(int noOfSixesScored) {
		this.noOfSixesScored = noOfSixesScored;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
    
    

}

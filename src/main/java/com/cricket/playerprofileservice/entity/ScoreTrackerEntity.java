package com.cricket.playerprofileservice.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "scoretracker")
public class ScoreTrackerEntity {
	   	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "ID")
	    private Long id;

	    @Column(name = "MAGIC_ID", nullable = false, length = 20)
	    private String magicId;

	    @Column(name = "OPPONENTS", nullable = false, length = 20)
	    private String opponents;

	    @Column(name = "NO_OF_RUNS_SCORED", nullable = false)
	    private int noOfRunsScored;

	    @Column(name = "NO_OF_BALLS_FACED", nullable = false)
	    private int noOfBallsFaced;

	    @Column(name = "NO_OF_RUNS_CONCEDED", nullable = false)
	    private int noOfRunsConceded;

	    @Column(name = "NO_OF_WICKETS_TAKEN", nullable = false)
	    private int noOfWicketsTaken;

	    @Column(name = "NO_OF_OVERS_BOWLED", nullable = false)
	    private int noOfOversBowled;

	    @Column(name = "NO_OF_CATCHES_TAKEN", nullable = false)
	    private int noOfCatchesTaken;

	    @Column(name = "NO_OF_STUMPINGS_TAKEN", nullable = false)
	    private int noOfStumpingsTaken;

	    @Column(name = "NO_OF_DIRECT_RUNOUTS_DONE", nullable = false)
	    private int noOfDirectRunoutsDone;

	    @Column(name = "NO_OF_RUNOUTS_WITH_TEAMMATE", nullable = false)
	    private double noOfRunoutsWithTeammate;

	    @Column(name = "DATE_OF_MATCH", nullable = false)
	    private LocalDate dateOfMatch;

	    @Column(name = "IS_PLAYER_NOT_OUT", nullable = false)
	    private boolean isPlayerNotOut;

	    @Column(name = "NO_OF_FOURS_SCORED", nullable = false)
	    private int noOfFoursScored;

	    @Column(name = "NO_OF_SIXES_SCORED", nullable = false)
	    private int noOfSixesScored;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
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

		public int getNoOfOversBowled() {
			return noOfOversBowled;
		}

		public void setNoOfOversBowled(int noOfOversBowled) {
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

		public boolean isPlayerNotOut() {
			return isPlayerNotOut;
		}

		public void setPlayerNotOut(boolean isPlayerNotOut) {
			this.isPlayerNotOut = isPlayerNotOut;
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
	    
	    
}

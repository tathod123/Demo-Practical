package com.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class IdentityCard {
	
	@Id
	private  int AdhardCard;
	private int PanCard;
	

	private int VotingCard;
	@OneToOne
	private Person person;
	
	public Person getPerson() {
		return person;
	}
	public IdentityCard(int adhardCard, int panCard, int votingCard, Person person) {
		super();
		AdhardCard = adhardCard;
		PanCard = panCard;
		VotingCard = votingCard;
		this.person = person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}


	public int getAdhardCard() {
		return AdhardCard;
	}


	public void setAdhardCard(int adhardCard) {
		AdhardCard = adhardCard;
	}


	public int getPanCard() {
		return PanCard;
	}


	public void setPanCard(int panCard) {
		PanCard = panCard;
	}


	public int getVotingCard() {
		return VotingCard;
	}


	public void setVotingCard(int votingCard) {
		VotingCard = votingCard;
	}


	public IdentityCard() {
		super();
		// TODO Auto-generated constructor stub
	}


	public IdentityCard(int adhardCard, int panCard, int votingCard) {
		super();
		AdhardCard = adhardCard;
		PanCard = panCard;
		VotingCard = votingCard;
	}


	@Override
	public String toString() {
		return "IdentityCard [AdhardCard=" + AdhardCard + ", PanCard=" + PanCard + ", VotingCard=" + VotingCard
				+ ", person=" + person + "]";
	}
	
	
	

}

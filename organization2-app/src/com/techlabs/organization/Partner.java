package com.techlabs.organization;

import java.util.List;

public class Partner {

	private int partnerId;
	private String name;
	private double companyTurnOver;
	private int empStrength;
	private List<Talent> talentList;

	public Partner(int partnerId, String name, double companyTurnOver, int empStrength, List<Talent> talentList) {
		this.partnerId = partnerId;
		this.name = name;
		this.companyTurnOver = companyTurnOver;
		this.empStrength = empStrength;
		this.talentList = talentList;
	}

	public final int getPartnerId() {
		return partnerId;
	}

	public final String getName() {
		return name;
	}

	public final double getCompanyTurnOver() {
		return companyTurnOver;
	}

	public final int getEmpStrength() {
		return empStrength;
	}

	public final List<Talent> getTalentList() {
		return talentList;
	}

	public void addTalent(Talent talent) {
		talentList.add(talent);
	}

	@Override
	public String toString() {
		return "Partner [partnerId=" + partnerId + ", name=" + name + ", companyTurnOver=" + companyTurnOver
				+ ", empStrength=" + empStrength + ", talentList=" + talentList + "]";
	}

}

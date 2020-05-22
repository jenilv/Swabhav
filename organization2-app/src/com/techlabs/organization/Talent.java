package com.techlabs.organization;

public class Talent {

	private int talentId;
	private String name;
	private String partner;

	public Talent(int talentId, String name, String partner) {
		this.talentId = talentId;
		this.name = name;
		this.partner = partner;
	}

	public final int getTalentId() {
		return talentId;
	}

	public final String getName() {
		return name;
	}

	public final String getPartner() {
		return partner;
	}

	@Override
	public String toString() {
		return "Talent [talentId=" + talentId + ", name=" + name + ", partner=" + partner + "]";
	}

}

package com.techlabs.organization;

import java.util.Date;
import java.util.List;

public class Organization {

	private String organizationId;
	private String organizationName;
	private Date registrationDate;
	private List<Talent> talentList;
	private List<Partner> partnerList;

	public Organization(String organizationId, String organizationName, Date registrationDate, List<Talent> talentList,
			List<Partner> partnerList) {
		this.organizationId = organizationId;
		this.organizationName = organizationName;
		this.registrationDate = registrationDate;
		this.talentList = talentList;
		this.partnerList = partnerList;
	}

	public final String getOrganizationId() {
		return organizationId;
	}

	public final String getOrganizationName() {
		return organizationName;
	}

	public final Date getRegistrationDate() {
		return registrationDate;
	}

	public final List<Talent> getTalentList() {
		return talentList;
	}

	public final List<Partner> getPartnerList() {
		return partnerList;
	}

	public void addTalent(Talent talentToAdd) {
		boolean doesExist = false;
		for (Talent talent : talentList) {
			if (talent.getName().equals(talentToAdd.getName())) {
				doesExist = true;
			}
		}
		if (!doesExist) {
			talentList.add(talentToAdd);
		}
	}

	public void addPartner(Partner partnerToAdd) {
		boolean doesExist = false;
		for (Partner partner : partnerList) {
			if (partner.getName().equals(partnerToAdd.getName())) {
				doesExist = true;
			}
		}
		if (!doesExist) {
			partnerList.add(partnerToAdd);
		}
	}

	public Talent searchTalent(String talentName) {
		for (Talent talent : talentList) {
			if (talent.getName().equalsIgnoreCase(talentName)) {
				return talent;
			}
		}
		return null;
	}

	public Partner searchPartner(String partnerName) {
		for (Partner partner : partnerList) {
			if (partner.getName().equalsIgnoreCase(partnerName)) {
				return partner;
			}
		}
		return null;
	}

//	use org id UUID format
//	search for parner and talent
}

package com.techlabs.organization.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.techlabs.organization.Organization;
import com.techlabs.organization.Partner;
import com.techlabs.organization.Talent;

public class OrganizationTest {

	public static void main(String[] args) {

		Partner partner = new Partner(1, "Partner1", 100000, 2, new ArrayList<Talent>());
		partner.addTalent(new Talent(1, "J", partner.getName()));
		partner.addTalent(new Talent(2, "V", partner.getName()));

		Talent talent = new Talent(3, "JJ", "Partner2");
		Talent talent2 = new Talent(4, "VV", "Partner3");

		List<Talent> talents = new ArrayList<Talent>();
		talents.add(talent);
		talents.add(talent2);

		Organization organization = new Organization(UUID.randomUUID().toString(), "JVOrg", new Date(), talents,
				new ArrayList<>(List.of(partner)));

		printOrg(organization);
		System.out.println(organization.searchPartner("partner1"));
	}

	private static void printOrg(Organization organization) {
		System.out.println("Organization id: " + organization.getOrganizationId());
		System.out.println("Organization name: " + organization.getOrganizationName());
		System.out.println("Organization registration date: " + organization.getRegistrationDate());
		System.out.println("Organization Talents: ");
		for (Talent talent : organization.getTalentList()) {
			System.out.println(talent.toString());
		}
	}
}

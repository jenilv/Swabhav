package com.techlabs.organization.test;

import com.techlabs.organization.Organization;

public class OrganizationTest {

	public static void main(String[] args) {

		Organization organization1 = new Organization(400, "Swabhav", "Andheri");
		organization1.addPartner("AurionPro");
		organization1.addPartner("Myself");

		Organization organization2 = new Organization(401, "Some Organization", "Vile Parle");
		organization2.addPartner("Swabhav Techlabs");

		printinfo(organization1);
		System.out.println("----------");
		printinfo(organization2);
	}

	private static void printinfo(Organization organization) {

		System.out.println("Organization id: " + organization.getId());
		System.out.println("Organization name: " + organization.getName());
		System.out.println("Organization address: " + organization.getAddress());
		System.out.println("Organization count: " + organization.count());
		System.out.println("Organization partners: " + organization.getPartners());
	}

}

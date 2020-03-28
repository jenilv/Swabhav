package com.techlabs.organization;

import java.util.ArrayList;
import java.util.List;

public class Organization {

	private int id;
	private String name;
//	private String[] partners;
	private List<String> partners;
	private String address;

	public Organization(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

//	public String[] getPartners() {
//		return partners;
//	}

	public List<String> getPartners() {
		return partners;
	}

	public String getAddress() {
		return address;
	}

	public int count() {
		return partners != null ? partners.size() : 0;
	}

//	public void addPartner(String partner) {
//		if (partners == null) {
//			partners = new String[] { partner };
//		} else {
//
//			String[] newPartners = new String[partners.length + 1];
//			for (int i = 0; i < partners.length; i++) {
//				newPartners[i] = partners[i];
//			}
//
//			newPartners[newPartners.length - 1] = partner;
//			partners = newPartners;
//		}
//	}

	public void addPartner(String partner) {
		if (partners == null) {
			partners = new ArrayList<>();
		}

		partners.add(partner);
	}
}

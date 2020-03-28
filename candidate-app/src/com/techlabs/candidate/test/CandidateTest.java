package com.techlabs.candidate.test;

import com.techlabs.candidate.Candidate;
import com.techlabs.candidate.CreditPoint;

public class CandidateTest {

	public static void main(String[] args) {

		Candidate jenil = new Candidate(1, "Jenil", 20, CreditPoint.B);
		printInfo(jenil);
		System.out.println("--------");
		Candidate jen = new Candidate(2, "Jen", 22, CreditPoint.A);
		printInfo(jen);
		System.out.println("--------");
		jenil.whoIsBetter(jen);

//		what is annotations?
//		types of annotations
//		how reflection can help in finding out annotations present in method?
// 		4,5,6 of headfirst java

	}

	private static void printInfo(Candidate candidate) {

		System.out.println("Candidate id: " + candidate.getId());
		System.out.println("Candidate name: " + candidate.getName());
		System.out.println("Candidate age: " + candidate.getAge());
		System.out.println("Candidate credit point: " + candidate.getCreditPoint());
	}
}

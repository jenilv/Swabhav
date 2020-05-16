package com.techlab.guitar;

public enum Wood {

	INDIAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, MAHOGANY, MAPLE, COCOBOLO;

	@Override
	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "Indian Rosewood";
		case BRAZILIAN_ROSEWOOD:
			return "Brazilian Rosewood";
		case MAHOGANY:
			return "Mahogany";
		case MAPLE:
			return "Maple";
		case COCOBOLO:
			return "Cocobolo";

		default:
			return "";
		}
	}
}

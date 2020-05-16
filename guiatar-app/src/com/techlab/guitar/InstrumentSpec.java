package com.techlab.guitar;

public abstract class InstrumentSpec {

	private Builder builder;
	private String model;
	private Type type;
	private Wood backWood;
	private Wood topWood;

	public InstrumentSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
	}

	public final Builder getBuilder() {
		return builder;
	}

	public final String getModel() {
		return model;
	}

	public final Type getType() {
		return type;
	}

	public final Wood getBackWood() {
		return backWood;
	}

	public final Wood getTopWood() {
		return topWood;
	}

	public boolean matches(InstrumentSpec otherSpec) {
		if (builder != otherSpec.builder) {
			return false;
		}
		if ((model != null) && (!model.equals("")) && (!model.equals(otherSpec.model))) {
			return false;
		}
		if (type != otherSpec.type) {
			return false;
		}
		if (backWood != otherSpec.backWood) {
			return false;
		}
		if (topWood != otherSpec.topWood) {
			return false;
		}
		return true;
	}
}

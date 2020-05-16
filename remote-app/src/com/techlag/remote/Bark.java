package com.techlag.remote;

public class Bark {

	private String sound;

	public Bark(String sound) {
		this.sound = sound;
	}

	public final String getSound() {
		return sound;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sound == null) ? 0 : sound.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bark other = (Bark) obj;
		if (sound == null) {
			if (other.sound != null)
				return false;
		} else if (!sound.equals(other.sound))
			return false;
		return true;
	}

}

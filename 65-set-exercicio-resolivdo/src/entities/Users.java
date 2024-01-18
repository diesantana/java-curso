package entities;

import java.time.Instant;
import java.util.Objects;

public class Users {
	private String name;
	private Instant date;
	
	public Users() {
	}
	
	public Users(String name, Instant date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public Instant getDate() {
		return date;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Users other = (Users) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "name = " + name + ", date = " + date ;
	}
	
	
}

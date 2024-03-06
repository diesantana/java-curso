package entities;

import java.time.Instant;
import java.util.Objects;

public class LogEntry {
	private String username;
	private Instant moment;
	
	public LogEntry(String username, Instant date) {
		this.username = username;
		this.moment = date;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Instant getDate() {
		return moment;
	}

	public void setDate(Instant date) {
		this.moment = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		return Objects.equals(username, other.username);
	}

	@Override
	public String toString() {
		return "username: " + username + ", date: " + moment;
	}
	
	
	
	
	
}

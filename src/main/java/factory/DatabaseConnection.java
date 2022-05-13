package factory;

public class DatabaseConnection {
	String url = "AWS_DB_URI";
	String username = "batman";
	String password = "AWS_PASSWORD";
	
	public String getUrl() {
		return url;
	}

	public String getUser() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}

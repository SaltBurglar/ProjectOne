package factory;

public class DatabaseConnection {
	String url = "jdbc:postgresql://datamaster.cpmdw3ymjnl3.us-east-1.rds.amazonaws.com:5432/genesis";
	String username = "batman";
	String password = "Ctmo0105";
	
	public String getUrl() {
		return url;
	}

	public String getUser() {
		return username;
	}

	public String getPassword() {
		return password;
	}	
}

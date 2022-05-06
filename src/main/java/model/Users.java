package model;

	public class Users {
		
	public Users(){}
	
	public Users(int usersId, String username, String password, String firstName, String lastName, String email,
				int roleId) {
			super();
			this.usersId = usersId;
			this.username = username;
			this.password = password;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.roleId = roleId;
		}
	
	protected int usersId;
	protected String username;
	protected String password;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected int roleId;
	
	public int getUsersId() {
		return usersId;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}

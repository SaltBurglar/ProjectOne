package model;

public class UserRole {
	
	protected int roleId;
	protected String userRole;
	
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	protected UserRole() {
		
		
	}
	
	public UserRole(int roleId, String userRole) {
		this.roleId = roleId;
		this.userRole = userRole;
	}

	@Override
	public String toString() {
		return "UserRole [roleId=" + roleId + ", userRole=" + userRole + "]";
	}


	
}

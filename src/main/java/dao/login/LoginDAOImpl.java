package dao.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import factory.*;
import model.Users;

public class LoginDAOImpl {
	
	static {
	      try {
	          Class.forName("org.postgresql.Driver");
	      }catch(ClassNotFoundException e) {
	          e.printStackTrace();
	          System.out.println("Static block has failed me");
	      }
	}
	
	DatabaseConnection db = new DatabaseConnection();
	
	public int isValidLogin(String username, String password) {
		int role = -1;
		try(Connection conn = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword())){
			
			String sql = "SELECT role_id FROM project01.users WHERE username = ? AND pass = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
		
			
			while (rs.next()) {
				System.out.println(role);
				role = rs.getInt(1);
				System.out.println(role);
			}
			return role;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return role;
		
	}
	
	
	
	public ArrayList<Users> getLogin(String username, String password) {
		ArrayList<Users> arrList = new ArrayList<Users>();
		try(Connection conn = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword())){
			
			String sql = "SELECT * FROM project01.users WHERE username = ? AND pass = ?;";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			
			
			while (rs.next()) {
				Users usr = new Users(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
				arrList.add(usr);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrList;
		
	}
}

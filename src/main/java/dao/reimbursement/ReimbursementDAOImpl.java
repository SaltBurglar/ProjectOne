package dao.reimbursement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import factory.DatabaseConnection;
import model.Reimbursement;

public class ReimbursementDAOImpl implements ReimbursementDAO {
	
	DatabaseConnection db = new DatabaseConnection();
	
	static {
	      try {
	          Class.forName("org.postgresql.Driver");
	      }catch(ClassNotFoundException e) {
	          e.printStackTrace();
	          System.out.println("Static block has failed me");
	      }
	}
	
	public ArrayList<Reimbursement> selectAllReimbursementsByThisUser(int author) {
		ArrayList<Reimbursement> arrList = new ArrayList<Reimbursement>();
		try(Connection conn = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword())){
			String sql = "SELECT * FROM project01.reimbursement WHERE author = ?";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, author);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Reimbursement reimb = new Reimbursement(rs.getInt("s_id"), rs.getInt("amount"),
						rs.getTimestamp("submitted"), rs.getString("description"),
						rs.getInt("author"), rs.getInt("status_id"), rs.getInt("type_id"));
				arrList.add(reimb);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrList;
	}
	
	public ArrayList<Reimbursement> selectAllReimbursements(){
		ArrayList<Reimbursement> arrList = new ArrayList<Reimbursement>();
		
		try(Connection conn = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword())){
			String sql = "SELECT * FROM project01.reimbursement ORDER BY s_id ASC";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){ 
				Reimbursement reimb = new Reimbursement(rs.getInt("s_id"), rs.getInt("amount"),
						rs.getTimestamp("submitted"), rs.getString("description"),
						rs.getInt("author"), rs.getInt("status_id"), rs.getInt("type_id"));
				arrList.add(reimb);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrList;
	}
	
	public ArrayList<Reimbursement> selectUnresolvedReimbursements(){
		ArrayList<Reimbursement> arrList = new ArrayList<Reimbursement>();
		
		try(Connection conn = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword())){
			String sql = "SELECT * FROM project01.reimbursement WHERE status_id = 0";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){ 
				Reimbursement reimb = new Reimbursement(rs.getInt("s_id"), rs.getInt("amount"),
						rs.getTimestamp("submitted"), rs.getString("description"),
						rs.getInt("author"), rs.getInt("status_id"), rs.getInt("type_id"));
				arrList.add(reimb);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrList;
	}
	
	public ArrayList<Reimbursement> selectApprovedReimbursements(){
		ArrayList<Reimbursement> arrList = new ArrayList<Reimbursement>();
		
		try(Connection conn = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword())){
			String sql = "SELECT * FROM project01.reimbursement WHERE status_id = 1";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){ 
				Reimbursement reimb = new Reimbursement(rs.getInt("s_id"), rs.getInt("amount"),
						rs.getTimestamp("submitted"), rs.getString("description"),
						rs.getInt("author"), rs.getInt("status_id"), rs.getInt("type_id"));
				arrList.add(reimb);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrList;
	}
	
	public ArrayList<Reimbursement> selectRejectedReimbursements(){
		ArrayList<Reimbursement> arrList = new ArrayList<Reimbursement>();
		
		try(Connection conn = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword())){
			String sql = "SELECT * FROM project01.reimbursement WHERE status_id = 2";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){ 
				Reimbursement reimb = new Reimbursement(rs.getInt("s_id"), rs.getInt("amount"),
						rs.getTimestamp("submitted"), rs.getString("description"),
						rs.getInt("author"), rs.getInt("status_id"), rs.getInt("type_id"));
				arrList.add(reimb);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arrList;
	}

	public void updateReimbursements(String status, String id) {
		try(Connection conn = DriverManager.getConnection(db.getUrl(), db.getUser(), db.getPassword())){
			String sql = "UPDATE project01.reimbursement SET status_id = CAST(? AS int) WHERE s_id = CAST(? AS int)";
			
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, status);
			ps.setString(2, id);
			ps.executeUpdate();

			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
}

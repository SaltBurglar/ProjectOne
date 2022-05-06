package service.login;

import java.util.ArrayList;

import dao.login.*;
import model.Users;

public class LoginServiceImpl implements LoginService {
	LoginDAOImpl loginDAO = new LoginDAOImpl();
	
	public int isValidLogin(String username, String password) {
		return loginDAO.isValidLogin(username, password);
		
	}
	
	public ArrayList<Users> getLogin(String username, String password){
		return loginDAO.getLogin(username, password);
	}


}

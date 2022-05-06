package service.login;

import java.util.ArrayList;

import model.Users;

public interface LoginService {
	public int isValidLogin(String username, String password);

	public ArrayList<Users> getLogin(String username, String password);
}

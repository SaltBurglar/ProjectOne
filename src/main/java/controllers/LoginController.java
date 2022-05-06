package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Users;
import service.login.LoginServiceImpl;


public class LoginController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	static LoginServiceImpl login = new LoginServiceImpl();
	
	public static void isValidLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException{
		
		String myPath = "";
		int role = login.isValidLogin(req.getParameter("myUsername"), req.getParameter("myPassword"));
		System.out.println(role);
		if (role == 1)
		{
			myPath = "/menu/employee.html";
			req.getRequestDispatcher(myPath).forward(req, resp);
		}
		else if (role == 2) {
			myPath = "/menu/manager.html";
			req.getRequestDispatcher(myPath).forward(req, resp);
		}
		else{
			myPath = "/badlogin.html";
			req.getRequestDispatcher(myPath).forward(req, resp);		
				
		}
//		
//		else {
//			int role = arrList.get(0).getRoleId();
//			if (role == 1) {

//			}
//			}
//		}
//		
		
	}
	

}

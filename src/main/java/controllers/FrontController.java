package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="frontcontroller", urlPatterns= {"/forwarding/*", "/employee/*", "/manager/view_all_reimbursements/*", "/manager/update_status"}) // Essentially, any time the url pattern is called, it goes through here.
public class FrontController extends HttpServlet {
	
	/*
	 * So, here goes to logic for the front controller. For now, just ship it through....
	 */
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//System.out.println("Test");
		//    resp.getWriter().println("Entered the doGet Method in Front Controller");
		Dispatcher.myVirtualRouterMethod(req, resp);
			
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//System.out.println("Test");
		//    resp.getWriter().println("Entered the doGet Method in Front Controller");
		Dispatcher.myVirtualRouterMethod(req, resp);
			
		
	}

}

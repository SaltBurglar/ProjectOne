package controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Dispatcher extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public static void myVirtualRouterMethod(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		switch(req.getRequestURI()){
			case "/ProjectOne/forwarding/login":
				LoginController.isValidLogin(req, resp);
				break;
			// There needs to be one Controller/Servlet for each of the Service to DAO Functions
			//Employee Controllers
			case "/ProjectOne/employee/past_tickets":
				ReimbursementController.showAllReimbursementsByThisUser(req, resp);
				break;
//			case "/ProjectOne/employee/add_reimbursement_request":
//				break;
//			//Finance Manager Controllers
			case "/ProjectOne/manager/view_all_reimbursements/": // Maybe make these two separate Dispatchers? There is logic needed to be implemented here.
				ReimbursementController.showAllReimbursements(req, resp);
				break;
			case "/ProjectOne/manager/view_all_reimbursements/unresolved":
				ReimbursementController.showUnresolvedReimbursements(req, resp);
				break;
			case "/ProjectOne/manager/view_all_reimbursements/approved":
				ReimbursementController.showApprovedReimbursements(req, resp);
				break;
			case "/ProjectOne/manager/view_all_reimbursements/rejected":
				ReimbursementController.showRejectedReimbursements(req, resp);
				break;
			case "/ProjectOne/manager/update_status":
				ReimbursementController.updateReimbursement(req, resp);
				break;
		}
		
	}
}
	
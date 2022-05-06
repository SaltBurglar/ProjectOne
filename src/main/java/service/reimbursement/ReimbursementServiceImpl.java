package service.reimbursement;

import java.util.ArrayList;

import dao.reimbursement.ReimbursementDAOImpl;
import model.Reimbursement;

public class ReimbursementServiceImpl implements ReimbursementService {
	static ReimbursementDAOImpl reimbDAO = new ReimbursementDAOImpl();
	
	public ArrayList<Reimbursement> showAllReimbursements() {
		return reimbDAO.selectAllReimbursements();
	}
	
	public ArrayList<Reimbursement> showAllReimbursementsByThisUser(int author) {
		return reimbDAO.selectAllReimbursementsByThisUser(author);
	}
	
	public ArrayList<Reimbursement> showUnresolvedReimbursements() {
		return reimbDAO.selectUnresolvedReimbursements();
	}
	
	public ArrayList<Reimbursement> showApprovedReimbursements() {
		return reimbDAO.selectApprovedReimbursements();
	}
	
	public ArrayList<Reimbursement> showRejectedReimbursements() {
		return reimbDAO.selectRejectedReimbursements();
	}

	public void updateReimbursements(String type, String id) {
		reimbDAO.updateReimbursements(type, id);
		
	}
}

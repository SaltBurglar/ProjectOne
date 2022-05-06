package service.reimbursement;

import java.util.ArrayList;

import model.Reimbursement;

public interface ReimbursementService {
	public ArrayList<Reimbursement> showAllReimbursements();
	public ArrayList<Reimbursement> showAllReimbursementsByThisUser(int author);
	public ArrayList<Reimbursement> showUnresolvedReimbursements();
	public ArrayList<Reimbursement> showApprovedReimbursements();
	public ArrayList<Reimbursement> showRejectedReimbursements();
	public void updateReimbursements(String status_id, String s_id);
}

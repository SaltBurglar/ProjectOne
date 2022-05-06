package dao.reimbursement;

import java.util.ArrayList;

import model.Reimbursement;

public interface ReimbursementDAO {
	public ArrayList<Reimbursement> selectAllReimbursements();
	public ArrayList<Reimbursement> selectAllReimbursementsByThisUser(int author);
	public ArrayList<Reimbursement> selectUnresolvedReimbursements();
	public ArrayList<Reimbursement> selectApprovedReimbursements();
	public ArrayList<Reimbursement> selectRejectedReimbursements();
	public void updateReimbursements(String type, String id);
}

package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Reimbursement;
import service.reimbursement.ReimbursementServiceImpl;


public class ReimbursementController {
	
	public static void showAllReimbursementsByThisUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		ReimbursementServiceImpl reimbServ = new ReimbursementServiceImpl();
		
		ArrayList<Reimbursement> newArr = reimbServ.showAllReimbursementsByThisUser(1);
		String reimb = new ObjectMapper().writeValueAsString(newArr);
		
		resp.setContentType("application/json");
		
		PrintWriter writer = resp.getWriter();
		
		writer.write(reimb);
	
	}
	
	public static void showAllReimbursements(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		ReimbursementServiceImpl reimbServ = new ReimbursementServiceImpl();
		
		ArrayList<Reimbursement> newArr = reimbServ.showAllReimbursements();
		String reimb = new ObjectMapper().writeValueAsString(newArr);
		
		resp.setContentType("application/json");
		
		PrintWriter writer = resp.getWriter();
		
		writer.write(reimb);

	}
	
	public static void showUnresolvedReimbursements(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		ReimbursementServiceImpl reimbServ = new ReimbursementServiceImpl();
		
		ArrayList<Reimbursement> newArr = reimbServ.showUnresolvedReimbursements();
		String reimb = new ObjectMapper().writeValueAsString(newArr);
		
		resp.setContentType("application/json");
		
		PrintWriter writer = resp.getWriter();
		
		writer.write(reimb);

	}
	
	public static void showApprovedReimbursements(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		ReimbursementServiceImpl reimbServ = new ReimbursementServiceImpl();
		
		ArrayList<Reimbursement> newArr = reimbServ.showApprovedReimbursements();
		String reimb = new ObjectMapper().writeValueAsString(newArr);
		
		resp.setContentType("application/json");
		
		PrintWriter writer = resp.getWriter();
		
		writer.write(reimb);

	}
	
	public static void showRejectedReimbursements(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		ReimbursementServiceImpl reimbServ = new ReimbursementServiceImpl();
		
		ArrayList<Reimbursement> newArr = reimbServ.showRejectedReimbursements();
		String reimb = new ObjectMapper().writeValueAsString(newArr);
		
		resp.setContentType("application/json");
		
		PrintWriter writer = resp.getWriter();
		
		writer.write(reimb);

	}
	
	public static void updateReimbursement(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		ReimbursementServiceImpl reimbServ = new ReimbursementServiceImpl();
		reimbServ.updateReimbursements(req.getParameter("myStatusInput"), req.getParameter("myIdInput"));

	}
	
	
}
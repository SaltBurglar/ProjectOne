package model;

import java.sql.Timestamp;

public class Reimbursement {
	protected int id;
	protected int amount;
	protected Timestamp timeSubmitted; // Essentially, we are parsing this into as a parameter for the TimeStamp(int
	protected String description;
	protected int author;
	protected int statusId;
	protected int typeId;

	public Reimbursement() {
		super();
	}

	public Reimbursement(int s_id, int amount, Timestamp submitted, String description, int author, int status_id, int type_id) {
		this.id = s_id;
		this.amount = amount;
		this.timeSubmitted = submitted;
		this.description = description;
		this.author = author;
		this.statusId = status_id;
		this.typeId = type_id;

	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Timestamp getTimeSubmitted() {
		return this.timeSubmitted;
	}

	public void setTimeSubmitted(Timestamp timeSubmitted) {
		this.timeSubmitted = timeSubmitted;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getAuthor() {
		return this.author;
	}

	public void setAuthor(int author) {
		this.author = author;
	}


	public int getStatusId() {
		return this.statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", amount=" + amount + ", timeSubmitted=" + timeSubmitted + " description=" + description + ", author=" + author + ", statusId=" + statusId + ", typeId=" + typeId + "]";
	}

}

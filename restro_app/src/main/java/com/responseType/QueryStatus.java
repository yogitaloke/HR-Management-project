package com.responseType;

public class QueryStatus {
	private boolean status;
	
	public QueryStatus() {
		// TODO Auto-generated constructor stub
	}

	public QueryStatus(boolean status) {
		super();
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "QueryStatus [status=" + status + "]";
	}
	
	

}

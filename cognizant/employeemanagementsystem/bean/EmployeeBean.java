package com.cognizant.employeemanagementsystem.bean;

public class EmployeeBean {
	String emp_id;
	String fname;
	String lname;
	int esal;
	String edesg;
	String password;
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getEsal() {
		return esal;
	}
	public void setEsal(int esal) {
		this.esal = esal;
	}
	public String getEdesg() {
		return edesg;
	}
	public void setEdesg(String edesg) {
		this.edesg = edesg;
	}
	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public EmployeeBean(String emp_id, String fname, String lname, int esal, String edesg, String password) {
		super();
		this.emp_id = emp_id;
		this.fname = fname;
		this.lname = lname;
		this.esal = esal;
		this.edesg = edesg;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "EmployeeBean [emp_id=" + emp_id + ", fname=" + fname + ", lname=" + lname + ", esal=" + esal
				+ ", edesg=" + edesg + ", password=" + password + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((edesg == null) ? 0 : edesg.hashCode());
		result = prime * result + ((emp_id == null) ? 0 : emp_id.hashCode());
		result = prime * result + esal;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeBean other = (EmployeeBean) obj;
		if (edesg == null) {
			if (other.edesg != null)
				return false;
		} else if (!edesg.equals(other.edesg))
			return false;
		if (emp_id == null) {
			if (other.emp_id != null)
				return false;
		} else if (!emp_id.equals(other.emp_id))
			return false;
		if (esal != other.esal)
			return false;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	public EmployeeBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}

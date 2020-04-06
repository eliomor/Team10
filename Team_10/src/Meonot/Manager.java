package Meonot;

import java.io.Serializable;


public class Manager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fName;
	private String lName;
	private String phone;
	private String ID;
	private String Password;
	
	public Manager() {
		this.fName = "";
		this.lName = "";
		this.phone = "";
		this.ID="";
		this.Password="";

	}
	
	public Manager(String fName, String lName, String phone,String ID,String Password) {
		this.fName = fName;
		this.lName = lName;
		this.phone = phone;
		this.ID=ID;
		this.Password=Password;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}

package Meonot;

import java.io.Serializable;


public class Manager implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Fname;
	private String Lname;
	private String phoneNumber;
	private String managerId;
	private String password;
	private String Email;
	private String gender;
	private String address;
	
	
	public Manager() {
		this.Fname = "";
		this.Lname = "";
		this.phoneNumber = "";
		this.password="";
		this.gender="";
		this.address="";
		this.Email="";
		this.managerId="";
	}
	
	public Manager(String managerId,String Fname, String Lname, String phoneNumber,String address,String password,String gender,String Email) {
		this.Fname = Fname;
		this.Lname = Lname;
		this.phoneNumber = phoneNumber;
		this.managerId=managerId;
		this.password=password;
		this.address=address;
		this.Email=address;
		this.gender=gender;
	}
	public Manager(Manager man) {
		this.Fname = man.Fname;
		this.Lname = man.Lname;
		this.phoneNumber = man.phoneNumber;
		this.managerId=man.managerId;
		this.password=man.password;
		this.address=man.address;
		this.Email=man.address;
		this.gender=man.gender;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}


	


}

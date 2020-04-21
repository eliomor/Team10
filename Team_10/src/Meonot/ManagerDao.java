package Meonot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagerDao {
public static Connection getConnection() {
	Connection conn=null;
	String url = "jdbc:mysql://localhost:3306/daycare";
	String user = "tarek";
	String pw = "1234";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn= DriverManager.getConnection(url,user,pw);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return conn;
	
}
	public static int saveManager(Manager man) {
		int status=0;
		try {
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into manager(managerId,Fname,Lname,phoneNumber,address,password,gender,Email) values(?,?,?,?,?,?,?,?)");
			ps.setInt(1,Integer.parseInt( man.getManagerId()));
			ps.setString(2, man.getFname());
			ps.setString(3, man.getLname());
			ps.setString(4, man.getPhoneNumber());
			ps.setString(5, man.getAddress());
			ps.setString(6, man.getPassword());
			ps.setString(7, man.getGender());
			ps.setString(8, man.getEmail());
			status=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	} 
	public static int updateManager(Manager man) {
		int status=0;
		try {
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement("update manager set Fname=?,Lname=?,phoneNumber=?,address=?,password=?,gender=?,Email=? where managerId=?");
			ps.setString(1, man.getFname());
			ps.setString(2, man.getLname());
			ps.setString(3, man.getPhoneNumber());
			ps.setString(4, man.getAddress());
			ps.setString(5, man.getPassword());
			ps.setString(6, man.getGender());
			ps.setString(7, man.getEmail());
			ps.setInt(8,Integer.parseInt(man.getManagerId()));
			status=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	} 
	/*
	public static int deleteManager(Manager man) {
		int status=0;
		try {
			Connection conn=getConnection();
			PreparedStatement ps=conn.prepareStatement("delete from manager where managerId=?");

			ps.setInt(1, man.getManagerId());
			status=ps.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		
	} 
	*/
	public static List<Manager> getAllRecords(){
		List<Manager> list=new ArrayList<Manager>();
		try {
			Connection conn = getConnection();
			PreparedStatement ps;
			ps = conn.prepareStatement("select * from manager");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Manager man=new Manager(rs.getString("managerId"), rs.getString("Fname"),rs.getString("Lname"),rs.getString("phoneNumber"),rs.getString("address"),rs.getString("password"),rs.getString("gender"),rs.getString("Emal"));
				list.add(man);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	public static Manager getRecordById(String id){
			Manager man=null;
		try {
			Connection conn = getConnection();
			PreparedStatement ps= conn.prepareStatement("select * from manager where managerId=?");
			ps.setInt(1,Integer.parseInt(id));
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				man=new Manager(rs.getString("managerId"), rs.getString("Fname"),rs.getString("Lname"),rs.getString("phoneNumber"),rs.getString("address"),rs.getString("password"),rs.getString("gender"),rs.getString("Emal"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return man;
		
	}
	public static boolean login(String id) {
		Manager man=new Manager(getRecordById(id));
		List<Manager> list=new ArrayList<Manager>(getAllRecords());
		if(list.contains(man))
			return true;
		else return false;
	}
	
}

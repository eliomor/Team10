package meonot;




import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;
/**
 * Servlet implementation class ProcessInfo
 */
@WebServlet("/ProcessInfo")
public class ProcessInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProcessInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url ="/DisplayInfo.jsp";
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String phone = request.getParameter("phone");
		String ID = request.getParameter("ID");
		String Password = request.getParameter("Password");
		updateDB(fname,lname,phone,ID,Password);
		Manager man = new Manager(fname,fname,phone, ID, Password, Password, Password, Password);
		
		
		request.setAttribute("usersName", man);
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request, response);
	} 
	
	protected void updateDB(String fname,String lname,String phone, String iD, String password) {
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/daycare";
			String user = "dbadmin";
			String pw = "turtledove";
			con = (Connection) DriverManager.getConnection(url,user,pw);
			Statement s = (Statement) con.createStatement();
			String query = "INSERT INTO MANAGER" + "(first_name, last_name, phone, ID ,Password) " + 
			"VALUES ('" + fname + "','" + lname + "','" + phone + "','" + iD +"','" + password +")";
			s.executeUpdate(query);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

package com.project.goshopping;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterValidate
 */
@WebServlet("/register")
public class RegisterValidate extends HttpServlet {
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		LoginDAO dao=new LoginDAO();
		String name= request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("Password");
		String phone = request.getParameter("Phone");
		pw.println(name);
	
     String status=dao.getInsertData(name,email,password,phone);
     if(status.equals("done")){
    	  pw.println("sucess");
      }
		
	}

	
		
		

}

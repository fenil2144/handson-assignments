package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ContactDetails
 */
@WebServlet("/submitContactDetails")
public class ContactDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ContactDetails() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		HttpSession session = request.getSession();
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		
		printWriter.print("Name "+session.getAttribute("fname")+" ");
		printWriter.print(session.getAttribute("lname")+"<br>");
		printWriter.print(phone +"<br>"+email);
	}

}

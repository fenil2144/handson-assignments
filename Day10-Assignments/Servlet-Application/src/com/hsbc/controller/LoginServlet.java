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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/submitNameDetails")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		
		printWriter.print(fname +" "+lname);
		
		HttpSession session = request.getSession();
		session.setAttribute("fname", fname);
		session.setAttribute("lname", lname);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("contactDetails.html");
		requestDispatcher.include(request, response);
	}

}

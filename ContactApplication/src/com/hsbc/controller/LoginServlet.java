package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.exception.AuthenticationException;
import com.hsbc.model.Profile;
import com.hsbc.service.ProfileService;
import com.hsbc.utility.ProfileFactory;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public LoginServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfileService profileService = (ProfileService) ProfileFactory.getInstance("service");
		RequestDispatcher rd = null;
		try {
			Profile profile = profileService.login(Integer.parseInt( request.getParameter("id") ), request.getParameter("password"));
			HttpSession session = request.getSession();
			session.setAttribute("profile", profile);
			
			
			rd = request.getRequestDispatcher("loginSuccess.jsp");
			rd.forward(request, response);
			
		} catch (AuthenticationException e) {
			rd = request.getRequestDispatcher("loginFailure.jsp");
			request.setAttribute("err", e.getMessage());
			rd.forward(request, response);
		}
	}

}

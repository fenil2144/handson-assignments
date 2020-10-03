package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hsbc.model.Profile;
import com.hsbc.service.ProfileService;
import com.hsbc.utility.ProfileFactory;



/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegisterServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfileService profileService = (ProfileService) ProfileFactory.getInstance("service");
			Profile profile = new Profile();
			profile.setProfileName(request.getParameter("name"));
			profile.setPassword(request.getParameter("password"));
			profile.setPhone(Long.parseLong(request.getParameter("phone")));
			profile.setDob(request.getParameter("dob"));
			int profileId = profileService.register(profile);
			request.setAttribute("profileId", profileId);
			
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
	}

}

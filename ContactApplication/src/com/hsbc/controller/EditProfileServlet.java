package com.hsbc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.Profile;
import com.hsbc.service.ProfileService;
import com.hsbc.utility.ProfileFactory;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/EditProfileServlet")
public class EditProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public EditProfileServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfileService profileService = (ProfileService) ProfileFactory.getInstance("service");
		HttpSession session = request.getSession();

			Profile profile = (Profile) session.getAttribute("profile");
			
			profile.setProfileName(request.getParameter("name"));
			profile.setPassword(request.getParameter("password"));
			profile.setPhone(Long.parseLong(request.getParameter("phone")));
			profile.setDob(request.getParameter("dob"));
			
			profileService.updateProfile(profile);
			
			session.setAttribute("profile", profile);
			session.setAttribute("message", "Profile Updated Successfully for Profile Id: "+profile.getProfileId());
			
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginSuccess.jsp");
			requestDispatcher.forward(request, response);
			
	}



}

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
 * Servlet implementation class DeleteProfileServlet
 */
@WebServlet("/DeleteProfileServlet")
public class DeleteProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DeleteProfileServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProfileService profileService = (ProfileService) ProfileFactory.getInstance("service");
		HttpSession session = request.getSession();
		RequestDispatcher requestDispatcher = null;

			Profile profile = (Profile) session.getAttribute("profile");
			
			String input = request.getParameter("delete");
			if(input.equalsIgnoreCase("delete")) {
				profileService.deleteProfile(profile.getProfileId());
				session.invalidate();
				request.setAttribute("message", "Profile Deleted Successfully for Profile Id: "+profile.getProfileId());
				requestDispatcher = request.getRequestDispatcher("index.jsp");
			}
			else {
				request.setAttribute("message", "please enter the word delete correctly");
				requestDispatcher = request.getRequestDispatcher("deleteProfile.jsp");
			}
			
			requestDispatcher.forward(request, response);
	}



}

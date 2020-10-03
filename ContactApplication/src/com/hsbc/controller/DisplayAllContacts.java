package com.hsbc.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hsbc.model.Contact;
import com.hsbc.model.Profile;
import com.hsbc.service.ContactService;
import com.hsbc.utility.ContactFactory;

/**
 * Servlet implementation class DisplayAllContacts
 */
@WebServlet("/DisplayAllContacts")
public class DisplayAllContacts extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayAllContacts() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactService contactService = (ContactService) ContactFactory.getInstance("service");
		HttpSession session = request.getSession();
		Profile profile = (Profile) session.getAttribute("profile");
		List<Contact> contactList = contactService.fetchAllContacts(profile.getProfileId());

		request.setAttribute("contactList", contactList);
		
		RequestDispatcher rd = request.getRequestDispatcher("displayAllContacts.jsp");
		rd.forward(request, response);
	}

}

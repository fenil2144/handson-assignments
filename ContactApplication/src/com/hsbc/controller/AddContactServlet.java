package com.hsbc.controller;

import java.io.IOException;

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
 * Servlet implementation class AddContactServlet
 */
@WebServlet("/AddContactServlet")
public class AddContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddContactServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContactService contactService = (ContactService) ContactFactory.getInstance("service");
		HttpSession session = request.getSession();
		Profile profile = (Profile) session.getAttribute("profile");
		
		Contact contact = new Contact();
		contact.setContactName(request.getParameter("contactName"));
		contact.setContactPhone(Long.parseLong(request.getParameter("contactPhone")));
		contact.setProfileRef(profile.getProfileId());
		
		contactService.addContact(contact);
		
		
		request.setAttribute("contactName", contact.getContactName());
		RequestDispatcher rd = request.getRequestDispatcher("addContact.jsp");
		rd.forward(request, response);
	}

}

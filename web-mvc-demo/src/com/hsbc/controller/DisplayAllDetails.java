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

import com.hsbc.model.User;
import com.hsbc.service.UserService;
import com.hsbc.utility.UserFactory;

/**
 * Servlet implementation class DisplayAllDetails
 */
@WebServlet("/DisplayAllDetails")
public class DisplayAllDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public DisplayAllDetails() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = (UserService) UserFactory.getInstance("service");
		List<User> userList = userService.fetchAllUsers();
		
		HttpSession session = request.getSession();
		session.setAttribute("userList", userList);
		
		RequestDispatcher rd = request.getRequestDispatcher("displayAllItems.jsp");
		rd.forward(request, response);
	}



}

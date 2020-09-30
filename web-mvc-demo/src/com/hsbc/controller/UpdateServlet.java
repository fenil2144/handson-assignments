package com.hsbc.controller;

import java.io.IOException;

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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UpdateServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = (UserService) UserFactory.getInstance("service");
		HttpSession session = request.getSession();

			User user = (User) session.getAttribute("user");
			user.setPassword(request.getParameter("password"));
			user.setPhone(Long.parseLong(request.getParameter("phone")));
			userService.updateUser(user);
			session.setAttribute("user", user);
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginSuccess.jsp");
			requestDispatcher.forward(request, response);
			
	}



}

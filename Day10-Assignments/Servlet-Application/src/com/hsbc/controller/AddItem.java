package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddItem
 */
@WebServlet("/addItem")
public class AddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AddItem() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		HttpSession session = request.getSession();
		List<String> itemList = null;
		
		String itemName = request.getParameter("itemName");
		if( session.getAttribute("itemList") == null) {
			itemList = new ArrayList<String>();
			itemList.add(itemName);
		}
		else {
			itemList = (List<String>) session.getAttribute("itemList");
			itemList.add(itemName);
		}
		 
		
		session.setAttribute("itemList", itemList);
		
		printWriter.print("itemCount "+((List<String>) session.getAttribute("itemList")).size());
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("items.html");
		requestDispatcher.include(request, response);
	}

}

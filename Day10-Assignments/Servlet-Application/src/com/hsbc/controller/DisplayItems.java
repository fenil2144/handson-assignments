package com.hsbc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DisplayItems
 */
@WebServlet("/displayItems")
public class DisplayItems extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public DisplayItems() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter printWriter = response.getWriter();
		HttpSession session = request.getSession();
		printWriter.print("Item List <br> ");

		
		List<String> itemList = (List<String>) session.getAttribute("itemList");
		for(String itemName : itemList) {
			printWriter.println(itemName);
		}
	}

}

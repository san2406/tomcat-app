package com.javahelps.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/saytime")
public class HelloWorldServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
/**
     * @see HttpServlet#HttpServlet()
     */
public HelloWorldServlet() {
	super();
}


/**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter out = response.getWriter();
	 out.print("<html><body><h1 align='center'>" +
	 new Date().toString() + "</h1></body></html>");
	 
	 
 }
}
	


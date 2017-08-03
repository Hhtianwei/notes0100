package com.shsxt.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieServlet extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		Cookie coo = new Cookie("abc","123");
		response.addCookie(coo);
	}
}

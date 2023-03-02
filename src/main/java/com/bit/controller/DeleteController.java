package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.BoardDao;

public class DeleteController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		BoardDao dao = new BoardDao();
		int num = Integer.parseInt(req.getParameter("num"));
		dao.deleteOne(num);
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("WEB-INF/views/list.jsp");
		rd.forward(req, resp);
	}

}

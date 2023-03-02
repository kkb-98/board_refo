package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.BoardDao;
import com.bit.model.BoardDto;


public class EditController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		int num = Integer.parseInt(req.getParameter("num"));
		BoardDao dao = new BoardDao();
		BoardDto bean = dao.selectOne(num);
		req.setAttribute("dto", bean);
		RequestDispatcher rd;
		rd = req.getRequestDispatcher("WEB-INF/views/edit.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setContentType("text/html;charset=UTF-8");
		req.setCharacterEncoding("utf-8");
		int num = Integer.parseInt(req.getParameter("num"));
		String sub = req.getParameter("sub");
		String content = req.getParameter("content");
		BoardDao dao = new BoardDao();
		dao.updateOne(num, sub, content);
		resp.sendRedirect("detail.do?num="+num);
	}
}

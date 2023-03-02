package com.bit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.BoardDao;
import com.bit.model.BoardDto;


public class DetailController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		int num = Integer.parseInt(req.getParameter("num"));
		BoardDao dao = new BoardDao();
		BoardDto bean = dao.selectOne(num);
		req.setAttribute("dto", bean);
		RequestDispatcher rd=req.getRequestDispatcher("WEB-INF/views/detail.jsp");
		rd.forward(req, resp);
	}
}

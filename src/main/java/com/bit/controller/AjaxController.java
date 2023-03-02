package com.bit.controller;

import java.beans.Beans;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.BoardDao;
import com.bit.model.BoardDto;

@WebServlet("/ajax")
public class AjaxController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setHeader("Access-Control-Allow-Origin", "*");
		resp.setCharacterEncoding("utf-8");
		BoardDao boardDao = new BoardDao();
		List<BoardDto> list =boardDao.selectAll();
		PrintWriter out = resp.getWriter();
		for(BoardDto dto : list ) {
			int number = dto.getNum();
			out.print("<tr><td>" + dto.getNum() + "</td style=\"text-align: center\"><th><a href="+req.getContextPath()+"/"+"detail.do?num="+number+">");
			out.print(dto.getSub() +"</a></th><td>");
			out.print(dto.getNalja() +"</td></tr>");
		}
		out.flush();
		out.close();
	}
}

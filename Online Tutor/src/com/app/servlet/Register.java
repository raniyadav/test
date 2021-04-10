package com.app.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.bean.RegisterBean;
import com.app.dao.AdminDao;

/**
 * Servlet implementation class Register
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String uid = request.getParameter("uid");
		String pwd = request.getParameter("pwd");
		String mbl = request.getParameter("mbl");
		String exp = request.getParameter("exp");
		String sub =request.getParameter("sub");
		String lct = request.getParameter("lct");
		RegisterBean rb = new RegisterBean();
		rb.setName(name);
		rb.setEmail(uid);
		rb.setPassword(pwd);
		rb.setMobile(mbl);
		rb.setExperience(exp);
		rb.setSubject(sub);
		rb.setLocation(lct);
		String sql = "insert into Register values(?,?,?,?,?,?,?)";
			int i = AdminDao.register(sql, rb);
			if(i>0){
				response.sendRedirect("Login.jsp");	
			}
			else
			{
				response.sendRedirect("Register.jsp");
				
			}	
		}
	}
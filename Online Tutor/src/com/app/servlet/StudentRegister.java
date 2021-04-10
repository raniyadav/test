package com.app.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.bean.StudentRegisterBean;
import com.app.dao.AdminDao;

/**
 * Servlet implementation class StudentRegister
 */
@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegister() {
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
		String lct = request.getParameter("lct");
		String cdno = request.getParameter("cdno");
		String cdhn =request.getParameter("cdhn");
		String cdm =request.getParameter("cdm");
		String year =request.getParameter("year");
		String months=request.getParameter("months");
		String cvv=request.getParameter("cvv");
		StudentRegisterBean rb = new StudentRegisterBean();
		rb.setName(name);
		rb.setEmail(uid);
		rb.setPassword(pwd);
		rb.setMobile(mbl);
		rb.setLocation(lct);
		rb.setCardnumber(cdno);
		rb.setCardholderName(cdhn);
		rb.setCdmobile(cdm);
		rb.setYear(year);
		rb.setMonths(months);
		rb.setCvv(cvv);
		String sql = "insert into studentregister values(?,?,?,?,?,?,?,?,?,?,?)";
			int i = AdminDao.studentRegister(sql, rb);
			if(i>0){
				response.sendRedirect("StudentLogin.jsp");
			}else{
				response.sendRedirect("StudentRegister.jsp");
			} 
		}
	
	}



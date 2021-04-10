package com.app.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.dao.AdminDao;


/**
 * Servlet implementation class StudentD
 */
@WebServlet("/StudentD")
public class StudentD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentD() {
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
		String Id=request.getParameter("Id");
		String StudentId=request.getParameter("StudentId");
		String TutorId=request.getParameter("TutorId");
		String Subject=request.getParameter("subject");
		String ans = request.getParameter("ans");
		com.app.bean.StudentD rb = new  com.app.bean.StudentD();
		rb.setID(Id);
		rb.setTutorID(Id);
		
		String sql = "insert into tutor values(?,?,?,?,?,?,?)";
		//int i = AdminDao.MathsTutor(sql, rb);
		int i=AdminDao.studentDetails(sql,rb);
		if(i>0){
			response.sendRedirect("StudentD.jsp");
		}else{
			response.sendRedirect("Tutor.jsp");
			
		}
	}
		
	}


package com.app.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.app.bean.MathsTutorBean;
import com.app.dao.AdminDao;
/**
 * Servlet implementation class MathsTutor
 */
@WebServlet("/MathsTutor")
public class MathsTutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MathsTutor() {
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
		String ans = request.getParameter("ans");
		String name= request.getParameter("Name");
		String Email =request.getParameter("Uid");
		MathsTutorBean rb= new MathsTutorBean();
		rb.getAnswer();
		String sql = "insert into Mathstutor values";
		int i = AdminDao.MathsTutor(sql, rb);
		if(i>0){
			response.sendRedirect("Maths.jsp");
		}else{
			response.sendRedirect("MathsTutor.jsp");
			
		}
	}
}

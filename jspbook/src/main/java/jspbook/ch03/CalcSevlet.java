package jspbook.ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcSevlet
 */
@WebServlet("/CalcSevlet")
public class CalcSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = 0, num2 = 0, result = 0;
		boolean ret = true;
		String op = "";
		
		response.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String strNum1 = request.getParameter("num1");
		String strNum2 = request.getParameter("num2");
		
		if (strNum1 == null || strNum1.equals(""))
			ret = false;
		if (strNum2 == null || strNum2.equals(""))
			ret = false;
		
		op = request.getParameter("operator");
		
		if(op != null && ret ) {
			// calc() 메서드 호출로 결과를 받아 온다. 
			num1 = Integer.parseInt(strNum1);
			num2 = Integer.parseInt(strNum2);
			Calc calc = new Calc(num1, num2, op);
			result = calc.getResult();
		}
			// 출력 스트림을 통해 화면을 구성 한다. out.println("<HTML>"); out.println("<HEAD><TITLE>계산기
		out.println("<HTML>");
		out.println("<HEAD><TITLE>계산기</TITLE></HEAD>");
		out.println("<BODY><center>");
		out.println("<H2>계산결과<H2>");
		out.println("<HR>");
		out.println(num1 + "" + op + "" + num2 + " = " + result);
		out.println("</BODY></HTML>");
	}

}

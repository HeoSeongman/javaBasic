package multi;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.Format;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		PrintWriter writer = response.getWriter();
//		String id = request.getParameter("id");
//		String pw = request.getParameter("pw");
//		writer.print("doGet => " + id + ", " + pw);
		String find = request.getParameter("find");
		writer.print("doGet 한글로 => " + find);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter writer = response.getWriter();
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		writer.print("doPost 한글로 => " + id + ", " + pw);
	}

}

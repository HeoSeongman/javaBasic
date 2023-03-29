package multi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/check.do")
public class Check extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String weather = request.getParameter("weather");
		String result = "";
		
		switch (weather) {
		case "맑음" : result = "나가자"; break;
		case "흐림" : result = "코딩"; break;
		case "비옴" : result = "쇼핑"; break;
		case "기타" : result = "그냥 있자"; break;
		}
		
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter writer = response.getWriter();
		writer.println(result);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String king = request.getParameter("king");
		String result = null;
		String src = null;
		
		if (king.equals("나는왕이다.")) {
			result = "들어오세요.";
			src = "./img/king.jpg";
		} else {
			result = "들어올 수 없습니다.";
			src = "./img/notking.jpg";
		}
		
		response.setContentType("text/html; charset=utf-8"); 
		PrintWriter writer = response.getWriter();
		writer.print("<p>" + result + "</p>\n"
				+ "<img src=" + src + ">");
	}

}

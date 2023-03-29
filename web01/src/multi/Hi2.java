package multi;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/haha2")
public class Hi2 extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("data");
		System.out.println("서버에서 받은 데이터는 " + data + "입니다.");
		PrintWriter writer = response.getWriter();
//		writer.println("서버에서 보낸 데이터 : I'm Server");
		writer.print("<!DOCTYPE html\n"
				+ "<html>\n"
				+ "<head>\n"
				+ "<meta charset=\"UTF-8\">\n"
				+ "<title>Insert title here</title></head>\n"
				+ "<body>"
				+ "<h3>I'm Server..."
				+ "</h3></body></html>");
		writer.close();
	}
	
}

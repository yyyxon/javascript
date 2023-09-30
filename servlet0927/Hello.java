package day0927;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
//1. HttpServlet 상속 : 내가 만든 클래스로 웹 서비스를 하기 위해서
public class Hello extends HttpServlet {
	
	//2. 요청 방식을 처리할 수 있는 method를 Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. 응답 방식 설정(접속자에게 제공하는 내용 : MIME-type 설정)
		response.setContentType("text/html;charset=UTF-8");
		//4. 접속자에게 출력하기 위해 출력 스트림을 얻기
		PrintWriter out = response.getWriter();
		//5. 접속자에게 응답할 내용을 만든다.
		out.println("<html>");
		out.println("<head>");
		out.println("<title>안녕 서블릿</title>");
		out.println("</head>");
		out.println("<body>");
		String name = "승연";
		out.println("<strong>" + name + "</strong>님 안녕하세요?");
		out.println("<br>Hello Servlet");
		out.println("</body>");
		out.println("</html>");
		System.out.println("request " + request);
		System.out.println("response " + response);
	}//doGet

}//class

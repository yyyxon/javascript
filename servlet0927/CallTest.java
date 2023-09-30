package day0927;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
//1. HttpServelt 상속
public class CallTest extends HttpServlet {
	//2. 요청 방식을 처리할 수 있는 method override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. 응답 방식 설정(MIME-type 설정)
		response.setContentType("text/html;charset=UTF-8");
		//4. 출력스트림 얻기
		PrintWriter out = response.getWriter();
		//5. 출력 내용 만들기
		out.println("<html>");
		out.println("<head>");
		out.println("<title>안녕 서블릿</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<strong>GET방식의 요청</strong><br>");
		out.println("<a href='#void' onclick='history.back()'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
		
	}//doGet

	//2. 요청 방식을 처리할 수 있는 method override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//3. 응답 방식 설정(MIME-type 설정)
		response.setContentType("text/html;charset=UTF-8");
		//4. 출력스트림 얻기
		PrintWriter out = response.getWriter();
		//5. 출력 내용 만들기
		out.println("<html>");
		out.println("<head>");
		out.println("<title>안녕 서블릿</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<strong style='color: red'>POST방식의 요청</strong><br>");
		out.println("<a href='#void' onclick='history.back()'>뒤로</a>");
		out.println("</body>");
		out.println("</html>");
	}//doPost

}

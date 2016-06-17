package coreservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThreeParam
 */
@WebServlet("/ThreeParam")
public class ThreeParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreeParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Reading Three Request Parameters";
		out.println("<HTML>"+
				 
				"<H1 ALIGN=CENTER>" + title + "</H1>\n" +
				"<UL>\n" +
				" <LI><B>param1</B>: "
				+ request.getParameter("param1") + "\n" +
				" <LI><B>param2</B>: "
				+ request.getParameter("param2") + "\n" +
				" <LI><B>param3</B>: "
				+ request.getParameter("param3") + "\n" +
				"</UL>\n" +
				"</BODY></HTML>");
	}
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

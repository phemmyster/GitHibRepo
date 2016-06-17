package coreservlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowCookies
 * 
/** Creates a table of the cookies associated with
 *  the current page.
 *  <P>
 *  Taken from Core Servlets and JavaServer Pages
 *  from Prentice Hall and Sun Microsystems Press,
 *  http://www.coreservlets.com/.
 *  &copy; 2000 Marty Hall; may be freely used or adapted.
 */
@WebServlet("/ShowCookies")
public class ShowCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
		    PrintWriter out = response.getWriter();
		    String title = "Active Cookies";
		    out.println(ServletUtilities.headWithTitle(title) +
		                "<BODY BGCOLOR=\"#FDF5E6\">\n" +
		                "<H1 ALIGN=\"CENTER\">" + title + "</H1>\n" +
		                "<TABLE BORDER=1 ALIGN=\"CENTER\">\n" +
		                "<TR BGCOLOR=\"#FFAD00\">\n" +
		                "  <TH>Cookie Name\n" +
		                "  <TH>Cookie Value");
		    Cookie[] cookies = request.getCookies();
		    Cookie cookie;
		    for(int i=0; i<cookies.length; i++) {
		      cookie = cookies[i];
		      out.println("<TR>\n" +
		                  "  <TD>" + cookie.getName() + "\n" +
		                  "  <TD>" + cookie.getValue());
		    }
		    out.println("</TABLE></BODY></HTML>");
		  }
		}


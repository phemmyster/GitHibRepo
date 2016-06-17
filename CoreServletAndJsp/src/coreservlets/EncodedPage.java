package coreservlets;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EncodedPage
 */
@WebServlet("/EncodedPage")
public class EncodedPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String encodings = request.getHeader("Accept-Encoding");
		String encodeFlag = request.getParameter("encoding");
		PrintWriter out;
		String title;
		if ((encodings != null) &&
		(encodings.indexOf("gzip") != -1) &&
		!"none".equals(encodeFlag)) {
		title = "Page Encoded with GZip";
		OutputStream out1 = response.getOutputStream();
		out = new PrintWriter(new GZIPOutputStream(out1), false);
		response.setHeader("Content-Encoding", "gzip");
		} else {
		title = "Unencoded Page";
		out = response.getWriter();
		}
		out.println("<HTML>" +
		"<BODY BGCOLOR=\"#FDF5E6\">\n" +
		"<H1 ALIGN=CENTER>" + title + "</H1>\n");
		String line = "Blah, blah, blah, blah, blah. " +
		"Yadda, yadda, yadda, yadda.";
		for(int i=0; i<10000; i++) {
		out.println(line);
		}
		out.println("</BODY></HTML>");
		out.close();
	}

}

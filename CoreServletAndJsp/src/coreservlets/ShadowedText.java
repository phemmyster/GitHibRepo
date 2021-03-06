package coreservlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.awt.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShadowedText
 */
@WebServlet("/ShadowedText")
public class ShadowedText extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message = request.getParameter("message");
	    if ((message == null) || (message.length() == 0)) {
	      message = "Missing 'message' parameter";
	    }
	    String fontName = request.getParameter("fontName");
	    if (fontName == null) {
	      fontName = "Serif";
	    }
	    String fontSizeString = request.getParameter("fontSize");
	    int fontSize;
	    try {
	      fontSize = Integer.parseInt(fontSizeString);
	    } catch(NumberFormatException nfe) {
	      fontSize = 90;
	    }
	    response.setContentType("image/gif");
	    OutputStream out = response.getOutputStream();
	    Image messageImage =
	      MessageImage.makeMessageImage(message,
	                                    fontName,
	                                    fontSize);
	    MessageImage.sendAsGIF(messageImage, out);
	  }

	 /** Allow form to send data via either GET or POST. */
	  
	  public void doPost(HttpServletRequest request,
	                     HttpServletResponse response)
	      throws ServletException, IOException {
	    doGet(request, response);
	  }
	}


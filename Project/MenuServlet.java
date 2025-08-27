package com.example.menu;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MenuServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String name = request.getParameter("name");
        String message = request.getParameter("message");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Thank you, " + name + "!</h2>");
        out.println("<p>Your message: " + message + "</p>");
        out.println("<a href='index.html'>Back to Menu</a>");
        out.println("</body></html>");
    }
}

package com.example.demo;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloServlet", value = "/login")
public class HelloServlet extends HttpServlet {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "12345";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            writer.println("<h1> + hello eem+</h1>");
        }
        else {
            writer.println(username);
            writer.println(password);
        }
        writer.println("</html>");
    }
}



package com.example.demo2;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "chuyendoi", value = "/convert")
public class chuyendoi extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer= response.getWriter();
        writer.println("hello");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float rate=  Float.parseFloat(req.getParameter("rate"));
        float usd= Float.parseFloat(req.getParameter("usd"));
        float vnd= rate*usd;
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1> Rate:" + rate+"</h1>");
        writer.println("<h1> USD:" + usd+"</h1>");
        writer.println("<h1> VND:" + vnd+"</h1>");
        writer.println("</html>");
    }
}
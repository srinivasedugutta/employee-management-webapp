package com.devops.app.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EmployeeController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<html><head><title>Employee Management</title></head><body>");
        out.println("<h1>Welcome to Employee Management Application</h1>");
        out.println("<p>Running on Java 17 with Maven</p>");
        out.println("</body></html>");
    }
}

package com.geekbrains.web.app;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormResultServlet", urlPatterns = "/formResult.html")
public class FormResultsServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html;charset=\"UTF-8\"");

        String nameParam = req.getParameter("name");
        String dateParam = req.getParameter("date");
        String cityParam = req.getParameter("city");

        out.println("<table> +" +
                "<tr><td>FIO</td><td>"+ nameParam +"</td></tr>" +
                "<tr><td>Date</td><td>"+ dateParam +"</td></tr>" +
                "<tr><td>City</td><td>"+ cityParam +"</td></tr>" + "</table>");

        out.close();
    }
}

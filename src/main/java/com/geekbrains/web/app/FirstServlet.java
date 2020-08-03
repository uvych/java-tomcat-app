package com.geekbrains.web.app;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FirstServlet", urlPatterns = "/formTable.html")
public class FirstServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        PrintWriter out = res.getWriter();
        res.setContentType("text/html");

        String nameParam = req.getParameter("count");

        int value = Integer.parseInt(nameParam);

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("<table>");

        for (int i = 1; i < value; i++){
            stringBuilder.append("<tr>");
            for (int j = 1; j < value; j++){
                stringBuilder.append("<td>").append(i).append("-").append(j).append("</td>");
            }
            stringBuilder.append("</tr>");
        }

        stringBuilder.append("</table>");

        out.println(stringBuilder.toString());

        out.close();
    }
}

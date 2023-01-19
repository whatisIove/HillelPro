package ua.ithillel.homework28.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer left = Integer.valueOf(request.getParameter("left"));
        Integer right = Integer.valueOf(request.getParameter("right"));
        Integer sum = left + right;

        request.setAttribute("sum", sum); // It'll be available as ${sum}.
        request.getRequestDispatcher("calculator.jsp").forward(request, response); // Redisplay JSP.
    }
}

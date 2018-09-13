/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 763198
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("message", "---");
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String fstring = request.getParameter("first");
        String sstring = request.getParameter("second");
        
        request.setAttribute("first", fstring);
        request.setAttribute("second", sstring);
        
//        request.setAttribute("message", request.getParameter("submit"));
        try {

            int first = Integer.parseInt(fstring);
            int second = Integer.parseInt(sstring);
            String message;
            switch (request.getParameter("submit")) {
                case "+":
                    message = "" + (first + second);
                    break;
                case "-":
                    message = "" + (first - second);
                    break;
                case "*":
                    message = "" + (first * second);
                    break;
                case "%":
                    message = "" + (first % second);
                    break;
                default:
                    message = "---";
                    break;
            }

            request.setAttribute("message", message);
            
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

        } catch (NumberFormatException e) {
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

}

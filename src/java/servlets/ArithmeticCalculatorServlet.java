/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 763198
 */
public class ArithmeticCalculatorServlet extends HttpServlet
{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        //sets the no input message to '---'
        request.setAttribute("message", "---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {

        //get the user inputs for the fields
        String fstring = request.getParameter("first");
        String sstring = request.getParameter("second");

        //set the fields back to what they were before the calculation
        request.setAttribute("first", fstring);
        request.setAttribute("second", sstring);

//        request.setAttribute("message", request.getParameter("submit"));
        try
        {

            //set strings to ints
            int first = Integer.parseInt(fstring);
            int second = Integer.parseInt(sstring);

            String message;
            //gets the value of the submit button in the form that is pressed
            switch (request.getParameter("submit"))
            {
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

        } catch (NumberFormatException e)
        {
            //on exception, displays a message to the user that the input is 
            //invalid
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);

        }

//        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}

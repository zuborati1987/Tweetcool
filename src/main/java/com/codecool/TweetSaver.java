package com.codecool;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TweetSaver extends HttpServlet {
    CSVWriter csvWriter = new CSVWriter();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String tweet = req.getParameter("tweet");
        csvWriter.writingToCSV(new Tweet(name, tweet));
        RequestDispatcher dispatcher =
                getServletContext().getRequestDispatcher("/servlet2");
        dispatcher.forward(req, resp);
    }

}
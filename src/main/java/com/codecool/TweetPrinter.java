package com.codecool;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TweetPrinter extends HttpServlet {
    CSReader csReader = new CSReader();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        res.setContentType("text/html");

        PrintWriter out = res.getWriter();
        /*for(Tweet tweet : csReader.ReadingFromCSV()) {
        out.print("<html><body>");
        out.print("<b>" + tweet.getTweet() + "\n" + tweet.getName()+ "</b>");
        out.print("</body></html>");
        }*/
        out.println("<link href=\"product.css\" rel=\"stylesheet\">");
        out.println("<html><body>");
        out.println("<h1>Tweetcool</h1>");
        for (Tweet tweet : csReader.ReadingFromCSV()) {
            out.println("<h2>" + tweet.getTweet() + "</h2>");
            out.println("<h3>" + tweet.getName() + "</h3>");
            out.print("</body></html>");

          /*  out.println("<link href=\"bootstrap.min.css\" rel=\"stylesheet\">");
            out.println("<html><body>");
            out.println("<div class=\"container\">");
            out.println("<h1>Tweetcool</h1>");
            for (Tweet tweet : csReader.ReadingFromCSV()) {
                out.println("<div class=\"panel panel-default\">");
                out.println("<div class=\"panel-body\">" + tweet.getTweet() + "</div>");
                out.println("<div class=\"panel-footer\">written by " + tweet.getName() + "</div>");
                out.println("</div>");
                out.println("</div>");
                out.print("</body></html>");*/
        }
    /*protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        List<Tweet> tweets = csReader.ReadingFromCSV();
        resp.setContentType("text/html");
        PrintWriter pw = resp.getWriter();
        StringBuilder sb = new StringBuilder();
        sb.append("<!DOCTYPE html PUBLIC> " +
                "<html>" +
                "<head>" +
                "<title>Newsfeed</title>" +
                "</head>" +
                "<body>" +
                "<h1>This is the newsfeed page</h1>");
        for (Tweet tweet : tweets) {
            sb.append(
                    "<h2>" + tweet.getTweet() + "/h2>" +
                            "<h3>" + tweet.getName() + "</h3>");
        }
        sb.append("</body>" +
                "</html>");
        pw.append(sb);
        pw.close();
    }*/
    }
}

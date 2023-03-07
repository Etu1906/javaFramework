package etu1906.framework.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.servlet.*;
import javax.servlet.http.*;
import model.util.Utilitaire;
// /home/ralph/ralph/apache-tomcat-8.5.82/webapps/framework/WEB-INF/classes
public class FrontServlet extends HttpServlet{

    protected void processRequest(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
        String url = req.getRequestURL().toString();  
        String value = Utilitaire.getUrl( url );
        PrintWriter out = res.getWriter();
        out.println((value));
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
        processRequest(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
        processRequest(req, res);
    }
}

package org.iesvdm.ejerciciosjsp;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Welcome Servlet Ejercicios JSP!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");


        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Ejercicios JSP</title>");
        out.print("<style>"
                + "* { margin: 0; padding: 0; box-sizing: border-box; font-family: 'Montserrat', sans-serif; text-align: center; font-weight: 100; color: white; }"
                + "body { background: #191919; }"
                + "h1 { padding: 30px 0; background: darkslategrey; border-bottom: 2px solid black; font-size: 2.25em; margin: 0 0 380px 0; }"
                + "a { font-size: 2.5em; text-decoration: none; transition: color 0.5s; }"
                + "a:hover { color: darkslategrey; }"
                + "</style>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<a href='index.jsp'>Ejercicios</a>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
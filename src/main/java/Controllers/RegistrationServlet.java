package Controllers;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "registrationServlet", value = "/registration-servlet")
public class RegistrationServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Register";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        String surname=request.getParameter("surname");
        String name=request.getParameter("name");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        out.println("Login Success...!");
        if(surname.equals("test"))
            out.println("Login Success...!");
        else
            out.println("Login Failed...!");
        out.close();
    }

    public void destroy() {
    }
}

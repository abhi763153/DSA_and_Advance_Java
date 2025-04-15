package AlphaBrains;

import jakarta.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;

public class ServletContainer extends GenericServlet {

    public void service (ServletRequest request, ServletResponse response) throws  ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        pw.println("Hello world!");

        pw.close();
    }

}

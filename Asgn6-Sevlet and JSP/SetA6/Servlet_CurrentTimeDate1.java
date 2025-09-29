package SetA6;
import java.io.*;
import java.net.http.HttpResponse;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet_CurrentTimeDate1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = ((Object) response).getWriter();
        Date currentDate = new Date();
        out.println("<html><body>");
        out.println("<h2>Current Date and Time: " + currentDate.toString() + "</h2>");
        out.println("</body></html>");
    }
}

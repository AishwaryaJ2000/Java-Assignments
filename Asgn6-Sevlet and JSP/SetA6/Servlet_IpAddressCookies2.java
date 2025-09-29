package SetA6;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class Servlet_IpAddressCookies2 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String clientIP = request.getRemoteAddr();
        boolean returningVisitor = false;

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visited")) {
                    returningVisitor = true;
                    break;
                }
            }
        }

        if (returningVisitor) {
            out.println("<h2>Welcome-back IP address of client: " + clientIP + "</h2>");
        } else {
            out.println("<h2>Welcome IP address of client: " + clientIP + "</h2>");
            Cookie visitCookie = new Cookie("visited", "true");
            visitCookie.setMaxAge(60 * 60 * 24); // 1 day
            response.addCookie(visitCookie);
        }
    }
}

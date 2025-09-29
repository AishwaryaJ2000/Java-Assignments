package SetA6;

public class JSP_PageWords3 {

}
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Number to Words</title></head>
<body>
    <form method="post">
        Enter a number: <input type="text" name="num" />
        <input type="submit" value="Convert" />
    </form>

<%
    String numStr = request.getParameter("num");
    if (numStr != null && numStr.matches("\\d+")) {
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        out.print("<h3>In Words: ");
        for (char digit : numStr.toCharArray()) {
            out.print(words[Character.getNumericValue(digit)] + " ");
        }
        out.print("</h3>");
    }
%>
</body>
</html>

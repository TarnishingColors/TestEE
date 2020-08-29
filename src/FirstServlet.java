import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello-world")
public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String name = request.getParameter("name");
        PrintWriter pw = response.getWriter();

        pw.println("<html>");
        pw.println("<h1> Kentrosaurus </h1>");
        if (name == null) {
            pw.println("<p> Hello, unknown master </p>");
        } else {
            pw.println("<p> Hello, " + name + "</p>");
        }
        pw.println("</html");
    }
}

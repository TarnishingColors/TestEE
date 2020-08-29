import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/3rd")
public class ThirdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        Integer counter = (Integer) session.getAttribute("count");

        if (counter == null) {
            counter = 0;
        }

        session.setAttribute("count", counter + 1);

        PrintWriter pw = response.getWriter();
        pw.println("<html>");
        pw.println("<h1> Hi, visitor </h1");
        pw.println("<p> you visit this page for " + counter + " time </p>");
    }
}

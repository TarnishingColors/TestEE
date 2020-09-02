import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;

@WebServlet("/hello-world")
public class FirstServlet extends HttpServlet {
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
        pw.println("<p>" + Thread.currentThread().getName() + "</p>");
        pw.println("</html");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(() -> {
                try {
                    URLConnection urlConnection =
                            new URL("http://localhost:8080/hello-world").openConnection();
                    urlConnection.getInputStream();
                    System.out.println(Thread.currentThread().getName());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormularioServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        
        // Aquí puedes realizar operaciones con los datos recibidos, como guardarlos en una base de datos
        
        response.sendRedirect("exito.html"); // Redirige a una página de éxito
    }
}

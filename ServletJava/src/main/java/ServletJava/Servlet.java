package ServletJava;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html;charset=UTF-8");
		// obtenemos los datos del formulario
		String usuario = req.getParameter("usuario");
		String password = req.getParameter("password");
		String[] tecnologias = req.getParameterValues("tecnologia");
		String genero = req.getParameter("genero");
		String ocupacion = req.getParameter("ocupacion");
		String[] musicas = req.getParameterValues("musica");
		String comentarios = req.getParameter("comentarios");
		
		// imprimimos en la consola del servidor glassfish
		System.out.println("Usuario: " + usuario);
		System.out.println("Password: " + password);
		
		// imprimimos en el cliente
		PrintWriter out = resp.getWriter();
		
		out.print("El usuario es: " + usuario);
		out.print("<br>");
		
		out.print("La password es: " + password);
		out.print("<br>");
		
		out.print("Las tecnologias son:");
		out.print("<br>");
		
		for(String tecnologia : tecnologias) {
			out.print("-" + tecnologia);
			out.print("<br>");
		}
		
		out.print("El genero es: " + genero);
		out.print("<br>");
		
		out.print("La ocupacion es: " + ocupacion);
		out.print("<br>");
		
		if(musicas != null) {
			out.print("La musica favorita es: ");
			out.print("<br>");
			
			for(String musica : musicas) {
				out.print("-" + musica);
				out.print("<br>");
			}
		}
		
		out.print("Comentarios: " + comentarios);
		out.print("<br>");
	}
}

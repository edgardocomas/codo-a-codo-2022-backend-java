package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.daos.ProductoDAO;

/*HERENCIA*/
//Create Controller es hijo de :
@WebServlet("/CreateController")

public class CreateController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recibe los datos del front
		
		// en req viene los datos que manda el formulario html
		//clave=valor
			
		String nombre = req.getParameter("nombre");
		String precio = req.getParameter("precio");
		String imagen = req.getParameter("imagen");
		String codigo = req.getParameter("codigo");
		
		// Crear producto DAO
		ProductoDAO dao =new ProductoDAO();
		
		//ejecutar el metodo craerProducto(parametros...)
		dao.crearProducto(nombre, Float.parseFloat(precio), imagen, codigo);
		
		//CTRL+SHIST+O limpia los import dejando solo los que se usan	
		
		// ir a la siguiente pagina
		resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
	}


}

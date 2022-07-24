package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import ar.com.codoacodo.daos.ProductoDAO;
import ar.com.codoacodo.dto.Producto;

@WebServlet("/api/EditarController")
public class EditarController extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		String sql = "SELECT * FROM PRODUCTO WHERE ID="+id;
		
		//Crear ProductoDAO
		ProductoDAO dao = new ProductoDAO();
		
		
		//invocar el metodo obtenerPorId(id)
		Producto myprodFromDb = dao.obtenerPorId(Long.parseLong(id));

		//conexion OK
		Connection con = AdministradorDeConexiones.getConnection();
		
		try {
			//statement 
			Statement st = con.createStatement();
			
			//resultset
			ResultSet rs = st.executeQuery(sql);
			
			myprodFromDb = null;
			
			if(rs.next()) {//�mientras tenga datos?
				// rs > sacando los datos
				Long idProducto = rs.getLong(1);//tomar la primer columna
				String nombre = rs.getString(2);
				Float precio = rs.getFloat(3);
				Date fecha = rs.getDate(4);
				String imagen = rs.getString(5);
				String codigo = rs.getString(6);
				
				//campos crear un objeto????
				myprodFromDb = new Producto(idProducto,nombre,precio,fecha,imagen,codigo);
			}
			
			//ir a otra pagina y ademas pasarle datos				
			req.setAttribute("producto", myprodFromDb);
			
			getServletContext().getRequestDispatcher("/editar.jsp").forward(req, resp);
			
			//cierre de conexion
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		//guardar en el request el producto
		req.setAttribute("producto", myprodFromDb);

		//ir a la siguiente pagina
		getServletContext().getRequestDispatcher("/editar.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String nombre = req.getParameter("nombre");//titulo1
		String precio = req.getParameter("precio");//1500
		String imagen = req.getParameter("imagen");
		String codigo = req.getParameter("codigo");//0001
		
		
		Connection con = AdministradorDeConexiones.getConnection();
		if(con != null) { 
			String sql = "UPDATE PRODUCTO "
					+ " set nombre='"+nombre+"',"
					+ " precio='"+precio+"'"
					+ " WHERE codigo = '"+codigo+"'"; 		
			
			//Crear ProductoDAO
			//ProductoDAO dao = new ProductoDAO();
		
			try {
				Statement st = con.createStatement();			
				st.executeUpdate(sql);
				
				con.close();
				
				resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
			}catch (Exception e) {
				e.printStackTrace();
			}
		
			//invocar actualizarProducto(params)
		    //dao.actualizarProducto(codigo, nombre, precio);
         }
		//ir a la siguiente pagina
		//resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
	}
}



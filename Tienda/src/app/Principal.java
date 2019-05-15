package app;



import java.sql.SQLException;

import dominio.Categoria;
import dominio.CategoriaDAO;
import dominio.CategoriaDAOMySQL;



public class Principal {
	public static void main(String[] args) {
		CategoriaDAO catDao = new CategoriaDAOMySQL();
		try {
			System.out.println("eliminar:");
			catDao.eliminar(new Categoria(5, "Categoria Principal", "Descripcion categoria princial"));
			System.out.println("agregar:");
			catDao.agregar(new Categoria(5, "Categoria Principal", "Descripcion categoria princial"));
			System.out.println("modificar:");
			catDao.modificar(new Categoria(5, "Categoria Principal", "Descripcion categoria modificadad"));
			System.out.println("obtener por id=2");
			System.out.println(catDao.obtenerPorId(2).getNombre());
			System.out.println("el numero de categorias son");
			System.out.println(catDao.obtenerTodas().size());
		
			
			
			
			
			System.out.println("Metodos ejecutados" );
		}
		
		catch (SQLException e) {
			System.out.println("Error al conectarse con la base de datos"+e.getMessage());
		}
		
		catch (Exception e) {
			System.out.println("Error"+e.getMessage());
		}
		
		
		
	}
}

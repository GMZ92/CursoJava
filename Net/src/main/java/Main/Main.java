package Main;

import java.sql.SQLException;
import java.util.List;

import Service.CatTipoFabricaService;
import domain.CatTipoFabrica;

/**
 * Clase Principal
 * @author NetaSystems/Gonzalo
 */
public class Main {

	/**
	 * Metodo Main
	 * @param args Argumentos
	 */
	public static void main(String[] args) {

		System.out.println("Iniciando programa de conexion a base de datos!");
		
		CatTipoFabricaService service = null;
		
		try {
			 service = new CatTipoFabricaService();
			 
			 //Agregar
			 //CatTipoFabrica addFabrica = new CatTipoFabrica(6, "FabricaDos", '1', null,1);
			 //service.addFabrica(addFabrica);
			 
			 //Editar
			 //CatTipoFabrica updFabrica = new CatTipoFabrica(6, "FabricaDos", '1', null,1);
			 //service.updFabrica(updFabrica);
			 
			 //Eliminar
			 //CatTipoFabrica delFabrica = new CatTipoFabrica(6,"",'0',null,0);
			 //service.delFarbica(delFabrica);
			 
			 //Lista
			 List<CatTipoFabrica> lista = service.getAllRecords();
			 
			 for(CatTipoFabrica c : lista) {
				 System.out.println(c);
			 }
			 
		} catch (Exception e) {
			System.out.println("Ha caido en excepcion con mensaje: "+e.getMessage());
		} finally {
			try {
				service.close();
			} catch (SQLException e) {
				System.out.println("No se pueden cerrar los recursos: "+e.getMessage());
			}
		}
		

	}
}
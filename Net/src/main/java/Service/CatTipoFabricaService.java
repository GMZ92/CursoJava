package Service;

import java.sql.SQLException;
import java.util.List;

import Dao.CatTipoFabricaDAO;
import domain.CatTipoFabrica;

/**
 * Clase Catalogo Tipo Fabrica Service
 * @author Netasystems/Gonzalo
 */
public class CatTipoFabricaService {

	/**
	 * Declaracion de clase dao 
	 */
	private CatTipoFabricaDAO dao;
	
	/**
	 * Metodo que instanciamos el objeto llamado dao a la clase CatTipoFabrica
	 * @throws ClassNotFoundException Mensaje de detalle.
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao = new CatTipoFabricaDAO();
	}
	
	/**
	 * Metodo Cierre de conexion de la clase CattipoFabricaDAO
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public void close() throws SQLException {
		dao.destroy();
	}
	
	/**
	 * Metodo Lista de la de la clase CattipoFabricaDAO
	 * @return Una lista
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
	}
	
	/**
	 * Metodo Agregar de la clase CattipoFabricaDAO
	 * @param record Parametro de la clase CatTipoFabrica
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public void addFabrica(CatTipoFabrica record) throws SQLException
	{
		dao.addRecord(record);
	}
	
	/**
	 * Metodo Editar de la clase CattipoFabricaDAO
	 * @param record Parametro de la clase CatTipoFabrica
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public void updFabrica(CatTipoFabrica record) throws SQLException
	{
		dao.updateRecord(record);
	}
	
	/**
	 * Metodo Eliminar de la clase CattipoFabricaDAO
	 * @param record Parametro de la clase CatTipoFabrica
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public void delFarbica(CatTipoFabrica record) throws SQLException
	{
		dao.deleteRecord(record);
	}
	

}

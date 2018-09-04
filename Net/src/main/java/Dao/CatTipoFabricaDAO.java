package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import domain.CatTipoFabrica;

/**
 * Clase Catalogo Tipo FabricaDAO
 * @author NetaSystems/Gonzalo
 *
 */
public class CatTipoFabricaDAO {

	/**
	 * Variable conexion con
	 */
	private Connection con;
	
	/**
	 * Metodo Conexion
	 * @throws ClassNotFoundException Mensaje de detalle.
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public CatTipoFabricaDAO() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(  
				"jdbc:oracle:thin:@198.23.75.98:1521:neta","EGLOBAL","egl0b4l");  
	}
	
	/**
	 * Metodo Cierre de conexion
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public void destroy() throws SQLException {
		con.close();
	}
	
	
	/**
	 * Metodo Consulta informacion en lista
	 * @return La lista
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		
		List<CatTipoFabrica> lista = new ArrayList<CatTipoFabrica>();
		String sql = "select IDCATTIPOFABRICA, NOMBRE, ESTATUS, FECHAMODIFICACION, IDUSUARIO from CAT_TIPO_FABRICA";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next()) {
			long idCatTipoFabrica = rs.getLong("IDCATTIPOFABRICA");
			String nombre = rs.getString("NOMBRE");
			String estatusString = rs.getString("ESTATUS");
			Date fechaModificacion = rs.getDate("FECHAMODIFICACION");
			Long idUsuario = rs.getLong("IDUSUARIO");
			//Arreglando el char de estatus
			Character status = null;
			if(estatusString != null && !estatusString.isEmpty()) {
				char est = estatusString.charAt(0);
				status = est;
			}
			CatTipoFabrica registro = new CatTipoFabrica(idCatTipoFabrica, nombre, status, fechaModificacion, idUsuario);
			lista.add(registro);
		}
		rs.close();
		stmt.close();
		return lista;
	}
	
	
	/**
	 * Metodo Agregar Fabrica
	 * @param record Paramatros de la clase CatTipoFabrica
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public void addRecord(CatTipoFabrica record) throws SQLException {
		
		String sqladd = "INSERT INTO CAT_TIPO_FABRICA (IDCATTIPOFABRICA, NOMBRE, ESTATUS, FECHAMODIFICACION, IDUSUARIO) VALUES (?,?,?,?,?)";
		PreparedStatement stmt;
		
		stmt = con.prepareStatement(sqladd);
		stmt.setLong(1,record.getIdCatTipoFabrica());
		stmt.setString(2, record.getNombre());
		stmt.setString(3, record.getStatus()+"");
		stmt.setDate(4, (java.sql.Date) record.getFechaModificacion());
		stmt.setLong(5, record.getIdUsuario());
		stmt.executeUpdate();
	
		stmt.close();
	}
	
	
	/**
	 * Metodo Editar Fabrica
	 * @param record Paramatros de la clase CatTipoFabrica 
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public void updateRecord(CatTipoFabrica record)throws SQLException {
		
		String sqlupd = "UPDATE CAT_TIPO_FABRICA SET NOMBRE = ?, ESTATUS = ?, FECHAMODIFICACION = ?, IDUSUARIO = ? WHERE IDCATTIPOFABRICA = ?";
		PreparedStatement stmt;
		
		stmt = con.prepareStatement(sqlupd);
		stmt.setString(1, record.getNombre());
		stmt.setString(2, record.getStatus()+"");
		stmt.setDate(3, (java.sql.Date) record.getFechaModificacion());
		stmt.setLong(4, record.getIdUsuario());
		stmt.setLong(5,record.getIdCatTipoFabrica());
		
		stmt.executeUpdate();
		
		stmt.close();
	}
	
	/**
	 * Metodo Eliminar Fabrica
	 * @param record Paramatros de la clase CatTipoFabrica
	 * @throws SQLException Excepciones de tipo SQL
	 */
	public void deleteRecord(CatTipoFabrica record)throws SQLException {
	
		String sqldel = "DELETE FROM CAT_TIPO_FABRICA WHERE IDCATTIPOFABRICA = ?";
		PreparedStatement stmt;
		
		stmt = con.prepareStatement(sqldel);
		stmt.setLong(1,record.getIdCatTipoFabrica());
		
		stmt.executeUpdate();
		
		stmt.close();
		
	}

	
}

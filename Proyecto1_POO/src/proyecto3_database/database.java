package proyecto3_database;

import java.sql.*;

/*
 * database... EN ESTA CLASE:
 * -METODOS PARA ESTABLECER LA CONEXION CON LA BASE DE DATOS
 * -METODOS PARA INGRESAR ANIMALES A LAS TABLAS RESPECTIVAS
 * -METODOS PARA EDITAR ANIMALES (MODIFICAR Y ELIMINAR)
 * -METODOS PARA VISUALIZAR LAS TABLAS DE TODOS LOS ANIMALES DENTRO DE LA BBDD
 * -METODO PARA CERRAR LA CONEXION CON LA BASE DE DATOS
 */

public class database {

	private static database DB = new database();
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driverDB = "org.postgresql.Driver";
	private String dbName = "Zoologico";
	private String urlDB = "jdbc:postgresql://localhost:5432/" + this.dbName;
	private String userDB = "postgres";
	private String passDB = "masterkey"; 
	
	public int ID=0;
	
	//CONSTRUCTOR DE LA CLASE database
	private database(){
		try {
			Class.forName(driverDB);
			this.conn = DriverManager.getConnection(urlDB, userDB, passDB);
			System.out.println("Conexion establecida");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	//METODO PARA OBTENER LA INSTANCIA DE LA CLASE database
	public static database getInstances() {
		return DB;
	} 
	
	//METODO PARA OBTENER ID A ASIGNAR A LOS ANIMALES (AUTOMATICAMENTE, LOS ID'S NO LOS INGRESA EL USUARIO PARA EVITAR ERRORES DEBIDO A QUE ES POCO INTUITIVO)
	public int dbGetID(String query) {
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
				for(int i=rs.getInt("identificacion");i>0;i--) {	
					while(ID<rs.getInt("identificacion")) {
						ID=rs.getInt("identificacion");
					}
				}

			}
			ID++;
			System.out.println("proximo id: " + ID);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.stmt.close();
				this.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return ID;
	}
	
	//METODO QUE PERMITE INGRESAR PARAMETROS A TABLA GLOBAL DE ANIMALES
	public void dbPStmtIngresarTablaTodos(String query, Object[] obj) {
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setInt(1,(int) obj[0]);
			this.pstmt.setString(2, (String) obj[1]);
			this.pstmt.setString(3, (String) obj[2]);
			this.pstmt.setString(4, (String) obj[3]);
			this.pstmt.setInt(5, (int) obj[4]);
			this.pstmt.setDouble(6, (double) obj[5]);
			this.pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//METODO QUE PERMITE MODIFICAR ANIMALES
	public void dbModificarAnimal(String query) {
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	//METODO QUE PERMITE INGRESAR PARAMETROS A TABLAS DE ANIMALES PROPIAS (ESPECIALES)
	public void dbPStmtIngresarAnimalesEspeciales(String query, Object[] obj) {
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setInt(1, (int) obj[0]);
			this.pstmt.setString(2, (String) obj[1]);
			this.pstmt.setInt(3, (int) obj[2]);
			this.pstmt.setDouble(4, (double) obj[3]);
			this.pstmt.setString(5, (String)obj[4]);
			this.pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//METODO QUE PERMITE INGRESAR PARAMETROS + EXTRA A TABLA GLOBAL DE ANIMALES
	public void dbPStmtIngresarTablaTodosExtra(String query, Object[] obj) {
		try {
			this.pstmt = this.conn.prepareStatement(query);
			this.pstmt.setInt(1,(int) obj[0]);
			this.pstmt.setString(2, (String) obj[1]);
			this.pstmt.setString(3, (String) obj[2]);
			this.pstmt.setString(4, (String) obj[3]);
			this.pstmt.setInt(5, (int) obj[4]);
			this.pstmt.setDouble(6, (double) obj[5]);
			this.pstmt.setString(7, (String)obj[6]);
			this.pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
		
		
	//METODO PARA LA IMPRESION DE LOS JTEXTAREA DE TABLA DE TODOS LOS ANIMALES
	public String dbStatementTablaCompletaString(String query) {
		int i=0;
		String[] animalesCompletos = new String[100];
		String id=null, animal=null, especie=null, apodo=null, edad=null, peso=null;
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
				id = "| " + rs.getString("identificacion");
				animal = "| " + rs.getString("animal");
				especie = "| " + rs.getString("especie");
				apodo = "| " + rs.getString("apodo");
				edad = "| " + rs.getString("edad");
				peso = "| " + rs.getString("peso");
				animalesCompletos[i]=id + "\t" + animal + "\t" + especie + "\t" + apodo + " \t" + edad + "\t" + peso + "\t|";
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.stmt.close();
				this.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		String encabezado=" ___________________________________________________________________________\n| No. ID\t| Animal\t| Especie\t| Apodo\t| Edad\t| Peso\t|\n|____________|____________|____________ |____________|____________|____________ |";
		String totales="";
		for(int j=0;animalesCompletos[j]!=null;j++) {
			totales = totales + "\n" + "" +animalesCompletos[j]+"\n|____________|____________|____________ |____________|____________|____________ |";
		}
		encabezado=encabezado+totales;
		return encabezado;
	}
	
	//METODO PARA LA IMPRESION DE LOS JTEXTAREA DE TABLA PROPIA DE LOS ANIMALES
	public String dbStmtTablaPropiaString(String query) {
		int i=0;
		String[] animal = new String[100];
		String id=null, apodo=null, edad=null, peso=null;
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
				id = "| " + rs.getString("identificacion");
				apodo = "| " +  rs.getString("apodo");
				edad = "| " +  rs.getString("edad");
				peso = "| " +  rs.getString("peso");
				animal[i]=id + "\t" + apodo + " \t" + edad + "\t" + peso + "\t|";
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.stmt.close();
				this.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		String encabezado=" __________________________________________________\n| No. ID\t| Apodo\t| Edad\t| Peso\t|\n|____________|____________|____________ |____________|";
		String totales="";
		for(int j=0;animal[j]!=null;j++) {
			totales = totales + "\n" +animal[j] + "\n|____________|____________|____________ |____________|";
		}
		encabezado=encabezado+totales;
		return encabezado;
	}
	
	//IMPRESION PARA JTEXTAREA DE TABLA PROPIA DE LOS ANIMALES ESPECIALES
	public String dbStmtTablaEspecialesString(String query) {
		int i=0;
		String[] animal = new String[100];
		String id=null, apodo=null, edad=null, peso=null, extra=null;
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
				id = "| " + rs.getString("identificacion");
				apodo = "| " +  rs.getString("apodo");
				edad = "| " +  rs.getString("edad");
				peso = "| " +  rs.getString("peso");
				extra = "| " + rs.getString(7);
				animal[i]=id + "\t" + apodo + " \t" + edad + "\t" + peso + "\t" + extra + "\t|";
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.stmt.close();
				this.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		String encabezado=" _______________________________________________________________\n| No. ID\t| Apodo\t| Edad\t| Peso\t| Carac.Extra\t|\n|____________|____________|____________ |____________|____________ |";
		String totales="";
		for(int j=0;animal[j]!=null;j++) {
			totales = totales + "\n" +animal[j] + "\n|____________|____________|____________ |____________|____________ |";
		}
		encabezado=encabezado+totales;
		return encabezado;
	}
	
	//METODO QUE PERMITE COMPROBAR SI EXISTE UN ANIMAL CON ESE ID PARA PODER EDITARLO (MODIFICAR / ELIMINAR)
	public int dbStmtExisteID(String query) {
		int i=0;
		String id=null;
		try {
			this.stmt = this.conn.createStatement();
			this.rs = this.stmt.executeQuery(query);
			while(rs.next()) {
				id = rs.getString("identificacion");
				if (id!=null) {
					i=1;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				this.stmt.close();
				this.rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		System.out.println("El valor de i es: " + i);
		return i;
	}
	
	//METODO QUE PERMITE FINALIZAR LA CONEXION CON LA BBDD
	public void dbClose() {
		try {
			this.conn.close();
			System.out.println("Conexion cerrada");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	} 
	
}

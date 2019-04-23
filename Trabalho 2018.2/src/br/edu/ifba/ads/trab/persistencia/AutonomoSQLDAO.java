package br.edu.ifba.ads.trab.persistencia;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;
import br.edu.ifba.ads.trab.entidades.Coordenadas;
import br.edu.ifba.ads.trab.entidades.VeiculoTerrestre;
import br.edu.ifba.ads.trab.entidades.Drone;

public class AutonomoSQLDAO implements AutonomoDAO {
			
			private static final String DRIVER_NAME = "org.hsqldb.jdbcDriver";
			private static final String DB_URI = "jdbc:hsqldb:hsql://localhost/";
			private static final String DB_USER = "SA";
			private static final String DB_PWD = "";
			private static final String INSERIR = "INSERT INTO AUTONOMOS(matricula, capacidade, latitude, longitude, id) VALUES(?, ?, ?, ?, ?)";
			private static final String BUSCAR = "SELECT* FROM AUTONOMOS";
			private static final String	UPDATE_LATITUDE = "UPDATE AUTONOMOS SET latitude = ? WHERE matricula = ? ";
			private static final String UPDATE_LONGITUDE = "UPDATE AUTONOMOS SET longitude = ? WHERE matricula = ? ";
			private static final String BUSCAR_BY_CAPACIDADE = "SELECT* FROM AUTONOMOS WHERE capacidade >= ?";
			
			public AutonomoSQLDAO() throws SQLException, ClassNotFoundException {
				Class.forName(AutonomoSQLDAO.DRIVER_NAME);
			};
			
			private Connection getConnection() throws SQLException {
				return DriverManager.getConnection(AutonomoSQLDAO.DB_URI, 
						AutonomoSQLDAO.DB_USER, AutonomoSQLDAO.DB_PWD);
			};
			
			
		
			public void inserir(VeiculoAutonomo veiculo) throws Exception {
				PreparedStatement stmt = this.getConnection().prepareStatement(AutonomoSQLDAO.INSERIR);
				stmt.setString(1, veiculo.getMatricula());
				stmt.setDouble(2, veiculo.getCapacidade());
				stmt.setInt(3, veiculo.getOrigem().getLatitude());
				stmt.setInt(4, veiculo.getOrigem().getLongitude());
					if(veiculo instanceof VeiculoTerrestre) {
				stmt.setInt(5, 0);
					}
					else {
					stmt.setInt(5, 1);
					}
				
				stmt.execute();
				stmt.close();
			};
		
			
		   public VeiculoAutonomo buscar() throws Exception {
				PreparedStatement stmt = this.getConnection().prepareStatement(AutonomoSQLDAO.BUSCAR);
				ResultSet rSet = stmt.executeQuery();
				while(rSet.next())
					System.out.println(rSet.getString("matricula") + "- " + rSet.getString("capacidade") + " / " + rSet.getInt("latitude") + "/" + rSet.getInt("longitude"));
				rSet.close();
				stmt.close();
				return null;
			};
		
			
			public ArrayList<VeiculoAutonomo> findVeiculosByPeso (double peso) throws SQLException {
				
				PreparedStatement stmt = this.getConnection().prepareStatement(AutonomoSQLDAO.BUSCAR_BY_CAPACIDADE);
				stmt.setDouble(1, peso);
				stmt.execute();
				ResultSet rSet = stmt.executeQuery();
				ArrayList<VeiculoAutonomo> veiculos = new ArrayList<VeiculoAutonomo>();
				
				VeiculoAutonomo veiculo = null;
				
				while( rSet.next() ) {
					
					String matricula = rSet.getString("matricula");
					double capacidade = rSet.getDouble("capacidade");
					int latitude = rSet.getInt("latitude");
					int longitude = rSet.getInt("longitude");
					int id = rSet.getInt("id");
					if(id==0) {
					veiculo = new VeiculoTerrestre( matricula, capacidade, new Coordenadas(latitude,longitude));
					}
					else {
					veiculo = new Drone (matricula, capacidade, new Coordenadas(latitude,longitude));
					}
					veiculos.add(veiculo);
			      }
				
			return veiculos;	
		    };
			
			public void updateCoordenadas (int latitude,int longitude, String matricula) throws SQLException {
			
				PreparedStatement stmt = this.getConnection().prepareStatement(AutonomoSQLDAO.UPDATE_LATITUDE);
			
				stmt.setInt(1, latitude);
				stmt.setString(2, matricula);
			    stmt.executeUpdate();
			
			    PreparedStatement stmt2 = this.getConnection().prepareStatement(AutonomoSQLDAO.UPDATE_LONGITUDE);
			    stmt2.setInt(1, longitude);
				stmt2.setString(2, matricula);
			    stmt2.executeUpdate();
			}
			
}
package br.edu.ifba.ads.trab.persistencia;

	import java.util.ArrayList;
	import java.sql.SQLException;
    import java.lang.reflect.Array;
    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;


	import br.edu.ifba.ads.trab.entidades.Drone;
    import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;
    import br.edu.ifba.ads.trab.persistencia.AutonomoSQLDAO;
	import br.edu.ifba.ads.trab.entidades.Coordenadas;
	import br.edu.ifba.ads.trab.entidades.VeiculoTerrestre;


	public class Teste {
		
		public void run() throws Exception {
			
			VeiculoTerrestre novo = new VeiculoTerrestre("teste2", 0,new Coordenadas(0,0));
			AutonomoSQLDAO teste = new AutonomoSQLDAO();
			teste.inserir(novo);
		};
		
		public void run2() throws Exception {
			AutonomoSQLDAO teste1 = new AutonomoSQLDAO();
			ArrayList<VeiculoAutonomo> veiculos; 
			veiculos = teste1.findVeiculosByPeso(0);
			for(VeiculoAutonomo v: veiculos) {
			System.out.println(v.getMatricula());
			}
		};
		
		public static void main(String[] args) throws Exception, SQLException, ClassNotFoundException {
			(new Teste()).run2();
			System.out.println("Finalizando");
		}
		
	}


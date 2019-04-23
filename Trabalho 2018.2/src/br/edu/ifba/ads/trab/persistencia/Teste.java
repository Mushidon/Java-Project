package br.edu.ifba.ads.trab.persistencia;

	import java.util.ArrayList;
	import java.sql.SQLException;
   


	import br.edu.ifba.ads.trab.entidades.Drone;
    import br.edu.ifba.ads.trab.entidades.VeiculoAutonomo;
    import br.edu.ifba.ads.trab.persistencia.AutonomoSQLDAO;
	import br.edu.ifba.ads.trab.entidades.Coordenadas;
	import br.edu.ifba.ads.trab.entidades.VeiculoTerrestre;


	public class Teste {
		
		public void run() throws Exception {
			
			VeiculoTerrestre novo = new VeiculoTerrestre("teste1", 10,new Coordenadas(10,11));
			VeiculoTerrestre novo2 = new VeiculoTerrestre("teste2", 20,new Coordenadas(11,12));
			VeiculoTerrestre novo3 = new VeiculoTerrestre("teste3", 30,new Coordenadas(12,13));
			VeiculoTerrestre novo4 = new VeiculoTerrestre("teste4", 40,new Coordenadas(13,14));
			VeiculoTerrestre novo5 = new VeiculoTerrestre("teste5", 50,new Coordenadas(14,15));
			Drone novo6 = new Drone("teste6", 60,new Coordenadas(1,2));
			Drone novo7 = new Drone("teste7", 70,new Coordenadas(3,4));
			Drone novo8 = new Drone("teste8", 80,new Coordenadas(5,6));
			Drone novo9 = new Drone("teste9", 90,new Coordenadas(7,8));
			Drone novo10 = new Drone("teste10", 100,new Coordenadas(9,10));
			AutonomoSQLDAO teste = new AutonomoSQLDAO();
			teste.inserir(novo);
			teste.inserir(novo2);
			teste.inserir(novo3);
			teste.inserir(novo4);
			teste.inserir(novo5);
			teste.inserir(novo6);
			teste.inserir(novo7);
			teste.inserir(novo8);
			teste.inserir(novo9);
			teste.inserir(novo10);
		};
		
		public void run2() throws Exception {
			AutonomoSQLDAO teste1 = new AutonomoSQLDAO();
			ArrayList<VeiculoAutonomo> veiculos; 
			veiculos = teste1.findVeiculosByPeso(10);
			for(VeiculoAutonomo v: veiculos) {
			System.out.println(v.calculateCusto(new Coordenadas(10,22), 80));
			}
		};
		
		public void run3() throws Exception {
			AutonomoSQLDAO teste = new AutonomoSQLDAO();
			teste.updateCoordenadas(1, 2, "teste1");
			teste.updateCoordenadas(3, 4, "teste2");
			teste.updateCoordenadas(5, 6, "teste3");
			teste.updateCoordenadas(7, 8, "teste4");
			
		};
		
		public void run4() throws Exception {
			AutonomoSQLDAO teste = new AutonomoSQLDAO();
			ArrayList<VeiculoAutonomo> veiculos; 
			veiculos = teste.findVeiculosByPeso(60);
			Coordenadas cord = new Coordenadas (25,38);
			for(VeiculoAutonomo v: veiculos) {
			System.out.println(v.getMatricula() + ":" + v.calculateCusto(cord, 100));
		
			}
		}
		
		public static void main(String[] args) throws Exception, SQLException, ClassNotFoundException {
			(new Teste()).run4();
			System.out.println("Finalizando");
		}
		
	}


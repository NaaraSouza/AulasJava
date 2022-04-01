
public class Main {
public static void main(String[] args) {
	
	Carro carro1 = new Carro();

			carro1.ano = 1936;
			carro1.setMarca ("Mercedez");
			carro1.setModelo ("IMC5");
			carro1.setQuatroPortas(true);
			
			carro1.imprimirDados();
			carro1.Buzina();
			
			
			System.out.println();
			System.out.println();
			
			Moto moto1= new Moto();
			
			moto1.setAno(2022);
			moto1.setMarca("Honda");
			moto1.setModelo("Titan");
			
			moto1.imprimirDados();
			moto1.empinar();
			moto1.Buzina();
			
			System.out.println();
			
			Caminao caminhao1 = new Caminao();
			
			caminhao1.ano=2022;
			caminhao1.setMarca("Scania");
			caminhao1.setModelo("RI400");
			
			caminhao1.imprimirDados();
			caminhao1.Buzina();
			
			}






	
	
}

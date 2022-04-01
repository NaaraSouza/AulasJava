
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Gato gato1 = new Gato();
		Cachorro cachorro1 = new Cachorro ();
		
//		gato1.Falar();
//		cachorro1.Falar();
		
		Animal animal= new Cachorro();
		
		animal=gato1;
		
		
		if(animal instanceof Cachorro) {
			
		System.out.println("Cachorro");
		}else if (animal instanceof Gato){
			System.out.println("Gato");
		}
		
		
		Falar(gato1);
		Falar(cachorro1);
		
		
	}
	
	private static void Falar(Animal a) {
		
		a.Falar();
	
	}

}

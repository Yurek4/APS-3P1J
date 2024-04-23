import java.util.List;



public class TesteAcessoDados {

	public static void main(String[] args) {
		
		List<Carro> Carros = AcessoDados.loadCarros("files/carros.csv");
		
		System.out.println("");
        System.out.println("No teste carros");
        
        for(Carro Carro: Carros) {
        	System.out.println(Carro);
        	
        }
		Carros.add(new Carro("Uno", "Turbo", 2000, 20000));
		Carros.add(new Carro("Clio", "Turbo", 1990, 15000));
		
		System.out.println(Carros);

	}

}

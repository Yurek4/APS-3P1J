import java.util.List;



public class TesteAcessoDados {

	public static void main(String[] args) {
		
		List<Carro> Carros = AcessoDados.loadCarros("files/carros.csv");
		
		System.out.println("");
        System.out.println("No teste carros");
        
        for(Carro Carro: Carros) {
        	System.out.println(Carro);
        	
        }
		
		Carros.add(new Carro("Camaro", "Turbo", 2018, 30000));
		
		
		System.out.println(Carros);
		
		AcessoDados.saveCarros(Carros, "files/carros.csv");
	}

}


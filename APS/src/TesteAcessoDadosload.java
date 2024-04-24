import java.util.List;



public class TesteAcessoDadosload {

	public static void main(String[] args) {
		
		List<Carro> Carros = AcessoDados.loadCarros("files/carros.csv");
		
	
		for(Carro c: Carros)
			System.out.println(c);
		
			
		
		
	}

}


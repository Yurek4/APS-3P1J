
public class Carro {
	private String nomedocarro;
	private String modelo;
	private int ano;
	private double preco;
	
	public Carro(String nomedocarro, String modelo, int ano, double preco) {
		super();
		this.nomedocarro = nomedocarro;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}

	public String getNomedocarro() {
		return nomedocarro;
	}

	public String getModelo() {
		return modelo;
	}


	public int getAno() {
		return ano;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public String toString() {
		return "Carro [nomedocarro=" + nomedocarro + ", modelo=" + modelo + ", ano=" + ano + ", preco=" + preco + "]";
	}

	
	
	

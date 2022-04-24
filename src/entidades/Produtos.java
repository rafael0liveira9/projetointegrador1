package entidades;

public class Produtos {
	
// Variaveis de classe //
	
	public int quantidade1;
	private String nome;
	private int id;
	private double preco;
	private String marca;
	private int quantidade;
	public Produtos() {
	}
	public Produtos(String nome, int id, double preco, String marca, int quantidade) {

		this.nome = nome;
		this.id = id;
		this.preco = preco;
		this.marca = marca;
		this.quantidade = quantidade;
		
// Encapsulamento //
		
	}
	public Produtos(int quantidade) {


		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade1() {
		return quantidade1;
	}
	public void setQuantidade1(int quantidade1) {
		this.quantidade1 = quantidade1;
	}

// Funções //
	
	public void addProdutos() {
		this.quantidade = this.quantidade + quantidade1;
	}
	public void removeProdutos() {
		this.quantidade = this.quantidade - quantidade1;
	}


	
	
	 
}

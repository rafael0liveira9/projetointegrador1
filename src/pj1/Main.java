package pj1;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

import entidades.Produtos;

public class Main {
	
// Programa Simples, Sem Interface JavaFX e Sem integração com banco de Dados, apenas com 3 funções básicas, Mostrar o que tem em Estoque, Retirar produtos do estoque (vender) e Adicionar Produtos ao Estoque (comprar) //	

	public static void main(String[] args) throws IOException, InterruptedException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produtos p01 = new Produtos();
		Produtos p02 = new Produtos();
		Produtos p03 = new Produtos();
		Produtos p04 = new Produtos();
		Produtos p05 = new Produtos();		
		p01.setNome("Trompete");p01.setId(01);p01.setPreco(1000.00);p01.setMarca("Yamaha");p01.setQuantidade(7);
		p02.setNome("Bombardino");p02.setId(02);p02.setPreco(4000.00);p02.setMarca("King");p02.setQuantidade(3);
		p03.setNome("Violão");p03.setId(03);p03.setPreco(400);p03.setMarca("Gianini");p03.setQuantidade(10);
		p04.setNome("Flauta");p04.setId(04);p04.setPreco(80.00);p04.setMarca("Yamaha");p04.setQuantidade(25);
		p05.setNome("Violino");p05.setId(05);p05.setPreco(1300.00);p05.setMarca("Weril");p05.setQuantidade(5);
		
// Inicio  //
		

				
		System.out.println("***************************************");
		System.out.println("Seja Bem Vindo(a) - Projeto Integrado 1");
		System.out.println("***************************************");
		System.out.println(" ");
		System.out.println(" ");
		
// Menu Opção 1 //

		System.out.print("Digite a opção desejada: ");
		System.out.println(" ");
		System.out.println("(1) Vender Produtos");
		System.out.println("(2) Receber Produtos");
		System.out.println("(3) Informações sobre o Estoque");
		System.out.println("(6) Sair do Programa");
		System.out.println(" ");
		System.out.print("Opção: ");
// Variaveis Temporárias //
		
		int opcao1 = 0;
		int opcao2;
		int quantidade1;
		
		while(opcao1 != 6){		
// Continua o While //
		
		opcao1 = sc.nextInt();
		

		switch (opcao1) {
		case 1:
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("01 Trompete - 02 Bombardino - 03 Violão - 04 Flauta - 05 Violino");
			System.out.println(" ");
			System.out.print("Digite o Código do Produto a ser vendido: ");
			opcao2 = sc.nextInt();
			System.out.print("Digite a quantidade de produtos vendidos: ");
			quantidade1 = sc.nextInt();
			System.out.println(" ");
			System.out.println(" ");
			

			switch (opcao2) {
//Menu2 opção1//
				case 1:
					p01.setQuantidade1(quantidade1);
					p01.removeProdutos();
					System.out.println("Produto: " + p01.getNome() + " Marca: " + p01.getMarca() + " Valor Unitário: " + p01.getPreco());
					System.out.println("Venda feita com sucesso, Valor total R$" + (p01.getPreco() * quantidade1));
					System.out.println(" ");
					System.out.println("Volte Sempre!");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Digite a opção desejada: ");
					System.out.println(" ");
					System.out.println("(1) Vender Produtos");
					System.out.println("(2) Receber Produtos");
					System.out.println("(3) Informações sobre o Estoque");
					System.out.println("(6) Sair do Programa");
					System.out.println(" ");
					System.out.print("Opção: ");
					
					
					
					
					break;
				case 2:
					p02.setQuantidade1(quantidade1);
					p02.removeProdutos();
					System.out.println("Produto: " + p02.getNome() + " Marca: " + p02.getMarca() + " Valor Unitário: " + p02.getPreco());
					System.out.println("Venda feita com sucesso, Valor total R$" + (p02.getPreco() * quantidade1 ));
					System.out.println(" ");
					System.out.println("Volte Sempre!");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Digite a opção desejada: ");
					System.out.println(" ");
					System.out.println("(1) Vender Produtos");
					System.out.println("(2) Receber Produtos");
					System.out.println("(3) Informações sobre o Estoque");
					System.out.println("(6) Sair do Programa");
					System.out.println(" ");
					System.out.print("Opção: ");
					
					
					break;
				case 3:
					p03.setQuantidade1(quantidade1);
					p03.removeProdutos();
					System.out.println("Produto: " + p03.getNome() + " Marca: " + p03.getMarca() + " Valor Unitário: " + p03.getPreco());
					System.out.println("Venda feita com sucesso, Valor total R$" + (p03.getPreco() * quantidade1 ));
					System.out.println(" ");
					System.out.println("Volte Sempre!");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Digite a opção desejada: ");
					System.out.println(" ");
					System.out.println("(1) Vender Produtos");
					System.out.println("(2) Receber Produtos");
					System.out.println("(3) Informações sobre o Estoque");
					System.out.println("(6) Sair do Programa");
					System.out.println(" ");
					System.out.print("Opção: ");
					
					
					break;
				case 4:
					p04.setQuantidade1(quantidade1);
					p04.removeProdutos();
					System.out.println("Produto: " + p04.getNome() + " Marca: " + p04.getMarca() + " Valor Unitário: " + p04.getPreco());
					System.out.println("Venda feita com sucesso, Valor total R$" + (p04.getPreco() * quantidade1 ));
					System.out.println(" ");
					System.out.println("Volte Sempre!");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Digite a opção desejada: ");
					System.out.println(" ");
					System.out.println("(1) Vender Produtos");
					System.out.println("(2) Receber Produtos");
					System.out.println("(3) Informações sobre o Estoque");
					System.out.println("(6) Sair do Programa");
					System.out.println(" ");
					System.out.print("Opção: ");
					
					
					break;
				case 5:
					p05.setQuantidade1(quantidade1);
					p05.removeProdutos();
					System.out.println("Produto: " + p05.getNome() + " Marca: " + p05.getMarca() + " Valor Unitário: " + p05.getPreco());
					System.out.println("Venda feita com sucesso, Valor total R$" + (p05.getPreco() * quantidade1 ));
					System.out.println(" ");
					System.out.println("Volte Sempre!");
					System.out.println(" ");
					System.out.println(" ");
					System.out.print("Digite a opção desejada: ");
					System.out.println(" ");
					System.out.println("(1) Vender Produtos");
					System.out.println("(2) Receber Produtos");
					System.out.println("(3) Informações sobre o Estoque");
					System.out.println("(6) Sair do Programa");
					System.out.println(" ");
					System.out.print("Opção: ");
										
					break;
				default:
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("Programa Encerrado!");
					break;
			
			}
			
			break;
			
		case 2:			
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("01 Trompete - 02 Bombardino - 03 Violão - 04 Flauta - 05 Violino");
			System.out.println(" ");
			System.out.print("Digite o Código do Produto a ser Recebido: ");
			opcao2 = sc.nextInt();
			System.out.print("Digite a quantidade de produtos Recebidos: ");
			quantidade1 = sc.nextInt();
			System.out.println(" ");
			System.out.println(" ");
			
			switch (opcao2) {
//Menu2 opção2//
			case 1:
				p01.setQuantidade1(quantidade1);
				p01.addProdutos();
				System.out.println("Produto: " + p01.getNome() + "- Marca: " + p01.getMarca() + "- Valor Unitário: " + p01.getPreco());
				System.out.println("Produtos adicionados ao Estoque."); 
				System.out.println("Total Atualizado: " + p01.getQuantidade() + "- Valor do Estoque: R$" + (p01.getPreco() * p01.getQuantidade()));
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Digite a opção desejada: ");
				System.out.println(" ");
				System.out.println("(1) Vender Produtos");
				System.out.println("(2) Receber Produtos");
				System.out.println("(3) Informações sobre o Estoque");
				System.out.println("(6) Sair do Programa");
				System.out.println(" ");
				System.out.print("Opção: ");
				
				break;
			case 2:
				p02.setQuantidade1(quantidade1);
				p02.addProdutos();
				System.out.println("Produto: " + p02.getNome() + " Marca: " + p02.getMarca() + " Valor Unitário: " + p02.getPreco());
				System.out.println("Produtos adicionados ao Estoque. Total Atualizado: " + p02.getQuantidade() + " Valor do Estoque: R$" + (p02.getPreco() * p02.getQuantidade()));
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Digite a opção desejada: ");
				System.out.println(" ");
				System.out.println("(1) Vender Produtos");
				System.out.println("(2) Receber Produtos");
				System.out.println("(3) Informações sobre o Estoque");
				System.out.println("(6) Sair do Programa");
				System.out.println(" ");
				System.out.print("Opção: ");
								
				
				break;
			case 3:
				p03.setQuantidade1(quantidade1);
				p03.addProdutos();
				System.out.println("Produto: " + p03.getNome() + " Marca: " + p03.getMarca() + " Valor Unitário: " + p03.getPreco());
				System.out.println("Produtos adicionados ao Estoque. Total Atualizado: " + p03.getQuantidade() + " Valor do Estoque: R$" + (p03.getPreco() * p03.getQuantidade()));
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Digite a opção desejada: ");
				System.out.println(" ");
				System.out.println("(1) Vender Produtos");
				System.out.println("(2) Receber Produtos");
				System.out.println("(3) Informações sobre o Estoque");
				System.out.println("(6) Sair do Programa");
				System.out.println(" ");
				System.out.print("Opção: ");
				
				
				
				break;
			case 4:
				p04.setQuantidade1(quantidade1);
				p04.addProdutos();
				System.out.println("Produto: " + p04.getNome() + " Marca: " + p04.getMarca() + " Valor Unitário: " + p04.getPreco());
				System.out.println("Produtos adicionados ao Estoque. Total Atualizado: " + p04.getQuantidade() + " Valor do Estoque: R$" + (p04.getPreco() * p04.getQuantidade()));
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Digite a opção desejada: ");
				System.out.println(" ");
				System.out.println("(1) Vender Produtos");
				System.out.println("(2) Receber Produtos");
				System.out.println("(3) Informações sobre o Estoque");
				System.out.println("(6) Sair do Programa");
				System.out.println(" ");
				System.out.print("Opção: ");
				
				
				
				break;
			case 5:
				p05.setQuantidade1(quantidade1);
				p05.addProdutos();
				System.out.println("Produto: " + p05.getNome() + " Marca: " + p05.getMarca() + " Valor Unitário: " + p05.getPreco());
				System.out.println("Produtos adicionados ao Estoque. Total Atualizado: " + p05.getQuantidade() + " Valor do Estoque: R$" + (p05.getPreco() * p05.getQuantidade()));
				System.out.println(" ");
				System.out.println(" ");
				System.out.print("Digite a opção desejada: ");
				System.out.println(" ");
				System.out.println("(1) Vender Produtos");
				System.out.println("(2) Receber Produtos");
				System.out.println("(3) Informações sobre o Estoque");
				System.out.println("(6) Sair do Programa");
				System.out.println(" ");
				System.out.print("Opção: ");
				
				
									
				break;
			default:
				System.out.println("Opção Invalida");
				break;
		
		}
			
			break;
		case 3:
			
//Informações sobre o Estoque, Opção 3//
			
			System.out.println(" ");
			System.out.println("Total do Estoque");
			System.out.println(" ");
			System.out.println("Produto: " + p01.getNome() + "   - Marca: " + p01.getMarca() + "  - Quantidade: " + p01.getQuantidade() + "  - Valor Unitário: R$" + p01.getPreco());
			System.out.println("Produto: " + p02.getNome() + " - Marca: " + p02.getMarca() + "    - Quantidade: " + p02.getQuantidade() + "  - Valor Unitário: R$" + p02.getPreco());
			System.out.println("Produto: " + p03.getNome() + "     - Marca: " + p03.getMarca() + " - Quantidade: " + p03.getQuantidade() + " - Valor Unitário: R$" + p03.getPreco());
			System.out.println("Produto: " + p04.getNome() + "     - Marca: " + p04.getMarca() + "  - Quantidade: " + p04.getQuantidade() + " - Valor Unitário: R$" + p04.getPreco());
			System.out.println("Produto: " + p05.getNome() + "    - Marca: " + p05.getMarca() + "   - Quantidade: " + p05.getQuantidade() + "  - Valor Unitário: R$" + p05.getPreco());
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("Digite a opção desejada: ");
			System.out.println(" ");
			System.out.println("(1) Vender Produtos");
			System.out.println("(2) Receber Produtos");
			System.out.println("(3) Informações sobre o Estoque");
			System.out.println("(6) Sair do Programa");
			System.out.println(" ");
			System.out.print("Opção: ");
			break;
			
			
		
		
		default:
			
// Fim do Programa //
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("Programa Encerrado!");
			
			break;
				
		}
		}
		
		
		
		
		
		
		
		
		
			sc.close();		
		
		
		
		
		
		

		}
}





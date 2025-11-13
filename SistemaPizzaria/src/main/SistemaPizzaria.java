package main;
 import java.util.Scanner;
 import model.pizza;
 import model.entregador;
  
public class SistemaPizzaria{
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  
	  pizza[] pedido=new pizza[10];
	  entregador[] entregadores =new entregador[10];
	  
	  int contPedido = 0;
	  int contEntregador = 0;
	  int opcao;
	  int opcaoPedido;
	  int opcaoTamanho;
	  double numtamanho = 0;
	 
do {
	
	System.out.println("\n======== SISTEMA PIZZARIA ========");
	System.out.println("\n1 - Cadastrar entregador");
	System.out.println("\n2 - Cadastrar pedido");
	System.out.println("\n3 - Listar pedidos");
	System.out.println("\n4 - Listar Entregadores");
	System.out.println("\n0 - Sair");
	System.out.println("\n Escolha uma opção:");
	opcao = sc.nextInt();
	sc.nextLine();
	
    switch(opcao) {
    case 1:
    	System.out.println("\n======== CADASTRO DO ENTREGADOR ========");
    	if(contEntregador < entregadores.length) {
    		
    	System.out.println("Nome: ");
		String nome = sc.nextLine();

		System.out.println("Placa da Moto: ");
		String placaMoto = sc.nextLine();
		
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();

		entregadores[contEntregador] = new entregador(nome,  placaMoto, telefone);
		contEntregador++;
    	}
    	
		
		break;
    	case 2:
		    	
    		
		    	System.out.println("\n1 - Calabresa");
		    	System.out.println("\n2 - Frango com catupiri");
		    	System.out.println("\n3 - Quatro Queijos");
		    	System.out.println("\n4 -  Mussarela");
		    	System.out.println("\n5 -  Portuguesa");
		    	System.out.println("\n Escolha uma opção :");
		    	opcaoPedido = sc.nextInt();
		    	switch(opcaoPedido) {
		    	
		    	
		    	case 1:
		    		
		    		System.out.println("\nSabor escolhido");
		    		String numPedido1 = ("Calabresa");
		    		
		    		
		    		System.out.println("\n1 - Pequena");
		        	System.out.println("\n2 - Media");
		        	System.out.println("\n3 - Grande");
		    
		    		System.out.println("\ntamanho:");
		    		opcaoTamanho = sc.nextInt();
		  
		    		if(opcaoTamanho == 1) {
		    			numtamanho = 60.00;
		    		}else if(opcaoTamanho == 2) {
		    			numtamanho = 75.99;
		    		}else if(opcaoTamanho == 3) {
		    			numtamanho = 85.40;
		    		}else {
		    			System.out.println("numero não identificado");
		    		}
		    		
		    		pedido[contPedido] = new pizza(numtamanho,numPedido1);
		    		contPedido++;
		    	break;
				case 2:
				    		
				    	System.out.println("\nSabor escolhido");
				    	String numPedido2 = (" Frango com catupiri");
				    		
				    		
				    	System.out.println("\n1 - Pequena");
				        System.out.println("\n2 - Media");
				        System.out.println("\n3 - Grande");
				    
				    	System.out.println("\ntamanho:");
				   		opcaoTamanho = sc.nextInt();
				 
			    		if(opcaoTamanho == 1) {
			    			numtamanho = 60.00;
			    		}else if(opcaoTamanho == 2) {
			    			numtamanho = 75.99;
			    		}else if(opcaoTamanho == 3) {
			    			numtamanho = 85.40;
			    		}else {
			    			System.out.println("numero não identificado");
			    		}
				    		
			    		pedido[contPedido] = new pizza(numtamanho,numPedido2);
			    		contPedido++;
			    		break;   	
				case 3:
		    		
		    		System.out.println("\nSabor escolhido");
		    		String numPedido3 = ("Quatro Queijos");
		    		
		    		
		    		System.out.println("\n1 - Pequena");
		        	System.out.println("\n2 - Media");
		        	System.out.println("\n3 - Grande");
		    
		    		System.out.println("\ntamanho:");
		    		opcaoTamanho = sc.nextInt();
		  
		    		if(opcaoTamanho == 1) {
		    			numtamanho = 60.00;
		    		}else if(opcaoTamanho == 2) {
		    			numtamanho = 75.99;
		    		}else if(opcaoTamanho == 3) {
		    			numtamanho = 85.40;
		    		}else {
		    			System.out.println("numero não identificado");
		    		}
		    		
		    		pedido[contPedido] = new pizza(numtamanho,numPedido3);
		    		contPedido++;
		    	  	break;
				case 4:
		    		
		    		System.out.println("\nSabor escolhido");
		    		String numPedido4 = ("Mussarela");
		    		
		    		
		    		System.out.println("\n1 - Pequena");
		        	System.out.println("\n2 - Media");
		        	System.out.println("\n3 - Grande");
		    
		    		System.out.println("\ntamanho:");
		    		opcaoTamanho = sc.nextInt();
		  
		    		if(opcaoTamanho == 1) {
		    			numtamanho = 60.00;
		    		}else if(opcaoTamanho == 2) {
		    			numtamanho = 75.99;
		    		}else if(opcaoTamanho == 3) {
		    			numtamanho = 85.40;
		    		}else {
		    			System.out.println("numero não identificado");
		    		}
		    		contPedido++;
		    		pedido[contPedido] = new pizza(numtamanho,numPedido4);
		    		break;
				case 5:
		    		
		    		System.out.println("\nSabor escolhido");
		    		String numPedido5 = ("Portuguesa");
		    		
		    		
		    		System.out.println("\n1 - Pequena");
		        	System.out.println("\n2 - Media");
		        	System.out.println("\n3 - Grande");
		    
		    		System.out.println("\ntamanho:");
		    		opcaoTamanho = sc.nextInt();
		  
		    		if(opcaoTamanho == 1) {
		    			numtamanho = 60.00;
		    		}else if(opcaoTamanho == 2) {
		    			numtamanho = 75.99;
		    		}else if(opcaoTamanho == 3) {
		    			numtamanho = 85.40;
		    		}else {
		    			System.out.println("numero não identificado");
		    		}
		    		
		    		pedido[contPedido] = new pizza(numtamanho,numPedido5);
		    		contPedido++;
		    	  	break;
		    	}
    	
    	
		    	break;
    case 3:
    	System.out.println("\n======== EXIBIR PEDIDOS ========");
    	if(contPedido == 0) {
    		System.out.println("\nNenhum Pedido Cadastrado");
    		}else {
    			for(int i = 0; i < contPedido; i++) {
        			System.out.println("\nPedido "+ (i+1)+ ":");
        				pedido[i].exibirInfo();
    		}}
    	break;
    case 4:
    	System.out.println("\n======== EXIBIR ENTRGADORES ========");
    	if(contEntregador == 0) {
    		System.out.println("\nNenhum Pedido Cadastrado");
    		}else {
    			for(int i = 0; i < contEntregador; i++) {
        			System.out.println("\nEntregador "+ (i+1)+ ":");
        			entregadores[i].exibirInfo();
    		}}
    	break;
	case 0:
		System.out.println("\nEncerrando Sistema...");
		break;
	default:
		System.out.println("\nOpção Invalida! Tente Novamente.");	
	}

}while (opcao !=0);
sc.close();
}}
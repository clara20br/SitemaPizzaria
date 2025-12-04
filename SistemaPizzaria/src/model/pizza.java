package model;

public class pizza {

 private String[] sabores= {"1- Frango com catupiri ","2- Calabresa", "3- Mussarela", "4- Portuguesa","5-Quatro Queijos"};
 private String[] tamanhos= {"1-pequena","2-media", "3-grande"};
 
 private double numTamanho;
 private String numPedido;

 

 public pizza(double numTamanho,String numPedido) {
	this.numPedido = numPedido;
	this.numTamanho =numTamanho;
	
 }
 
 public String[] getSabores() {
	return sabores;
 }
 public void setSabores(String[] sabores) {
	this.sabores = sabores;
 }
 public String[] getTamanhos() {
	return tamanhos;
 }
 public void setTamanhos(String[] tamanhos) {
	this.tamanhos = tamanhos;
 }
 public double getNumTamanho() {
	return numTamanho;
 }
 public void setNumTamanho(double numTamanho) {
	this.numTamanho = numTamanho;
 }
 public String getNumPedido() {
	return numPedido;
 }
 public void setNumPedido(String numPedido) {
	this.numPedido = numPedido;
 }


 public void exibirInfo() {
System.out.println( "pizza [sabores=" + numPedido + ", tamanhos=\n" + numTamanho +"]");
 }
}

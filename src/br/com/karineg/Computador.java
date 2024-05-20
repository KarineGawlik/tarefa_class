package br.com.karineg;
/**
 * @author KarineGawlik
 * @version 1.0
 */
public class Computador {
	
	//Propriedades do objeto computador
	private String marca;
	private String modelo;
	private int memoriaRam;
	private int armazenamento;

	/**
	 * Um novo computador tem: 
	 * @param marca, modelo, memória e armazenamento
	 */
	public Computador(String marca, String modelo, int memoriaRam, int armazenamento) {
		/**
		 * @return marca do computador
		 */
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		/**
		 * @return modelo do computador
		 */
		public String getModelo() {
			return modelo;
		}
		public void setModelo(String modelo) {
			this.modelo = modelo;
		}
		
		/**
		 * @return quantide de menoriaRam do computador
		 */
		public int getMemoriaRam() {
			return memoriaRam;
		}
		public void setMemoriaRam(int memoriaRam) {
			this.memoriaRam = memoriaRam;
		}
		
		/**
		 * @return quantidade de armazenamento que o computador possui
		 */
		public int getArmazenamento() {
			return armazenamento;
		}
		public void setArmazenamento(int armazenamento) {
			this.armazenamento = armazenamento;
		}
	
	/**
	 * Ações do computador, instalar e desinstalar um programa 
	 */
	
	public void instalarPrograma() {
		boolean instalarPrograma = true;
		System.out.println("Vamos instalar o programa no seu computador");
	} else {
		System.out.println("Solicitação para instalação do programa negada! Cancelando pedido...");
	}
}



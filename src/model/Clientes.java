package model;

public class Clientes {
	public String Nome;
	public int qtdPecas;
	public float valor;
	public float valorPagar;
	public Clientes() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Clientes [Nome=" + Nome + ", qtdPecas=" + qtdPecas + ", valor da unidade=" + valor +  ", Total " + valorPagar + "]";
	}

}

package controller;

import br.com.kauanpaulino.filaObject.FilaObject;
import model.Clientes;

public class OperacaoController {

	public OperacaoController() {
		// TODO Auto-generated constructor stub
	}
	public void calculapreco(FilaObject fila) {
		Clientes c;
		while(!fila.isEmpty()) {
		try {
			c = (Clientes) fila.remove();
			float op = c.valor*c.qtdPecas;
			c.valorPagar =op;
			System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

	}
}

package view;

import java.util.Random;

import br.com.kauanpaulino.filaObject.FilaObject;
import controller.OperacaoController;
import model.Clientes;

public class main {

	public static void main(String[] args) {
		Random gerador = new Random();
		OperacaoController op = new OperacaoController();
		FilaObject fila = new FilaObject();
		for(int i=1;i<=20;i++) {
			Clientes c = new Clientes();
			c.Nome="Cliente"+i;
			c.qtdPecas = gerador.nextInt(31)+20;
			c.valor = (float) (gerador.nextDouble(96.00)+ 5.00);
			fila.insert(c);
		}
		op.calculapreco(fila);

	}

}

package src.principal;

import java.util.List;

import src.entidade.Item;
import src.excecao.ItemException;

public class TesteConhecimentoTecnico {

	private static boolean statusProcesso = false;

	private static boolean isOff() {
		return !statusProcesso;
	}

	private static boolean isOn() {
		return !isOff();
	}

	private void processarItens(List<Item> itens) {

		for (Item i : itens) {
			try {
				processar(i);
			} catch (ItemException e) {
				//Em aplicações reais, deve ser gerado um log (Log4j)
				System.out.println("Erro ao processar o item: " + i);
			}
		}
	}

	private void processar(Item i) throws ItemException {
	}
}
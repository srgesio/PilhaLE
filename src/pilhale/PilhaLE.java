package pilhale;
public class PilhaLE implements Pilha {

	private No topo;
	private int tamanho;
	
	//ADD ELEMENTO
	public void push(Object elemento) {
		No no = new No(elemento, topo);
		topo = no;
		tamanho++;
	}
	
	//REMOVE ELEMENTO E INDICA O PROXIMO
	public Object pop() throws PilhaVazia {
		No proximo = topo;
		if (proximo == null) {
			throw new PilhaVazia();
		}else {
			topo = proximo.getProximo();
			tamanho--;
		}
		return proximo;
	}
	
	//RETORNA O TAMANHO
	public int size() {
		return tamanho;
	}

	//INDICA SE ESTÁ VAZIA
	public boolean isEmpty() {
		return tamanho == 0;
	}

	//MOSTRA O TOPO
	public Object top() throws PilhaVazia {
		if(topo == null) {
			throw new PilhaVazia();
		}else {
			return topo;
		}
	}
}

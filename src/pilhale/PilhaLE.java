package pilhale;
public class PilhaLE implements Pilha {
	private Object arrayPilha[];
	private int t = -1;
	private int fc;
	public Object gotenks[];
        
        //CONSTRUTOR DO OBJETO
	public PilhaLE (int tam, int fc) {
		arrayPilha = new Object[tam];
        this.fc = fc;
	}
		//METODO DE CRESCIMENTO
	public Object[] crescimento(int fc) {
		for(int i = 0; i < size(); i++) {
			if(fc == 0) {
				gotenks = new Object[size()*2];
				gotenks[i] = arrayPilha[i];
			}else {
				gotenks = new Object[size()+fc];
				gotenks[i] = arrayPilha[i];
			}
		}
		return gotenks;
	}

        //ADCIONA ELEMENTO NO ARRAY
    public void push(No no) {
    	Object elemento;
    	elemento = no.getElemento();
        if (t == arrayPilha.length - 1) {
        	arrayPilha = crescimento(fc);
        }
        arrayPilha[++t] = elemento;
        no.setProximo(arrayPilha[t]);
        
    }
        
         //MOSTRA O ULTIMO ELEMENTO INSERIDO, SEM REMOVER
	public Object top() throws PilhaVazia{
		if (isEmpty())
			throw new PilhaVazia();
		else
			return arrayPilha[t];	
	}
	
        //RETORNA SE ESTÃ� VAZIO OU NÃƒO
	public boolean isEmpty() {
		return t == -1;
	}
	
        //RETORNA O TAMANHO DO ARRAY
	public int size() {
		return t+1;
	}
	
       
        //REMOVE UM ELEMENTO E RETORNA O ULTIMO ELEMENTO INSERIDO
	public Object pop() throws PilhaVazia{
		if (isEmpty())
			throw new PilhaVazia();
		else
			return arrayPilha[t--];
	}
	
	
        

}
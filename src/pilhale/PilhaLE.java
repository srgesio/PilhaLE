package pilhale;
public class PilhaLE implements Pilha {
	private Object arrayPilha[];
	private int t = -1;
	private int fc;
        
        //CONSTRUTOR DO OBJETO
	public PilhaLE (int tam, int fc) {
		arrayPilha = new Object[tam];
        this.fc = fc;
	}
		//METODO DE CRESCIMENTO
	public Object[] crescimento(int fc) {
		Object gotenks[];
		if(fc <= 0) {
			gotenks = new Object[size()*2];
			for(int i = 0; i < size(); i++) {
				gotenks[i] = arrayPilha[i];
			}
		}else {
			gotenks = new Object[size()+fc];
			for(int i = 0; i < size(); i++) {
				gotenks[i] = arrayPilha[i];
			}
		}
		return gotenks;		
	}
	
        //ADCIONA ELEMENTO NO ARRAY
    public void push(Object o) {
        if (t == arrayPilha.length - 1) {
        	arrayPilha = crescimento(fc);
        }
        arrayPilha[++t] = o;
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
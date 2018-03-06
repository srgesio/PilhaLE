
package pilhale;

public interface Pilha {
	public int size();
	public boolean isEmpty();
	public void push(No no) throws PilhaVazia;
	public Object pop() throws PilhaVazia;
	public Object top() throws PilhaVazia;
}
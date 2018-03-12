package pilhale;


import java.util.Scanner;


public class Main {

    public static void menuUI(){
        System.out.println("PILHA DE LISTA ENCADEADA\n====================="
                + "\nEscolha uma op��oo:\n----------------------\n"
                + "1 - Adicionar elemento\n"
                + "2 - Remover ultimo elemento\n"
                + "3 - Ver elemento no topo da pilha\n"
                + "4 - Ver o pr�ximo elemento do topo da pilha\n"
                + "5 - Ver n�mero de elementos na pilha\n"
                + "6 - Ver se a pilha est� vazia\n"
                + "0 - SAIR\n\n>>> ");
        
    }

    public static void main(String args[]) throws PilhaVazia{
    	
    	Scanner sc = new Scanner(System.in);
        Object elemento;
        PilhaLE pilha = new PilhaLE();
        
        int resposta = -1;
        while (resposta!=0) {
            menuUI();
            Scanner zoy = new Scanner (System.in);
            resposta=zoy.nextInt();
            switch(resposta){
                case 1:
                	//PUSH-----------------------------------------------------------
                    System.out.print("ADICIONAR: ");
                    elemento = sc.next();
                    pilha.push(elemento);
                    break;
                
                case 2:
                	//POP-----------------------------------------------------------
                	try {
                    pilha.pop();
                    System.out.println("Elemento Removido com sucesso!!");
                    Object topo = pilha.top();
                    System.out.println("\n--->Seu elemento do topo agora � "+topo+"!<---");
                	}catch(PilhaVazia e1){
                		System.out.println("Sua pilha est� vazia, n�o tem o que remover");
                	}
                    break;
                
                case 3:
                	try {
                    Object topo2 = pilha.top();
                    System.out.println("\n--->Seu elemento do topo � "+topo2+"!<---");
                	}catch(PilhaVazia e1){
                		System.out.println("Sua pilha est� vazia, n�o tem o que ver no topo dela");
                	}
                    break;
                    
                case 4:
                	try {
                        Object proximo = pilha.topProximo();
                        System.out.println("\n--->O pr�ximo elemento do topo da pilha � "+proximo+"!<---");
                    	}catch(PilhaVazia e1){
                    		System.out.println("Sua pilha est� vazia, n�o h� como ver o pr�ximo elemento do topo");
                    	}catch(NullPointerException e1) {
                    		Object topo2 = pilha.top();
                    		System.out.println("S� existe o elemento " + topo2 + " nessa pilha, logo, n�o h� pr�ximo");
                    	}
                    break;
            
                case 5:
                    int qtdElementos = pilha.size();
                    System.out.println("Voc� tem "+qtdElementos+" na pilha!");
                    break;
                
                case 6:
                    boolean situacao = pilha.isEmpty();
                    int qtd = pilha.size();
                    if (situacao==true){
                        System.out.println("Sim! Pilha Vazia!");
                    }else{
                        System.out.println("N�o! a pilha n�o est� vazia. Cont�m "+ qtd +" elementos!");
                    }
                    break;
                
                case 0:
                    System.out.println("FIM DA PILHA\n=======================================");
                    break;
                default:
                    System.out.println("Escolha uma op��o v�lida!");
            }
            
        }
    
    }
}  

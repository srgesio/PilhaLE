package pilhale;


import java.util.Scanner;


public class Main {

    public static void menuUI(){
        System.out.println("PILHA DE LISTA ENCADEADA\n====================="
                + "\nEscolha uma opçãoo:\n----------------------\n"
                + "1 - Adicionar elemento\n"
                + "2 - Remover ultimo elemento\n"
                + "3 - Ver elemento no topo da pilha\n"
                + "4 - Ver o próximo elemento do topo da pilha\n"
                + "5 - Ver número de elementos na pilha\n"
                + "6 - Ver se a pilha está vazia\n"
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
                    System.out.println("\n--->Seu elemento do topo agora é "+topo+"!<---");
                	}catch(PilhaVazia e1){
                		System.out.println("Sua pilha está vazia, não tem o que remover");
                	}
                    break;
                
                case 3:
                	try {
                    Object topo2 = pilha.top();
                    System.out.println("\n--->Seu elemento do topo é "+topo2+"!<---");
                	}catch(PilhaVazia e1){
                		System.out.println("Sua pilha está vazia, não tem o que ver no topo dela");
                	}
                    break;
                    
                case 4:
                	try {
                        Object proximo = pilha.topProximo();
                        System.out.println("\n--->O próximo elemento do topo da pilha é "+proximo+"!<---");
                    	}catch(PilhaVazia e1){
                    		System.out.println("Sua pilha está vazia, não há como ver o próximo elemento do topo");
                    	}catch(NullPointerException e1) {
                    		Object topo2 = pilha.top();
                    		System.out.println("Só existe o elemento " + topo2 + " nessa pilha, logo, não há próximo");
                    	}
                    break;
            
                case 5:
                    int qtdElementos = pilha.size();
                    System.out.println("Você tem "+qtdElementos+" na pilha!");
                    break;
                
                case 6:
                    boolean situacao = pilha.isEmpty();
                    int qtd = pilha.size();
                    if (situacao==true){
                        System.out.println("Sim! Pilha Vazia!");
                    }else{
                        System.out.println("Não! a pilha não está vazia. Contém "+ qtd +" elementos!");
                    }
                    break;
                
                case 0:
                    System.out.println("FIM DA PILHA\n=======================================");
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
            
        }
    
    }
}  

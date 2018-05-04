
package lojamateriasconstrucao.view;

import java.util.Scanner;
import lojamateriasconstrucao.domain.Cliente;


public class ClienteView {
    
    Scanner ler = new Scanner(System.in);
    
    public void clienteMenu(){        
        int op;
        System.out.println("\t Escolha Uma opção: ");
        System.out.println("1 - Adicionar Cliente");
        op = ler.nextInt();
        
        switch(op){
            case 1: {
                adicionar();
                break;
            }
        }
    }
    
    public Cliente adicionar(){
        Cliente cliente = new Cliente();
        String nome;
        System.out.println("Entre com o nome: ");
        nome = ler.nextLine();
        cliente.setNome(nome);
        return cliente;
    }
}

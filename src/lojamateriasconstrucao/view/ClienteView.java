
package lojamateriasconstrucao.view;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import lojamateriasconstrucao.domain.Cliente;
import lojamateriasconstrucao.domain.Endereco;


public class ClienteView {
    
    private static final Scanner ler = new Scanner(System.in);
    private static String nome, naturalidade, email, nomePai, nomeMae;
    private static Date dataNascimento;
    private static int BI, NIF, telefone;    
    private static List<Endereco> endereco;
    
    
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
        ler.nextLine();
                
        System.out.println("Entre com o nome completo: ");
        nome = ler.nextLine();
        cliente.setNome(nome);
        
        //System.out.println("Entre com data de nascimento: ");
        //dataNascimento = ler.nextLine();
        
        System.out.println("Entre com a naturalidade: ");
        naturalidade = ler.nextLine();
        cliente.setNaturalidade(naturalidade);
        
        System.out.println("Entre com o email: ");
        email = ler.nextLine();
        cliente.setEmail(email);
        
        
        return cliente;
    }
}

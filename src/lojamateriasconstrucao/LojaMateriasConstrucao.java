
package lojamateriasconstrucao;

import java.util.Scanner;
import lojamateriasconstrucao.view.ClienteView;
import lojamateriasconstrucao.view.MaterialView;


public class LojaMateriasConstrucao {
    
    static Scanner ler = new Scanner(System.in);
    static int op;
    
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("|\t\tBenvido a Loja de Materias\t\t|");
        System.out.println("---------------------------------------------------------");
        
        
        System.out.println("\nEscolha uma opção");
        menuPrincipal();
        op = ler.nextInt();
        
        switch(op){
            case 1:{
                ClienteView c1 = new ClienteView();
                c1.clienteMenu();
                break;
            }
            
            case 2:{
                MaterialView c2= new MaterialView();
                c2.menuMaterial();
                break;
            }
        }
    }
    
    public static void menuPrincipal(){
        System.out.println("1 - Clientes");
        System.out.println("2 - Material");
    }
    
}

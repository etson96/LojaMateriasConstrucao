
package lojamateriasconstrucao.view;

import java.util.Scanner;


public class MaterialView {
    
    public void menuMaterial() {
        
        
        int op;
        Scanner ler=new Scanner(System.in);
        
        System.out.println("Escolha uma Opção:");
        System.out.println("1->Adicionar Material");
        System.out.println("2->Listar Material");
        System.out.println("3->Editar Material");
        
        op =ler.nextInt();
        
        switch(op){
            
            case 1:{  
                adicionar();
                break;
            }
               
        }
        
        
        
        
        
    }
    
    public void adicionar(){
        
        System.out.println("Funcionou");
    }
}

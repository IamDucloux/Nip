/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nip2.pkg0;
import java.util.Scanner;
/**
 *
 * @author T-202
 */
public class Nip20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Teclado = new Scanner(System.in);
         int intento;
        for(intento=1; intento<=3; intento=intento+1){
            
            System.out.println("Ingresa tu NIP"); 
            int NIP= Teclado.nextInt();
            if(NIP==1234){
                System.out.println("Tu NIP es correcto, bienvenido al sistema");
                intento=4;
                System.out.println("Presione 1 para continuar");
                System.out.println("Presione 2 para salir");
                int seleccion = Teclado.nextInt();
                if(seleccion==1){System.out.println("Bienvenido");}
               else if(seleccion==2){System.out.println("Hasta luego");
               System.exit(0);
               
               }
            }
            else if(intento<3){System.out.println("NIP incorrecto, vuelve a intentarlo");}
            
              
           
        }
        if(intento==4){System.out.println("Se agotaron tus intentos");}
        
    }
    
}

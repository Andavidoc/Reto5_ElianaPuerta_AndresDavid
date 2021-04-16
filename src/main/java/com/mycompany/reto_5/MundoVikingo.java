
package com.mycompany.reto_5;

import java.util.Scanner;


//Andrés David Ocampo
//Eliana Janneth Puerta Morales

public class MundoVikingo  {
    
    
    public static void main(String[] args){
    Scanner lector = new Scanner(System.in);  
    Batallon batallon = new Batallon();
   
    int menu = 4;
    
    while(menu != 0){
        System.out.println("");
        System.out.println("Este Batallon cuenta con 7 Berserker cada uno con 3 armas");
        System.out.println("1. Ingresar un Berserker: ");
        System.out.println("2. Eliminar un Berserker: ");
        System.out.println("3. Obtener un Berserker: ");
        System.out.println("0. Salir. ");
        menu = lector.nextInt();
        
        if(menu == 1){
        batallon.agregar(new Berserker());
        }
        
        if(menu == 2){
        try{
            System.out.println("Ingrese el Berserker a eliminar");
            int i = lector.nextInt();
             batallon.eliminar(i);
        }catch(ExepcionPerso e){
            System.out.println(e.getMessage());
        }
        }
        if (menu == 3){
        try{
            System.out.println("Ingrese el Berserker a obtener.");
            int i = lector.nextInt();
            batallon.obtener(i);
        }catch(ExepcionPerso e){
             System.out.println(e.getMessage());
        }
        }
        
    }
    
    
    
    
    
    
   
   
   
   
   
   
   
   
       
       
   }
}
   
    
    
    
   
       
            
   
  
    
    
        
    
    


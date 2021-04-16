package com.mycompany.reto_5;

import javax.swing.JOptionPane;

public class Batallon implements ListaSoldados {
    
    
    private final Berserker[] berserkers = new Berserker[7];
    Arma arma;
    @Override
    public void agregar(Berserker o) {
        int posicion = 0;
        for(int i = 0; i < berserkers.length; i++){
            if(berserkers[i] == null){
            berserkers[i] = o;
            posicion = i;
            System.out.println("Se ha agregado berserker en la posicion " + posicion);
            break;
            }      
            
        }
       
        
    }

    @Override
    public void eliminar(int i) throws ExepcionPerso{
        if((i >  berserkers.length-1 || i < 0)){
        throw new ExepcionPerso("Está fuera de la lista o no existe");
        }
        if(berserkers[i] == null){
            throw new ExepcionPerso("El soldado no existe");
        }
        berserkers[i] = null;
        System.out.println("Se ha eliminado el berserker de la posicion " + (i));
       
    }
    
    @Override
    public void obtener(int i)throws ExepcionPerso{
        if((i >  berserkers.length-1 || i < 0)){
        throw new ExepcionPerso("Está fuera de la lista");
        }
        if(berserkers[i] == null){
            throw new ExepcionPerso("El soldado no existe");
        }
        System.out.println("Identificación del Berserker: ");
        System.out.println(berserkers[i].getIdentificadorBerserker());
        System.out.println("Nombre del Berseker");
        System.out.println(berserkers[i].getNombreCompleto());
        System.out.println("Apodo del Berserker");
        System.out.println(berserkers[i].getApodo());
        System.out.println("Puntaje de fuerza del Berseker");
        System.out.println(berserkers[i].getPuntajeFuerza());
        System.out.println("ataque final del Berseker");
        System.out.println(berserkers[i].atacar());
        
    }
}

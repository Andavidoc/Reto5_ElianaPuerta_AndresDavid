package com.mycompany.reto_5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Arma {
    //ATributos
    private int identificadorArma;
    private String nombreArma;
    private float puntajeAtaque;
    private float magnitudDefensa;
    
    Scanner lector = new Scanner(System.in);

    public Arma() {
        System.out.println("Identifiación Arma");
        this.identificadorArma = lector.nextInt();
        System.out.println("Nombre del Arma");
        this.nombreArma = lector.nextLine();
        this.nombreArma = lector.nextLine();
        System.out.println("Ataque del Arma");
        this.puntajeAtaque = lector.nextFloat();
        System.out.println("Defensa del Arma");
        this.magnitudDefensa = lector.nextFloat();
    }
    
    
    //Métodos
    public int getIdentificadorArma() {
        return identificadorArma;
    }

    public void setIdentificadorArma() {
        System.out.println("Identificador del Arma: ");
        this.identificadorArma = lector.nextInt();
    }

    public String getNombreArma() {
        return nombreArma;
    }

    public void setNombreArma() {
        System.out.println("Nombre del Arma: ");
        this.nombreArma = lector.nextLine();
    }

    public float getPuntajeAtaque() {
        return puntajeAtaque;
    }

    public void setPuntajeAtaque(){
        System.out.println("Puntaje de Efectividad Ataque: ");
        this.puntajeAtaque = lector.nextFloat();
    }

    public float getMagnitudDefensa() {
        return magnitudDefensa;
    }

    public void setMagnitudDefensa() {
        System.out.println("Puntaje de Magnitud Defensa: ");
        this.magnitudDefensa = lector.nextFloat();
    }

   
    
    
}

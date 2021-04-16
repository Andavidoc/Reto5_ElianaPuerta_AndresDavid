package com.mycompany.reto_5;

import java.util.Scanner;

public class Berserker extends Soldado{
    //Atributos 
    
    private int identificadorBerserker;
    private  String apodo;
    private String nombreCompleto;
    private float puntajeFuerza;
    private final Arma[] listaArmas  = new Arma[3];
    private float productoFuerza;
    
    Scanner lector = new Scanner(System.in);

    public Berserker() {
        System.out.println("Identificaicón berserker");
        this.identificadorBerserker = lector.nextInt();
        lector.nextLine();
        System.out.println("Apodo berserker");
        this.apodo = lector.nextLine();
        System.out.println("Nombre completo berserker");
        this.nombreCompleto = lector.nextLine();
        System.out.println("Puntaje fuerza berserker");
        this.puntajeFuerza = lector.nextFloat();
        System.out.println("Armas: ");
        for(int i = 0; i < listaArmas.length; i++){
            listaArmas[i] = new Arma();
        }
    }
    
    
    
    
//Métodos
    
    
    @Override
    public float atacar(){
        float sumaAtaque = 0;
        for(int i = 0; i < this.listaArmas.length; i++){
            sumaAtaque += this.listaArmas[i].getPuntajeAtaque();
        }
        productoFuerza = this.puntajeFuerza * sumaAtaque;
            return productoFuerza;
    }
    
    public int getIdentificadorBerserker() {
        return identificadorBerserker;
    }

    public void setIdentificadorBerserker(){
        System.out.println("Identificacion del Berserker: ");
        this.identificadorBerserker = lector.nextInt();
    }
    
    public String getApodo() {
        return apodo;
    }

    public void setApodo() {
        System.out.println("Apodo del Berserker: ");
        this.apodo = lector.nextLine();
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto() {
        System.out.println("Nombre completo del Berserker: ");
        this.nombreCompleto = lector.nextLine();
    }

    public float getPuntajeFuerza() {
        return puntajeFuerza;
    }

    public void setPuntajeFuerza() {
        System.out.println("Puntaje de fuerza del Berserker");
        this.puntajeFuerza = lector.nextFloat();
    }
    
    
}

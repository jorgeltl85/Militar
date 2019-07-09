package com.sl2.militar;

import android.util.Log;

/**
 * Creado por Jorge Luis Tufiño
 * 8 Julio 2019
 */
public class Soldado {
    //Variables de la clase
    int vida;
    String tipoDeSoldado;
    String arma;
    String regimen;
    String nombre;


    public Soldado(int vida, String tipoDeSoldado, String arma, String regimen, String nombre){
        this.arma = arma;
        this.vida = vida;
        this.regimen = regimen;
        this.tipoDeSoldado = tipoDeSoldado;
        this.nombre = nombre;
    }

    public Soldado(){
        arma = "pistola";
        vida = 100;
        regimen = "norte";
        tipoDeSoldado = "raso";
        nombre = "jorge";
    }

    public Soldado(String nombre, String tipoDeSoldado){
        arma = "pistola";
        vida = 100;
        regimen = "norte";
        this.tipoDeSoldado = tipoDeSoldado;
        this.nombre = nombre;
    }


    //Metodos de la clase
    void dispararAlEnemigo(){
        //pum!
        int daño;
        Log.i(tipoDeSoldado,"Esta Disparando");

    }

    /*
    public void curarSoldado(Soldado soldadoASerCurado, int sumarVida){
        soldadoASerCurado.vida +=sumarVida;
    }*/

    public void soldadoDisparado(Soldado soldadoDisparado, int quitarVida){
        soldadoDisparado.vida -=quitarVida;
    }

    public int getVida(){
        return vida;
    }

    public void setVida(int laVida){
        //vida = vida;
        if(laVida<0){
            laVida = 0;
        }
        if(laVida>=500){
            laVida=500;
        }
    }
}

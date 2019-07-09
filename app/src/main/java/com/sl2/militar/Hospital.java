package com.sl2.militar;

class Hospital {

    protected void curarSoldado(Soldado soldadoASerCurado, int valor){
        int vida = soldadoASerCurado.getVida();

        vida +=valor;
        soldadoASerCurado.setVida(vida);
    }

}

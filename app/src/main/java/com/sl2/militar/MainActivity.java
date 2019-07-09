package com.sl2.militar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int NUMERO_VALIDACION = 1;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Soldado sold = new Soldado();
        sold.tipoDeSoldado = "francotirador";
        sold.vida = 100;
        sold.dispararAlEnemigo();

        //Objeto de la clase soldado
        //La vida del soldado tiene 100 puntos y es un francotirador
        //ERROR: Soldier.vida = 100; Se bajaria la vida de todos los soldados.



        Soldado sold2 = new Soldado();
        sold2.tipoDeSoldado = "fuerzas especiales";
        sold2.setVida(150);
        sold2.dispararAlEnemigo();

        Soldado rambo = new Soldado();
        rambo.tipoDeSoldado = "rambo";
        rambo.vida = 200;
        rambo.dispararAlEnemigo();
        Log.i("RAMBO","La  vida de Rambo es de "+rambo.vida);

        Soldado wellinton = new Soldado();
        wellinton.tipoDeSoldado = "navegante";
        wellinton.vida = 80;
        wellinton.dispararAlEnemigo();

        Log.i("RAMBO","La  vida de Rambo es de "+rambo.vida);
        Log.i("WELLINGTON","La  vida de Wellington es de "+wellinton.vida);


        Soldado medico = new Soldado();
        medico.vida = 10;
        medico.tipoDeSoldado = "medico";

       // medico.curarSoldado(rambo,20);
        Log.i("RAMBO","La  vida de Rambo es de "+rambo.vida);

        rambo.soldadoDisparado(rambo,30);
        Log.i("RAMBO","La  vida de Rambo es de "+rambo.vida);
        rambo.soldadoDisparado(rambo,30);
        Log.i("RAMBO","La  vida de Rambo es de "+rambo.vida);

       // medico.curarSoldado(rambo,500);
        Log.i("RAMBO","La  vida de Rambo es de "+rambo.vida);


        Hospital hospital = new Hospital();
        hospital.curarSoldado(rambo,200);
        Log.i("RAMBO","La  vida de Rambo es de "+rambo.vida);


        Soldado soldadaso = new Soldado("Jorge","Capitan");
        Log.i("soldadadso","La vida del soldado es"+soldadaso.getVida());

        Soldado paco = new Soldado(300,"Camino","asd","regimen","paco");
        Log.i("soldadadso","La vida del paco es"+paco.getVida());
        Toast.makeText(this,"",Toast.LENGTH_LONG).show();


    }
}

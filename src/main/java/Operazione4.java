/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class Operazione4 implements Runnable {
       
    /* seconda operazione
    Buffer dato;
    public double c;
    public Operazione4(Buffer dato) {
        this.dato = dato;
        c=dato.c;
    }
         public void run()
    {
        dato.k=8 - 3*c;
    }*/
     Buffer dato;
    public double a;
    public Operazione4(Buffer dato) {
        this.dato = dato;
        a=dato.a;
    }
         public void run()
    {
        dato.u=2*a;
         System.out.println("ha calcolato 4 " + dato.u);
    }
    }


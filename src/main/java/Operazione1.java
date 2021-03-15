/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class Operazione1 implements Runnable {
   
   /* Buffer dato;
    public double a;
    public double b;
    public Operazione1(Buffer dato) {
        this.dato = dato;
        a=dato.a;
        b=dato.b;
    }
     
    public void run()
    {
        dato.x= (2*a + 4)*(7*b +3);
        
        System.out.println("ha calcolato" + dato.x);
    }*/
    
    /* seconda operazione
     Buffer dato;
    public double a;
    public double b;
    public Operazione1(Buffer dato) {
        this.dato = dato;
        a=dato.a;
        b=dato.b;
    }
     public void run()
     {
         
         dato.x=(3+2*a);
          System.out.println("ha calcolato" + dato.x);
     }*/
         Buffer dato;
    public double a;
    public Operazione1(Buffer dato) {
        this.dato = dato;
        a=dato.a;
    }
    public void run()
     {
         
         dato.x=(3+a);
          System.out.println("ha calcolato 1" + dato.x);
     }
}

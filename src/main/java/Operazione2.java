/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class Operazione2 implements Runnable {
  
 /* prima espressione
    Buffer dato;
    public Operazione2(Buffer dato) {
        this.dato = dato;
 
    }
         public void run()
    {
        dato.y=dato.x * 5;
        
        System.out.println("ha calcolato" + dato.y);
    }*/ 
    
    /* seconda 
     Buffer dato;
    public double b;
    public Operazione2(Buffer dato) {
        this.dato = dato;
        b=dato.b;
    }
    public void run()
    {
      dato.y=(5*b-7);
    }*/
         Buffer dato;
    public double c;
    public Operazione2(Buffer dato) {
        this.dato = dato;
        c=dato.c;
        
    }
     public void run()
    {
      dato.y=(5-2*c);
      System.out.println("ha calcolato 2 " + dato.y);
    }
    }
 

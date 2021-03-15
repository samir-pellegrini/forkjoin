/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class Operazione37 implements Runnable {
  /* prima espressione
    Buffer dato;
    public double c;
    public Operazione37(Buffer dato) {
        this.dato = dato;
        c=dato.c;
    }
         public void run()
    {
        dato.z=dato.y - 10.0*c;
        
        System.out.println("l'espressione calcolata fa " + dato.z);
    }*/
    
    /* seconda 
     Buffer dato;

    public Operazione37(Buffer dato) {
        this.dato = dato;
        
    }
             public void run()
             {
                 dato.z= dato.x * dato.y;
             }
*/
         Buffer dato;
    public double b;
    public double p;
    public Operazione37(Buffer dato) {
        this.dato = dato;
        b=dato.b;
        p=dato.p;
    }
     public void run()
    {
      dato.z=(7*b*p+3);
      System.out.println("ha calcolato 37 " + dato.z);
    }
    }


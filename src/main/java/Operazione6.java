/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class Operazione6 implements Runnable  {
    Buffer dato;

    public Operazione6(Buffer dato) {
        this.dato = dato;
       
    }
         public void run()
    {
        dato.v=dato.x-dato.o+dato.u;
         System.out.println("ha calcolato 6 " + dato.v);
    }
}

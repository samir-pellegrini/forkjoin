/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class Operazione5 implements Runnable {
          Buffer dato;
    public Operazione5(Buffer dato) {
        this.dato = dato;
    }
         public void run()
    {
        dato.o=dato.z * dato.y;
         System.out.println("ha calcolato 5 " + dato.o);
    }
}

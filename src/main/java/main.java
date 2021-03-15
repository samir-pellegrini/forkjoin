
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a=4;
        double b=6;
        double c=2;
        double p=4;
        
        Buffer b1=new Buffer(a,b,c,p);
                
        Runnable r1=new Operazione1(b1);
        Runnable r2=new Operazione2(b1);
        Runnable r3=new Operazione37(b1);
        Runnable r4=new Operazione4(b1);
        Runnable r5=new Operazione5(b1);
        Runnable r6=new Operazione6(b1);
         Thread t1=new Thread(r1);
         Thread t2=new Thread(r2);
         Thread t3=new Thread(r3);
         Thread t4=new Thread(r4);
         Thread t5=new Thread(r5);
         Thread t6=new Thread(r6);
       /*  prima espressione
         t1.start();
           try {    t1.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
         
           
         
         t2.start();
         try {    t2.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
      
         
           t3.start();
*/
       /*
       t1.start();
       t2.start();
           try {    t1.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
           try {    t2.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
        t3.start();
        t4.start();
           try {    t3.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
           try {    t4.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
           t5.start();
    }*/
       t2.start();
       t3.start();

        try {    t2.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
           try {    t3.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
        t5.start();
       t1.start();
       t4.start();
         try {    t1.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
          try {    t4.join();  } 
        catch (InterruptedException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);}
         
      t6.start();    
    }
}

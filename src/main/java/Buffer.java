/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samir pellegrini
 */
public class Buffer {
    public double x,y,z,k,h,a,b,c,u,o,v,p;
    public Buffer()
    {
        x=0;y=0;z=0;k=0;h=0;
        a=0;b=0;c=0;
    }
    public Buffer(double a, double b,double c,double p)
    {
         x=0;y=0;z=0;k=0;h=0;u=0;o=0;v=0;
         this.a=a;
         this.b=b;
         this.c=c;
         this.p=p;
    }
}

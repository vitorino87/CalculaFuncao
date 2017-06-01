/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calculafuncao;

/**
 *
 * @author Tiago
 */
public class CalculaFuncao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a=2,b=3,x=0,f;
        for(x=0;x<5.05;x+=0.05f){
            f = Math.pow((Math.E),(a*b*x));
            System.out.printf("x = %.2f : f(x) = %.2f\n",x,f);
        }
        
        // TODO code application logic here
    }
}

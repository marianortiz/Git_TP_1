/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2;

/**
 *
 * @author Camila
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        suma a = new suma(10,20);
        resta r = new resta(82,43);
        division d = new division(15,3);
        multiplicacion m = new multiplicacion(7,5);
        
        System.out.println("practico 1");
        System.out.println("la suma es: "+ a.getSumar());
        System.out.println("la resta es: "+ r.getRestar());
        System.out.println("la division es: "+ d.getDivision());
        System.out.println("la multiplicacion es: "+ m.getMultiplica() );
        
        
        
        
    }
    
        
        
        
    
        
        
        
    }



package proyecto2;

public class Proyecto2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        suma a = new suma(10,20);
        resta r = new resta(82,43);
        division d = new division(15,3);
        multiplicacion m = new multiplicacion(7,5);
        potencia p = new potencia(4, 2);
        raiz z = new raiz(9);
        
        
        System.out.println("practico 1");
        System.out.println("la suma es: "+ a.getSumar());
        System.out.println("la resta es: "+ r.getRestar());
        System.out.println("la division es: "+ d.getDivision());
        System.out.println("la multiplicacion es: "+ m.getMultiplica() );
        System.out.println("La potencia es: "+p.getPotencia());
        System.out.println("la raiz es: "+z.getRaiz());
        
        
        
    }
    
        
        
        
    
        
        
        
    }



package ejercicios_object;


public class Ejercicios_Object {

    static void metodo_hasCode(){
    
        // EJ_1
        System.out.println ("\nEjercicio 1");
        
        String x = "hola";
        System.out.println("x hasCode(): "+x.hashCode());
        
        String z = "que tal";
        System.out.println("z hasCode(): "+z.hashCode());
        
        System.out.println("Valor de x: "+x+" Valor de z:"+z);
        
        z=x;
        System.out.println("z hasCode(): "+z.hashCode());
        
        System.out.println("Valor de x: "+x+" Valor de z:"+z);
        
    }    
        
    static void metodo_equals(){  
        
        String x = "hola";
        String z = "que tal";
        System.out.println("x==z: "+(x==z));
        System.out.println("x.equals(z)"+x.equals(z));
        
        x=z;
        System.out.println("x==z: "+(x==z));
        System.out.println("x.equals(z)"+x.equals(z));
        
        
    
    }
    
    static void metodo_getClass(){
    
        String x = "hola";
        System.out.println("La clase a la que pertenece x es:"+x.getClass());
        
        
        
    }
    
    static void metodo_toString() {
    
      String x = "hola";
      System.out.println("Valor de toString:"+x.toString());
          
    }
    
    static void metodo_clone(){
        
       String x = "hola";
      
    
    }
    public static void main(String[] args) {
      
        metodo_hasCode();
        
        metodo_equals();
        
        metodo_getClass();
        
        metodo_toString();
    }
}

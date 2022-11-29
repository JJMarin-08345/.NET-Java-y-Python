
package menurestaurante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuRestaurante {
    
    public static Scanner in = new Scanner(System.in);
    public static String producto;
    public static int opcion,cantidad,tipocomida,precio,total;
    public static List ProPreCan = new ArrayList();
    public static List general = new ArrayList();
    
    private static int TiposComida(String comida){
        boolean correcto=true;
        String error="--ERROR: Digite un numero en el rango dado--";
        do{
            switch(comida){
                case "Hamburguesa":
                    System.out.println("--TIPOS HAMBURGUESA--");
                    System.out.println("1. Hamburguesa sencilla");
                    System.out.println("2. Hamburguesa doble carne");
                    System.out.println("3. Hamburguesa cargada");
                    System.out.println("4. Regresar\n");
                    System.out.println("¿Qué tipo de hamburguesa desea?");
                    tipocomida=in.nextInt();
                    switch (tipocomida) {
                        case 1:
                            producto="Hamburguesa Sencilla";
                            precio=8000;
                            break;
                        case 2:
                            producto="Hamburguesa Doble Carne";
                            precio=10000;
                            break;
                        case 3:
                            producto="Hamburguesa Cargada";
                            precio=15000;
                            break;
                        case 4:
                            Menu();
                            correcto=false;
                            break;
                        default:
                            System.out.println(error);
                            correcto=false;
                            break;
                        }
                    if(correcto){
                        System.out.println("¿Cuántas hamburguesas desea agregar?");
                        cantidad=in.nextInt();
                        correcto=false;
                    }
                break;
                //Salchipapas 
                case "Salchi":
                    System.out.println("--TIPOS SALCHIPAPA--");
                    System.out.println("1. Salchipapa gratinada personal");
                    System.out.println("2. Salchipapa especial personal");
                    System.out.println("3. Salchiparra (con todo) para 3 personas");
                    System.out.println("4. Salchiparra (con todo) para 7 personas");
                    System.out.println("5. Regresar\n");
                    System.out.println("--¿Qué tipo de salchipapa desea?--");
                    tipocomida=in.nextInt();
                    switch (tipocomida) {
                        case 1:
                            precio=7000;
                            break;
                        case 2:
                            precio=10000;
                            break;
                        case 3:
                            precio=24000;
                            break;
                        case 4:
                            precio=38000;
                            break;
                        case 5:
                            Menu();
                            correcto=false;
                            break;
                        default:
                            System.out.println(error);
                            correcto=false;
                            break;
                        }
                    if(correcto){
                        System.out.println("--¿Cuántas salchipapas desea agregar?--");
                        cantidad=in.nextInt();
                        correcto=false;
                    }
                    break;
                case "PCaliente":
                    System.out.println("--TIPOS PERROS CALIENTES--");
                    System.out.println("1. Perro sencillo");
                    System.out.println("2. Perro mixto");
                    System.out.println("3. Perro cargada");
                    System.out.println("4. Regresar\n");
                    System.out.println("--¿Qué tipo de perrito caliente desea?--");
                    tipocomida=in.nextInt();
                    switch (tipocomida) {
                        case 1:
                            precio=4000;
                            break;
                        case 2:
                            precio=7000;
                            break;
                        case 3:
                            precio=10000;
                            break;
                        case 4:
                            Menu();
                            correcto=false;
                            break;
                        default:
                            System.out.println(error);
                            correcto=false;
                            break;
                        }
                    if(correcto){
                        System.out.println("¿Cuántos perritos calientes desea agregar?");
                        cantidad=in.nextInt();
                        correcto=false;
                    }
                    break;
                //Pizzas
                case "Pizza":
                    System.out.println("--TIPOS PIZZAS--");
                    System.out.println("1. Pizza Hawaiana -$8000");
                    System.out.println("2. Pizza Pollo y Champiñones -$10000");
                    System.out.println("3. Pizza Jamon y Queso -$8000");
                    System.out.println("4. Pizza Carbonara -$14000");
                    System.out.println("5. Regresar\n");
                    System.out.println("¿Qué tipo de pizza desea?");
                    tipocomida=in.nextInt();
                    switch (tipocomida) {
                        case 1:
                            precio=8000;
                            break;
                        case 2:
                            precio=8000;
                            break;
                        case 3:
                            precio=10000;
                            break;
                        case 4:
                            precio=14000;
                            break;
                        case 5:
                            Menu();
                            correcto=false;
                            break;
                        default:
                            System.out.println(error);
                            correcto=false;
                            break;
                        }
                    if(correcto){
                        System.out.println("¿Cuántas pizzas desea agregar?");
                        cantidad=in.nextInt();
                        correcto=false;
                    }
                    break;
            }
            ProPreCan.add(precio);
            total+=(precio*cantidad);
        }while(correcto);
        return precio;
    }
    
    private static void Menu(){
        do{
            System.out.println("  MENÚ FASTFOOD  ");
            System.out.println("1.--HAMBURGUESAS--");
            System.out.println("2.--SALCHIPAPAS--");
            System.out.println("3.--PERROS CALIENTES--");
            System.out.println("4.--PIZZA--");
            System.out.println("5.--FINALIZAR PEDIDO--");
            //System.out.println("6.--CAMBIAR UNA ORDEN DE PEDIDO--\n");
            System.out.println("Escoga una opción");
            opcion=in.nextInt();
            
            switch(opcion){
                case 1: 
                    TiposComida("Hamburguesa");
                    //System.out.println(total);
                    break;
                case 2:
                    TiposComida("Salchi");
                    break;
                case 3:
                    TiposComida("PCaliente");
                    break;
                case 4:
                    TiposComida("Pizza");
                    break;
                case 5:
                    if(total>0){
                        System.out.println("\n--CANCELE EN CAJA--");
                        System.out.println("\n--Y ASÍ SU PEDIDO SALDRA EN BREVE--\n ");
                        System.out.println("Total del pedido: $"+total);
                    }else{
                        System.out.println("\n--No se ha realizado ningún pedido--");
                    }
                    break;
                default:
                    System.out.println("POR FAVOR ESCOJA UNA OPCIÓN DEL MENÚ");
                    break;
            }
        }while(opcion!=5);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        //Menu();
        List miLista = new ArrayList();
        miLista.add(2);
        miLista.add("hola");
        
        List miLista2 = new ArrayList();
        miLista2.add(miLista);
        
        for(Object mi:miLista2){
            System.out.println(mi);
        }
        
        //Map<String,Integer> map = new HashMap<String, Integer>();
        //map.put(key, total);
        
    }
}

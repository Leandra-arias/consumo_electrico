/*Sistema de calculo de total a abonar segun el consumo electrico en watts
*
* @author Arias Leandra Marcela
* @since november 2022
* @version 1.0.0
*/
import java.util.Scanner;


public class gestion{


    public static void main(String[] args) {

    //declaracion de objeto entrada
    Scanner entrada = new Scanner(System.in);
    
    //Mensaje en consola de bienvenida al sistema
    System.out.println("***************BIENVENIDO*****************");
    System.out.println("=Sistema de Calculo de Consumo Electrico==");
    System.out.println("==========Provincia de Cordoba============");

    System.out.println("Ingresando al sistema...");

    //Tiempo simulacion 
    try {
        Thread.sleep(4000);
        } catch (Exception e) {

        }
    System.out.println("");



    //Declaracion e inicializacion de variables
    double total = 0.0;
    int consumoElectrico = 0;
    int consulta = 0;

do{ 
    //Bucle do-while para el calculo del consumo electrico 

    System.out.println("Introduzca la cantidad de watts consumidos en el ultimo mes:");
    consumoElectrico = entrada.nextInt();

 
     if(consumoElectrico<250){
        total = consumoElectrico*1.2;

    }
    else if(consumoElectrico==250){
        total = consumoElectrico*1.5;
    
    }
    else{
        total = consumoElectrico*2.1;
    }


    System.out.println("El total a abonar es $ " + total);
    System.out.println("");

    try {
            Thread.sleep(4000);
        } catch (Exception e) {
        }
    System.out.println("");


    System.out.println("Desea consultar otro valor?");
    System.out.println("1. Si");
    System.out.println("2. No");
    consulta = entrada.nextInt();

    }while(consulta<2);

    System.out.println("===============Gracias por utilizar nuestro servicio==================");

    
    }
}
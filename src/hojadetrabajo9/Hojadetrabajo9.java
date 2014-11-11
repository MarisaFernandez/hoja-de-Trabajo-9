/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo9;
import java.io.IOException;
import java.util.Scanner;

public class Hojadetrabajo9 {
    
    public static void main(String[] args) {
	AlgoritmoFloyd mi_Matriz = new AlgoritmoFloyd(); 
	int eleccion_ususario, opcion;
	mi_Matriz.caminoCorto(); 
	Scanner mi_scanner = new Scanner(System.in);
        /*MENSAJE*/
	System.out.println("-------------------BIENVENIDO----------------------");
	System.out.println("1. Encontrar la ruta más corta entre dos ciudades");
	System.out.println("2. Nombre de la ciudad que se encuentra en el centro del grafo");
	System.out.println("3. Modificar el grafo");
	System.out.println("4. Finalizar programa");
        System.out.println("-----------------------------------------------------");
	eleccion_ususario = mi_scanner.nextInt();

	/*CICLO*/
	while(eleccion_ususario!=4){
            /* Matríz desplegada */
            System.out.println("-----------------------------------------------------");
            System.out.println("Matriz de Adyacencia");
            mi_Matriz.D.show();
            /*(opción 1)*/
            System.out.println("-----------------------------------------------------");
            if(eleccion_ususario==1){
                mi_Matriz.caminoCorto(); /* Camino mas corto entre las ciudades */
                System.out.println("Ingrese el nombre de la ciudad salida");
                String ciudad1 = mi_scanner.next();
                System.out.println("Ingrese el nombre de la ciudad destino");
                String ciudad2 = mi_scanner.next();
                if(mi_Matriz.D.contains(ciudad1)&&mi_Matriz.D.contains(ciudad2)){
                    System.out.println("\nLa distancia mas corta es: "+mi_Matriz.D.getEdge(ciudad1, ciudad2)+".");
                    if(mi_Matriz.D.getEdge(ciudad1, ciudad2)!=1000){
                        System.out.print("La ruta es por: "+ciudad1);
                        mi_Matriz.mostrarIntermedias(mi_Matriz.D.getIndex(ciudad1), mi_Matriz.D.getIndex(ciudad2));
                        System.out.println("y "+ciudad2);
                    }
                }
            }
            /*(opción 2) */
            else if(eleccion_ususario==2){
		mi_Matriz.centroGrafo();
            }
            /*(opción 3) */
            else if(eleccion_ususario==3){
		System.out.println("1. Hay interrupcion de trafico ");
		System.out.println("2. Nueva conexion");
		opcion = mi_scanner.nextInt();
		/*opcion3-(opcion2)*/
		if(opcion==1){
                    System.out.println("Ingrese el nombre de la ciudad de salida");
                    String ciudad1 = mi_scanner.next();
                    System.out.println("Ingrese el nombre de la ciudad de destino");
                    String ciudad2 = mi_scanner.next();
                    if(mi_Matriz.D.contains(ciudad1)&&mi_Matriz.D.contains(ciudad2)){
			mi_Matriz.D.addEdge(ciudad1, ciudad2, 1000);
                        try {
                            mi_Matriz.a.write(ciudad1+" "+ciudad2+" 1000");
                            } 
			catch (IOException ex) {
                            }
                    }
		}
		/* opcion3-(opción 2)*/
		else if(opcion==2){
                    System.out.println("Ingrese el nombre de la ciudad de salida");
                    String ciudad1 = mi_scanner.next();
                    System.out.println("Ingrese el nombre de la ciudad de destino");
                    String ciudad2 = mi_scanner.next();
                    System.out.println("Ingrese la distancia entre las ciudades");
                    int distancia = mi_scanner.nextInt();
                    // Si las ciudades ya existen
                    if(mi_Matriz.D.contains(ciudad1)&&mi_Matriz.D.contains(ciudad2)){
			mi_Matriz.D.addEdge(ciudad1, ciudad2, distancia);
                    }
                    /* Agrega las ciudades que no existen */
                    else{
			mi_Matriz.D.add(ciudad1);
			mi_Matriz.D.add(ciudad2);
			mi_Matriz.D.addEdge(ciudad1, ciudad2, distancia);
			}
                    try {
			mi_Matriz.a.write(ciudad1+" "+ciudad2+" "+distancia);
                    } 
                    catch (IOException ex) {
                    }
		}
			mi_Matriz.caminoCorto();
            }
		
            System.out.println("-------------------BIENVENIDO----------------------");
            System.out.println("1. Encontrar la ruta más corta entre dos ciudades");
            System.out.println("2. Nombre de la ciudad que se encuentra en el centro del grafo");
            System.out.println("3. Modificar el grafo");
            System.out.println("4. Finalizar programa");
            System.out.println("-----------------------------------------------------");
            eleccion_ususario = mi_scanner.nextInt();
	}
	System.out.println("GRACIAS POR UTILIZAR EL PROGRAMA ");
    }
}

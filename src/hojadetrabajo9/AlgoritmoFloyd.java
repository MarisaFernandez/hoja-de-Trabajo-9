/*
fuentes: http://es.wikibooks.org/wiki/Implementaci%C3%B3n_del_algoritmo_de_Floyd_en_Java y https://code.google.com/p/hoja-8-grafos/source/browse/Hoja8/src/hoja8/Floyd.java?r=6
Creado por: 
	Maria Fernanda Martinez, Adrian Martinez
Modificado por: 
	Ana Bartra y Ma. Isabel Fernandez 
*/
package hojadetrabajo9;

import java.io.IOException;

public class AlgoritmoFloyd {
        ModificarArchivo a= new ModificarArchivo();
	InterfazGrafo D= new GraphMatrix();
	int[][] P;
	int[] max;
	int centro;
	int minimo=1000;
	/* Constructor */
	public AlgoritmoFloyd(){
		try {
			a.obtenermiArchivo("src/texto.txt");
			a.arregloNom(); /* Nombre de los nodos */
			D = a.matrizPesos(); /* Peso de los arcos entre nodos */
			P = new int[25][25]; /* Matriz de nodos intermedios */
			max = new int[25];
		} 
		catch (IOException ex) {
		}
		for(int n=0;n<a.miGrafo.size()-1;n++){
			for(int m=0;m<a.miGrafo.size()-1;m++){
				P[n][m]=10000;
			}
		}
	}
	/* Algoritmo de Floyd para encontrar el camino mas corto entre todos los nodos */
	public void caminoCorto(){
            for(int k=0;k<D.size()-1;k++){
                for(int i=0;i<D.size()-1;i++){
                    for(int j=0;j<D.size()-1;j++){
                        if(D.getEdge(D.get(i),D.get(j))>(D.getEdge(D.get(i), D.get(k))+D.getEdge(D.get(k), D.get(j)))){
                            D.addEdge(D.get(i), D.get(j), (D.getEdge(D.get(i), D.get(k))+D.getEdge(D.get(k), D.get(j))));
                            P[i][j]=k;
                        }
                    }
                }
            }
	}
	/* Encontrar el centro del grafo */
	public void centroGrafo(){
            caminoCorto();
            int n=0;
            /* Encuentra los valores máximos de la matríz en cada columna */
            for(int i=0;i<D.size()-1;i++){
                for(int j=0;j<D.size()-1;j++){
                    int num1=D.getEdge(D.get(j), D.get(i));
                    n=j;
                    n++;
                    int num2=D.getEdge(D.get(n), D.get(i));
                    if(num1>num2){
                        max[i]=num1;
                    }
                    else{
                        max[i]=num2;
                    }
                }
                n++;
            }
            /* Encuentra los valores minimos de los maximos de todas las columnas */
            for(int i=0;i<D.size()-1;i++){
                int num1=max[i];
                if(num1<minimo){
                    centro=i;
                    minimo=num1;
                }
            }
            System.out.println("\nEl centro del grafo es: "+D.get(centro)+"\n");
	}
	/* Desplegar los nodos intermedios */
	public void mostrarIntermedias(int num1, int num2){
            if(P[num1][num2]!=10000){
                mostrarIntermedias(num1,P[num1][num2]);
                System.out.print(", "+D.get(P[num1][num2]));
                mostrarIntermedias(P[num1][num2],num2);
            }
	}
}

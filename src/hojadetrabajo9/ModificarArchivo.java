/*
	Fuente consultada: http://www.aprenderaprogramar.com/foros/index.php?topic=679.5;wap2 Y http://www.lawebdelprogramador.com/foros/imprimir.php?id=633554'
	Ma. Isabel Fernandez y Ana Bartra. 
*/
package hojadetrabajo9;

import java.io.*;
import java.util.Arrays;
public class ModificarArchivo{
	FileWriter escritor;
	PrintWriter impresor;
	InterfazGrafo miGrafo = new GraphMatrix();
	File miArchivo;
	FileReader lector;
	BufferedReader buffer;
	/* Escribe el texto dentro del archivo */
	public void write(String cadena) throws IOException{
		escritor = new FileWriter(miArchivo);
		impresor = new PrintWriter(escritor);
		impresor.println(cadena);
	}
	/* Obtiene los pesos entre los nodos*/
	public InterfazGrafo matrizPesos() throws IOException{
		lector = new FileReader (miArchivo);
		buffer = new BufferedReader(lector);
		String linea;
		while((linea=buffer.readLine())!=null){
			String[] tmp;
			tmp=linea.split(" ");
                        System.out.println(Arrays.toString(tmp));
			miGrafo.addEdge(tmp[0], tmp[1], tmp[2]);
		}
	return miGrafo;
	}
	/* Obtiene los nombres  de los nodos */
	public InterfazGrafo arregloNom() throws IOException{
		String a;
		lector = new FileReader (miArchivo);
		buffer = new BufferedReader(lector);
		while((a=buffer.readLine())!=null){
			String[] tmp;
			tmp=a.split(" ");
			miGrafo.add(tmp[0]);
			miGrafo.add(tmp[1]);
		}
		return miGrafo;
	}
	/* Obtiene el miArchivo */
	public void obtenermiArchivo(String direccion) throws FileNotFoundException{
		miArchivo=new File(direccion);
	}
}
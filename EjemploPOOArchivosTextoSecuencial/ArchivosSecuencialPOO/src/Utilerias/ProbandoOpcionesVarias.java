package Utilerias;
import paquete1.Profesor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class ProbandoOpcionesVarias {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Profesor profes[] = {new Profesor("Daniel","Principal")
                            ,new Profesor("Carlos","Auxiliar")
                            ,new Profesor("Pedro","Titular")};
        /*Formatter archivoSalida = new Formatter("test1.txt");
        archivoSalida.format("%s;%s\n", profes[0].obtenerNombre(),profes[0].obtenerTipo());
        archivoSalida.format("%s;%s\n", profes[1].obtenerNombre(),profes[1].obtenerTipo());
        archivoSalida.close();
        
        Scanner archivoEntrada = new Scanner(new File("test1.txt"));
        System.out.println(archivoEntrada.next());*/
        
        Formatter fileOut = new Formatter(new FileWriter("test1.txt",true));
        fileOut.format("%s;%s\n", profes[0].obtenerNombre(),profes[0].obtenerTipo());
        fileOut.close();
        
        ArrayList <Profesor> profesores = new ArrayList();
        profesores.add(new Profesor("Daniel","Principal"));
        profesores.add(new Profesor("Carlos","Auxiliar"));
        profesores.remove(0);
        for (int i = 0; i < profesores.size(); i++) 
            System.out.println(profesores.get(i));
        for(Profesor profeAux : profesores)
            System.out.println(profeAux);
    }
}

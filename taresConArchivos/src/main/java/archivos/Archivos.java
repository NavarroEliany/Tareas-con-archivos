
package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Archivos{
    public static void main(String[] args) throws IOException {
    File file = new File ("./archivo2.txt");
    file.createNewFile(); //TODO: crear un metodo para crear archivos y mjeorar la excepcion 
    
    FileWriter writer = new FileWriter(file);
    PrintWriter pw = new PrintWriter(writer);
       
        for (int i = 0; i < 10; i++) 
        pw.print("Linea " + i);{
            
        }
        
       writer.close();
       
    
    }
   
}

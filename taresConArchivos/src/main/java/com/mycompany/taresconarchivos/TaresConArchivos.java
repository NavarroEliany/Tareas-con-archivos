
package com.mycompany.taresconarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.charset.Charset;


public class TaresConArchivos {

    public static void main(String[] args) throws IOException {
        File file = new File("./archivo.txt");
        
        if (!file.exists()) { 
            try{
                  file.createNewFile();
            System.out.println("Archivo creado :) " );
            }catch(IOException e){
                System.out.println("No se pudo ctrear el archivo  " );
            }
       
        } else {
            System.out.println("El archivo ya existe *_* ");
        }
        FileReader reader = new FileReader (file, Charset.forName ("UTF8"));
        System.out.println( reader.getEncoding());  
        
        //Acceder caracter a caracter
        /*
        char[] data = new char [50];
        reader.read(data);
        System.out.println(data [3]);
        */
       // reader.close(); //Para cerrar 
        //Poner mayuscula a la primera letra
        
        //Acceder linea a lines
        BufferedReader buffer = new BufferedReader (reader);
        String line;
        while ((line=buffer.readLine())!= null){
            System.out.println("Line: " + line);
        }
        reader.close();
    }
}

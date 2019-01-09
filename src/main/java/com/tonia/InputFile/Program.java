package com.tonia.InputFile;
import java.io.*;

public class Program {
    public static void main(String[] args){
        try (FileInputStream fin = new FileInputStream("E://Tonia//Android//io_notes.pdf") ;
             FileOutputStream fos = new FileOutputStream("E://Tonia//Android//new_notes.pdf"))
        {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer,0,buffer.length);
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package files;

import java.io.*;

/**
 *
 * @author MynorCifuentes
 */
public class WriteFile {

    public static void main(String[] args) {
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("C:/Cursos/archivo.txt");
            pw = new PrintWriter(fw);
            
            for (int i = 0; i < 10; i++) {
                pw.println("linea"+i);
                
            }
            
        } catch (Exception e) {
            e.getMessage();
        } finally {
            try {
                if (null != fw) {
                    fw.close();

                }
            } catch (Exception a) {
                a.getMessage();

            }
        }
    }

}
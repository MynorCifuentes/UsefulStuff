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

public class ReadFile {
    public static void main(String[] args) {
        File file = null;
        FileReader reader = null;
        BufferedReader br = null;
        
        try{
            file = new File("C:\\Cursos\\archivo.txt");
            reader = new FileReader (file);
            br = new BufferedReader(reader);
            
            String line;
            
            while((line = br.readLine())  != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
            
        }finally{
            try{
                if (null != reader) {
                    reader.close();
                    
                }
            }catch(Exception e){
                            System.out.println("Error "+ e.getMessage());

            }
        }
        
    }
    
}

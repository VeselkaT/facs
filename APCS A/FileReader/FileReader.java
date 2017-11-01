package filereader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dsartory
 */
public class FileReader {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        try (
            Scanner scanner = new Scanner(new File("src/filereader/data.txt"))) {
            scanner.useDelimiter(",");
            
            while(scanner.hasNext()){
                System.out.print(scanner.next()+"|");
            }
        }
    }
    
}

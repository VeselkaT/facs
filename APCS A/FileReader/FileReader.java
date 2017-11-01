import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        try (
            Scanner input = new Scanner(new File("src/filereader/data.txt"))) {
            input.useDelimiter(",");
            
            while(scanner.hasNext()){
                System.out.print(input.next()+"|");
            }
        }
    }
    
}

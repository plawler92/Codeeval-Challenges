import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Main {
    public static void main (String[] args) {
        try{
            File file = new File(args[0]);
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            int[] lineCount;
            String[] lineArray = line.split(" ");
            while ((line = in.readLine()) != null) {
                    String[] lineArray = line.split(" ");
                    if (lineArray.length > 0) {
                    System.out.println(lineArray[0]);                    
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by plawler92 on 8/23/2014.
 */
public class driver {
    public static void main(String[] args){
        File file = new File(args[0]);
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line;
            while((line = in.readLine()) != null){
                String[] lineArray = line.split(" ");
                if(lineArray.length > 0){
                    for(int i = lineArray.length - 1; i >= 0; i--){
                        System.out.print(lineArray[i]);
                        if(i != 0){
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}

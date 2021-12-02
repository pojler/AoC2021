package Day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class InputReader {

    public static final List<Coordinate> readFile(String fileName){
        List<Coordinate> result = new ArrayList<>();
        Path path = Paths.get(fileName);

        try {
            BufferedReader  br = Files.newBufferedReader(path);
            String line;
            while ((line = br.readLine()) != null){

               String[] splittedLine = line.split(" ");
               result.add(new Coordinate(splittedLine[0].equals("down") ? 0 : splittedLine[0].equals("up")? 1 :2,
                       Integer.parseInt(splittedLine[1])));

            }
        }
        catch (IOException e){
            System.out.println("Error while reading file");
        }
        return result;
    }

}
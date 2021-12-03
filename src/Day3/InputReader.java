package Day3;

import Day2.Coordinate;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class InputReader {

    public static final List<String> readFile(String fileName){
        List<String> result = new ArrayList<>();
        Path path = Paths.get(fileName);

        try {
            BufferedReader  br = Files.newBufferedReader(path);
            String line;
            while ((line = br.readLine()) != null){
                result.add(line);
            }
        }
        catch (IOException e){
            System.out.println("Error while reading file");
        }
        return result;
    }

}
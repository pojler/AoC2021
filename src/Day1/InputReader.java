package Day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class InputReader {

    public static final List<Integer> readFile(String fileName){
        List<Integer> result = new ArrayList<>();
        Path path = Paths.get(fileName);

        try {
            BufferedReader  br = Files.newBufferedReader(path);
            String line;
            while ((line = br.readLine()) != null){
                result.add(Integer.parseInt(line));
            }
        }
        catch (IOException e){
            System.out.println("Error while reading file");
        }
        return result;
    }

}

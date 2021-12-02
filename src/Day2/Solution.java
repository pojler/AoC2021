package Day2;

import java.util.List;

public class Solution {

    private int solution1(String filename){

        List<Coordinate> coordinates = InputReader.readFile(filename);
        int depth = 0;
        int distance = 0;
        for(Coordinate coordinate: coordinates){
            if(coordinate.getDirection() == 0){
                depth += coordinate.getValue();
            }
            else if (coordinate. getDirection() == 1){
                depth -= coordinate.getValue();
            }
            else{
                distance += coordinate.getValue();
            }

        }
        return depth * distance;

    }

    private int solution2(String filename){

        List<Coordinate> coordinates = InputReader.readFile(filename);
        int depth = 0;
        int distance = 0;
        int aim = 0;
        for(Coordinate coordinate: coordinates){
            if(coordinate.getDirection() == 0){
                aim += coordinate.getValue();
            }
            else if (coordinate. getDirection() == 1){
                aim -= coordinate.getValue();
            }
            else{
                distance += coordinate.getValue();
                depth += coordinate.getValue() * aim;
            }

        }
        return depth * distance;

    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        String path = "C:\\Users\\pojle\\IdeaProjects\\AoC2021\\src\\inputFiles\\inputDay2";
        System.out.println("Solution of the first part is = "+solution.solution1(path));
        System.out.println("Solution of the second part is = "+solution.solution2(path));
    }
}

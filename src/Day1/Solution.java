package Day1;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int solution1(String fileName){
        int result = 0;
        List<Integer> data = InputReader.readFile(fileName);
        int current = data.get(0);
        for(Integer next: data){
            if(next > current){
                result++;
            }
            current = next;
        }
        return result;
    }

    private int solution2(String fileName){
        int result = 0;
        List<Integer> data = InputReader.readFile(fileName);
        List<Integer> processedData = new ArrayList<>();
        for(int i = 0; i < data.size()-2; i++){
            processedData.add(data.get(i)+ data.get(i+1) + data.get(i+2));
        }
        int current = processedData.get(0);
        for(Integer next: processedData){
            if(next > current){
                result++;
            }
            current = next;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("Result of first task is = "+solution.solution1("C:/Users/pojle/IdeaProjects/AoC2021/src/inputFiles/inputDay1"));
        System.out.println("Result of second task is = "+solution.solution2("C:/Users/pojle/IdeaProjects/AoC2021/src/inputFiles/inputDay1"));
    }
}

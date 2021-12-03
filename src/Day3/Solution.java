package Day3;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private int solution1(String filename){

        int[] ones;
        int[] zeroes;
        List<String> input = InputReader.readFile(filename);
        ones = new int [input.get(1).length()];
        zeroes = new int [input.get(1).length()];
        for(String string: input){
            for(int i = 0; i < string.length(); i++){
                if(string.charAt(i) == '0'){
                    zeroes[i]++;
                }
                else{
                    ones[i]++;
                }
            }
        }
        String gammaRate = "";
        String epsilonRate = "";
       for(int i = 0; i < ones.length; i++){
            if(zeroes[i] > ones[i]){
                gammaRate += '0';
                epsilonRate += '1';
            }
            else{
                gammaRate += '1';
                epsilonRate += '0';
            }
       }
       int gamma = Integer.parseInt(gammaRate, 2);
       int epsilon = Integer.parseInt(epsilonRate, 2);

       return gamma * epsilon;
    }

    public int solution2 (String filename) {

        int[] ones;
        int[] zeroes;
        List<String> input = InputReader.readFile(filename);
        ones = new int[input.get(1).length()];
        zeroes = new int[input.get(1).length()];


        List<String> oxygen = new ArrayList<>();
        List<String> oxygenCache = new ArrayList<>();
        oxygenCache.addAll(input);
        String oxygenRate = "";

        for (int i = 0; i < ones.length; i++) {
            if (ones[i] >= zeroes[i]) {
                for (String string : oxygenCache) {
                    if (string.charAt(i) == '1') {
                        oxygen.add(string);
                    }
                }
            } else {
                for (String string : oxygenCache) {
                    if (string.charAt(i) == '0') {
                        oxygen.add(string);
                    }
                }
            }

            ones = new int[input.get(1).length()];
            zeroes = new int[input.get(1).length()];

            for (String string : oxygen) {
                for (int j = 0; j < string.length(); j++) {
                    if (string.charAt(j) == '0') {
                        zeroes[j]++;
                    } else {
                        ones[j]++;
                    }
                }
            }

            for (String string : oxygen) {
                System.out.println(string);
            }
            System.out.println();


            boolean oxygenFlag = true;
            if (oxygen.size() == 0 && oxygenFlag) {
                oxygenRate = oxygenCache.get(oxygenCache.size() - 1);
                oxygenFlag = false;
            }
            if (oxygen.size() == 1 && oxygenFlag) {
                oxygenRate = oxygen.get(0);
                oxygenFlag = false;
            }
            oxygenCache = new ArrayList<>();
            oxygenCache.addAll(oxygen);
            oxygen = new ArrayList<>();




        }

        ones = new int[input.get(1).length()];
        zeroes = new int[input.get(1).length()];

        for (String string : input) {
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) == '0') {
                    zeroes[j]++;
                } else {
                    ones[j]++;
                }
            }
        }

        List<String> co2 = new ArrayList<>();
        List<String> co2Cache = new ArrayList<>();
        co2Cache.addAll(input);
        String co2Rate = "";
        boolean co2Flag = true;
        for (int i = 0; i < ones.length; i++) {
            if (ones[i] >= zeroes[i]) {
                for (String string : co2Cache) {
                    if (string.charAt(i) == '0') {
                        co2.add(string);
                    }
                }
            } else {
                for (String string : co2Cache) {
                    if (string.charAt(i) == '1') {
                        co2.add(string);
                    }
                }
            }


            ones = new int[input.get(1).length()];
            zeroes = new int[input.get(1).length()];

            for (String string : co2) {
                for (int j = 0; j < string.length(); j++) {
                    if (string.charAt(j) == '0') {
                        zeroes[j]++;
                    } else {
                        ones[j]++;
                    }
                }
            }

            for (String string : co2) {
                System.out.println(string);
            }
            System.out.println();



            if (co2.size() == 0 && co2Flag) {
                co2Rate = co2Cache.get(co2Cache.size() - 1);
                co2Flag = false;
            }
            if (co2.size() == 1 && co2Flag) {
                co2Rate = co2.get(0);
                co2Flag = false;
            }
            co2Cache = new ArrayList<>();
            co2Cache.addAll(co2);
            co2 = new ArrayList<>();




        }

        int oxygenInt = Integer.parseInt(oxygenRate, 2);
        int co2Int = Integer.parseInt(co2Rate, 2);
        System.out.println(oxygenInt);
        System.out.println(co2Int);

        return oxygenInt * co2Int;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        String path = "C:\\Users\\pojle\\IdeaProjects\\AoC2021\\src\\inputFiles\\inputDay3";
        System.out.println("The solution of part one is = " + s.solution1(path));
        System.out.println("The solution of part one is = " + s.solution2(path));
    }

}

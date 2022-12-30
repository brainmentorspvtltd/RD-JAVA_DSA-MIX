package Recursion;

import java.util.ArrayList;

public class DiceCount {
    
    static ArrayList<String> countWays(int source, int target) {
        if(source == target) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        if(source > target) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        ArrayList<String> result = new ArrayList<>();
        for(int dice = 1; dice <= 6; dice++) {
            int current = source + dice;
            ArrayList<String> list = countWays(current, target);
            for(String str : list) {
                result.add(str + dice);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> res = countWays(0, 10);
        System.out.println(res);
    }
}

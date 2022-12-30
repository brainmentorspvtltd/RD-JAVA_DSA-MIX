package Recursion;

import java.security.DrbgParameters.Reseed;
import java.util.ArrayList;

public class Permutations {
    static ArrayList<String> permutations(String str) {
        if(str.length() == 0) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        char currentChar = str.charAt(0);
        String remString = str.substring(1);
        ArrayList<String> temp = permutations(remString);
        ArrayList<String> result = new ArrayList<>();

        for(String s : temp) {
            for(int i = 0; i <= s.length(); i++) {
                StringBuffer sb = new StringBuffer(s);
                sb.insert(i, currentChar);
                result.add(sb.toString());
            }
        }
        return result;

    }
    public static void main(String[] args) {
        permutations("abc");
    }
}

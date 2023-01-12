package Backtracking;

import java.util.ArrayList;

public class ValidParantheses {
    static ArrayList<String> parantheses(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(ans, "", 0, 0, n);
        return ans;
    }
    static void helper(ArrayList<String> ans, String currentBracket, int open, int close, int max) {
        // Base Case
        if(currentBracket.length() == max * 2) {
            ans.add(currentBracket);
            return;
        }

        if(open < max) {
            helper(ans, currentBracket + "(", open + 1, close, max);
        }
        if(close < open) {
            helper(ans, currentBracket + ")", open, close + 1, max);
        }
        

    }
    public static void main(String[] args) {
        int n = 3;
        ArrayList<String> ans = parantheses(n);
        System.out.println(ans);
    }
}

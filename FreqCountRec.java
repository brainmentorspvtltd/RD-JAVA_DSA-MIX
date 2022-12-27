package Recursion;

import java.util.HashMap;

public class FreqCountRec {

    static HashMap<Character, Integer> getCount(String str, int index, int len) {
        if(index == len) {
            HashMap<Character, Integer> map = new HashMap<>();
            return map;
        }
        HashMap<Character, Integer> map = getCount(str, index+1, len);
        char singleChar = str.charAt(index);
        if(map.get(singleChar) == null) {
            map.put(singleChar, 1);
        }
        else {
            int count = map.get(singleChar);
            map.put(singleChar, count + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        String str = "ram sharma";
        HashMap<Character, Integer> result = getCount(str, 0, str.length());
        System.out.println(result);
    }
}

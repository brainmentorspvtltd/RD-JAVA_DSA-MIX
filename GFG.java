public class GFG {
    static String encode(String str)
	{
        String result = "";
          for(int i = 0; i<str.length(); i++){
            int count = 1;
            char currentChar = str.charAt(i);
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            result = result + currentChar + count;
            
          }
          return result; //a1b3c1d4
	}

    public static void main(String[] args) {
        String result = encode("abbbcdddd");
        System.out.println(result);
    }
}

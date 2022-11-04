public class CommandLineArg {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
        // String z = args[0] + args[1];
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x + y;
        
    }
}

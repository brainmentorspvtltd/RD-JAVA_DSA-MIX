public class A {
    public static void main(String[] args) {
        String str = "Hello    Java      Coding";
        var a = str.split("\\s+");
        System.out.println(a.length);
        for(int i = a.length-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }
}

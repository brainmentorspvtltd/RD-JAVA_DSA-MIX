import java.util.HashMap;

class MapDemo{
    public static void main(String[] args) {
        // HashMap<String , Integer> map = new HashMap<>();
        // map.put("Amit", 2222);
        // map.put("Ram",3333);
        // System.out.println(map.get("Amit"));
        // "Amit".hashCode
        int map [] = new int[1000]; // 1000 elements fill with 0
       // HashMap<Integer, Boolean> map = new HashMap<>();
        int arr[] = {10,20,30,10,90,100};
        for(Integer i : arr){
            //if(map.get(i)!=null){
                if(map[i]!=0){
                System.out.println("Boys Party");
                return ;
            }
            map[i] = 1; // map[10]= 1
            //map.put(i, true);
        }
        System.out.println("Girls Party");
    }
}
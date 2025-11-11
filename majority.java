import java.util.HashMap;

public class majority {
    public static void main(String[] args) {
        int n=6;
        int[] arr={1,4,2,4,2,4};
        HashMap<Integer,Integer> freq= new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for(Integer key: freq.keySet()){
            if(freq.get(key)>=n/2){
                System.out.print(key+" ");
            }
        }
    }
}

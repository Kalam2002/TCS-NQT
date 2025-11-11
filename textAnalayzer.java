import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class textAnalayzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str=sc.nextLine();
        HashMap<Character,Integer> freq = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char c: str.toCharArray()){
            if(c!=' '){
                sb.append(c);
            }
        }
        String s=sb.toString().toLowerCase();
        for(char c: s.toCharArray()){
                freq.put(c,freq.getOrDefault(c,0)+1);
        }
        TreeMap<Character, Integer> sortedmap = new TreeMap<>(freq);

        for(Character key : sortedmap.keySet()){
            System.out.println(key+":"+sortedmap.get(key));
        }
    }
}

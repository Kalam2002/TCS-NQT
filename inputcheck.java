import java.util.Scanner;
import java.util.*;
public class inputcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(sc.hasNextInt()){
            int x= sc.nextInt();
            list.add(x);
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}

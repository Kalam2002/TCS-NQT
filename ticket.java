import java.util.Scanner;

public class ticket {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        char prev='0';
        for(char c:str.toCharArray()){
            if((c=='F' && prev=='E') || (c=='6' && prev=='5')){
                sb.deleteCharAt(sb.length()-1);
                prev='0';
                continue;
            }
            else if(c=='G'){
                continue;
            }
            else{
                sb.append(c);
            }
            prev=c;
        }
        System.out.println("Ticket: "+sb);
    }
}

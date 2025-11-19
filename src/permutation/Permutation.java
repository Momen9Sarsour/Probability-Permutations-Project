package permutation;
 import java.util.Scanner;

public class Permutation {
 static int count = 0;
   public static void printPermutn(String str, String ans){
        if (str.length() == 0) {
            System.out.println(ans);
            count++;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            printPermutn(ros, ans + ch);
        }
    }
    public static void main(String[] args){      
       System.out.print("Enter The Word OR Number : "  );
       Scanner sc = new Scanner(System.in);        
       String str = sc.nextLine();
            System.out.println("***************");
        printPermutn(str , "");
        System.out.println("Number of possibilities = " +count);
    }
}
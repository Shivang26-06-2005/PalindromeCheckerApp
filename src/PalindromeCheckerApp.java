import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Text:");
        String s1=sc.nextLine();
        int length=s1.length();
        boolean pal=false;
        for(int i=0;i<length/2;i++){
            if(s1.charAt(i)==s1.charAt(length-i-1)){
                pal=true;
            }
        }
        if(pal){
           System.out.println("Is it a palindrome?"+" "+pal);
        }

    }



    }

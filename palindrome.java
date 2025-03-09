import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the word ");
        String word = input.next();
        int len = (word.length()-1)/2;
        int a=0;
        for(int x=0;x<len;x++){
            if(word.charAt(x)!=word.charAt(len-x)){
                a=1;
             }
            else
             a=0;
           
        }
        if (a==0){
           System.out.println("Palindrome"); 
        }
        else{
            System.out.println("Not Palindrome");
        }

    }}
import java.util.*;
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = sc.nextLine();
        int vowels=0 , consonants=0;
        for(char ch:str.toCharArray()){
            if(Character.isLetter(ch)){        
               ch=Character.toLowerCase(ch);
               if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')      
               vowels++;
               else
               consonants++;
            }
        }
        System.out.println("Vowels :"+vowels);
        System.out.println("Constants :"+consonants);
    }
}

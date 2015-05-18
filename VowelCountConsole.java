/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowelcount;

import java.util.Scanner;

/**
 *
 * @author essence
 */
public class VowelCountConsole {
    
    static String word;
    
    public static void main(String[] args){
        System.out.println("Enter a string");
        
         word = new Scanner(System.in).nextLine();
        
        numberOfVowels(word);
        numberOfEachVowel(word);
    }

    public static void numberOfVowels(String word) {
        int count = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'A'
                    || word.charAt(i) == 'e' || word.charAt(i) == 'E'
                    || word.charAt(i) == 'i' || word.charAt(i) == 'I'
                    || word.charAt(i) == 'o' || word.charAt(i) == 'O'
                    || word.charAt(i) == 'u' || word.charAt(i) == 'U'
                    || word.charAt(i) == 'y' || word.charAt(i) == 'Y') {
                count++;
            }
        }
        System.out.println("The number of vowels is : "+ count);
    }
    public static void numberOfEachVowel(String word){
        
        //char vowels[] = {'a','e','i','o','u'};
        String vowels = "aeiou";
        
        for(int vowelindex=0; vowelindex<vowels.length(); vowelindex++){
            
            int vowelcount=0;            
            for(int wordindex=0; wordindex<word.length(); wordindex++){
                if(vowels.charAt(vowelindex)==word.charAt(wordindex))
                    vowelcount = vowelcount+1;
            }
            
            System.out.println("vowel " +vowels.charAt(vowelindex) +" is "+vowelcount+" times");
        }
        
    }
    
}

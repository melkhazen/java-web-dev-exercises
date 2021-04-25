package org.launchcode.java.studio.countinCharacters;

import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = input.nextLine();
        char[] charactersInString = str.toCharArray();
        HashMap<Character, Integer> charactersCount = new HashMap<>();
        CountingCharacters.numsOfChars(charactersInString, charactersCount);
        System.out.println(charactersCount);
    }
    public static void numsOfChars(char[] arr, HashMap<Character, Integer> hash){

        for(char i: arr){
            if (!hash.containsKey(Character.toLowerCase(i))) {
                hash.put(Character.toLowerCase(i), 1);
            }else if(hash.containsKey(Character.toLowerCase(i))){
                hash.put(i, hash.get(Character.toLowerCase(i)) + 1);
            }
        }
    }
}

package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 6, 5, 4, 1));
        String phrase = " I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        System.out.println(sum(nums));
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length: ");
        int numOfChars = input.nextInt();
        word(wordList, numOfChars);

    }

    private static int sum(ArrayList<Integer> arr) {
                int total = 0;
                for(int integer: arr) {
                    if(integer % 2 == 0){
                        total += integer;
                    }
                }
                return total;
            }
    private  static void word(ArrayList<String> arr, int length){
    for (String word: arr){
        if (word.length() == length){
            System.out.println(word);
        }
    }


            }

        }





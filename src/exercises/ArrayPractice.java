package exercises;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,5,8};
//        System.out.println(Arrays.toString(nums));

        for(int number : nums){
            if (number % 2 != 0){
                System.out.println(number);
            }
        }
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] phraseArray = phrase.split("\\.");
        System.out.println(Arrays.toString(phraseArray));


    }
}

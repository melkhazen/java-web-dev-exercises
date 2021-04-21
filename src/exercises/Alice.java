package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Search for a word in alice");
        String search = input.next();
        input.close();
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        if (alice.toLowerCase(Locale.ROOT).contains(search.toLowerCase(Locale.ROOT)) == true){
            System.out.println("indeed it exist buhahaha!");
        }else{
            System.out.println("Im sorry it doesn't exist ");
        };

    }
}

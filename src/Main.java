import java.util.Arrays;
import java.util.*;
import java.io.*;

//Problem: Test to check if one string has all unique characters or not.
public class Main {
    public static void main(String[] args) {
        String str = "BING E";
        String strU = "ab";

        Hashtable<Integer, Character> ht1 = new Hashtable<>();

        int incrementor = 0;

        //intial for loop to add all characters to ht1
        for(int i = 0; i < str.length(); i++){
            ht1.put(i+1, str.charAt(i));
        }

        //The runtime of this is O(n^2), and could be improved to O(n) with the use of the .contains method for the Hashtable
        //At the time of creation, I restricted internet usage however and did not think to implement .contains
        for(int i = 0; i < str.length(); i++){
            char current = ht1.get(i+1);
            incrementor = 0;
            for(int j = 0; j < str.length(); j++){
                //check if the current char is not within
                if(current == str.charAt(j)){
                    incrementor++;
                }

                if(incrementor > 1){
                    System.out.println("non-unique string");
                    return;
                }
            }
        }

    }
}
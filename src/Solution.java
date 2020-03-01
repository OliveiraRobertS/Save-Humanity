import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    static void virusIndices(String p, String v) {
     String newP;
        boolean bool=false;
        int icont = 0;
        String result = "";
        
        for (int i = 0; i < p.length()-v.length()+1; i++) {
            icont = 0;
            newP = p.substring(i, v.length()+i);
            for(int j = 0; j < newP.length(); j++) {
                if( newP.charAt(j) == v.charAt(j)) {
                    icont++;
                }
            }
            if(icont >= v.length()-1) {
                bool=true;
                result = result.concat(Integer.toString(i) + " ");
            }
        }
        if (bool) {
            System.out.println(result);
        }else {
            System.out.println("No Match!");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] pv = scanner.nextLine().split(" ");

            String p = pv[0];

            String v = pv[1];

            virusIndices(p, v);
        }
    }
}
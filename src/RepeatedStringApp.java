// My solution to the HackerRank.com problem "Repeated String."
// https://www.hackerrank.com/challenges/repeated-string/problem

import java.util.Scanner;

public class RepeatedStringApp {
    static long repeatedString(String s, long n) {
    	long q = n/(s.length());
    	long r = n % (s.length());
    	int originalAcount = 0;
    	int extraAcount = 0;
    	
    	String [] splitWord = s.split("");
    	
    	for(int i = 0; i < splitWord.length; i++) {
    		if(splitWord[i].equals("a")) {
    			originalAcount++;
    		}
    	}

    	for(int i = 0; i < r; i++) {
    		if(splitWord[i].equals("a")) {
    			extraAcount++;
    		}
    	}

    	return 	((q*originalAcount) + extraAcount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string, s (1-100 characters): "); 
        String s = in.next();
        System.out.print("Enter the number of letters, n , to be shown in the infinite string (integer 1-10^12): "); 
        long n = in.nextLong();
        long result = repeatedString(s, n);
        System.out.println(result);
        in.close();
    }
}

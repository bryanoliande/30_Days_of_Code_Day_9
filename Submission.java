import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int factorial(int N) {
        if (N <= 1) {
            return 1;
        }
        
        return N * factorial(N-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(factorial(N));
    }
}
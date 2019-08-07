import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int a = Integer.parseInt(number1);
        String number2 = reader.readLine();
        int b = Integer.parseInt(number2);
        String number3 = reader.readLine();
        int c = Integer.parseInt(number3);
        if((a>b & b>c) | (c>b & b>a))
            System.out.println(b);
        if ((b>a & a>c)|(c>a & a>b))
            System.out.println(a);
        if ((a>c & c>b) | (b>c & c>a))
            System.out.println(c);
        if(a==b)
            System.out.println(a);
        else if (a==c)
            System.out.println(c);
        else if (b==c)
            System.out.println(b);

}}

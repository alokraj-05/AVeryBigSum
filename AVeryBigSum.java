import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num[] = new long[n];
        long sum = 0;
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
            sum = sum+num[i];
        }
        System.out.println(sum);
    }
}

package lab08.Task6;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (ferma(number)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    public static boolean ferma(long x){
        Random random = new Random();
        if(x == 2) return true;
        for(int i = 0;i <100;i++){
            long a = random.nextLong(x - 2) + 2;
            if (gcd(a, x) != 1)
                return false;
            if( pows(a, x-1, x) != 1)
                return false;
        }
        return true;
    }

    public static long gcd(long a, long b){
        if (b==0) return a;
        return gcd(b, a%b);
    }

    public static long mul(long a, long b, long m){
        if(b==1)
            return a;
        if(b%2==0){
            long t = mul(a, b/2, m);
            return (2 * t) % m;
        }
        return (mul(a, b-1, m) + a) % m;
    }

    public static long pows(long a, long b, long m){
        if(b==0)
            return 1;
        if(b%2==0){
            long t = pows(a, b/2, m);
            return mul(t , t, m) % m;
        }
        return ( mul(pows(a, b-1, m) , a, m)) % m;
    }
}


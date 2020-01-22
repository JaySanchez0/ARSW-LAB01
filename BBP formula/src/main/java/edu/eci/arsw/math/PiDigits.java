package edu.eci.arsw.math;

import java.util.ArrayList;
import java.util.Scanner;

import edu.eci.arsw.threads.ThreadBBP;

///  <summary>
///  An implementation of the Bailey-Borwein-Plouffe formula for calculating hexadecimal
///  digits of pi.
///  https://en.wikipedia.org/wiki/Bailey%E2%80%93Borwein%E2%80%93Plouffe_formula
///  *** Translated from C# code: https://github.com/mmoroney/DigitsOfPi ***
///  </summary>
public class PiDigits {

    private static int DigitsPerSum = 8;
    private static double Epsilon = 1e-17;
    public static byte[] getDigits(int start,int count,int threads) throws InterruptedException {
    	int num = count/threads;
    	ArrayList<ThreadBBP> threadsb = new ArrayList<>();
    	byte[] resp = new byte[count];
    	for(int i=0;i<threads;i++) {
    		ThreadBBP t = null;
    		if(i!=threads-1) t = new ThreadBBP(start+i*num,num,resp,i*num);
    		else t=  new ThreadBBP(start+(i)*num,num+(count%threads),resp,i*num);
    		threadsb.add(t);
    		t.start();
    	}
    	for(ThreadBBP t:threadsb) t.join();
    	return resp;
    }
    /**
     * Returns a range of hexadecimal digits of pi.
     * @param start The starting location of the range.
     * @param count The number of digits to return
     * @return An array containing the hexadecimal digits.
     */
    public static byte[] getDigits(int start, int count) {
        if (start < 0) {
            throw new RuntimeException("Invalid Interval");
        }

        if (count < 0) {
            throw new RuntimeException("Invalid Interval");
        }

        byte[] digits = new byte[count];
        double sum = 0;

        for (int i = 0; i < count; i++) {
            if (i % DigitsPerSum == 0) {
                sum = 4 * sum(1, start)
                        - 2 * sum(4, start)
                        - sum(5, start)
                        - sum(6, start);

                start += DigitsPerSum;
            }

            sum = 16 * (sum - Math.floor(sum));
            digits[i] = (byte) sum;
        }

        return digits;
    }

    /// <summary>
    /// Returns the sum of 16^(n - k)/(8 * k + m) from 0 to k.
    /// </summary>
    /// <param name="m"></param>
    /// <param name="n"></param>
    /// <returns></returns>
    private static double sum(int m, int n) {
        double sum = 0;
        int d = m;
        int power = n;

        while (true) {
            double term;

            if (power > 0) {
                term = (double) hexExponentModulo(power, d) / d;
            } else {
                term = Math.pow(16, power) / d;
                if (term < Epsilon) {
                    break;
                }
            }

            sum += term;
            power--;
            d += 8;
        }

        return sum;
    }

    /// <summary>
    /// Return 16^p mod m.
    /// </summary>
    /// <param name="p"></param>
    /// <param name="m"></param>
    /// <returns></returns>
    private static int hexExponentModulo(int p, int m) {
        int power = 1;
        while (power * 2 <= p) {
            power *= 2;
        }

        int result = 1;

        while (power > 0) {
            if (p >= power) {
                result *= 16;
                result %= m;
                p -= power;
            }

            power /= 2;

            if (power > 0) {
                result *= result;
                result %= m;
            }
        }

        return result;
    }
    public static void main(String[] args) throws InterruptedException {
    	Scanner scan = new Scanner(System.in);
    	for(int i=0;i<20;i++) {
    		System.out.println("Threads: ");
    		//int threads = scan.nextInt();
    		//int threads = Runtime.getRuntime().availableProcessors();
    		int threads = 2*Runtime.getRuntime().availableProcessors();
    		System.out.println(threads);
    		System.out.println("start: ");
    		int start = scan.nextInt();
    		System.out.println("Longitud: ");
    		int longi = scan.nextInt();
    		PiDigits.getDigits(start, longi,threads);
    	}
    }
}

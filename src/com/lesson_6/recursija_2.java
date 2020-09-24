package com.lesson_6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class recursija_2 {
    public static void main(String[] args) {

        int read = read ();
        System.out.println("натуральные числа от 1 до "+read);
        int x = read;
        String factorial = factorial(x);
        System.out.println(factorial);
    }
        static int read () {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = "";
            int number = 0;

            try
            {
                System.out.println("Please, input number and press 'Enter':");
                inputString = reader.readLine();
                number = Integer.parseInt(inputString);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
             return number;
        }
    static String factorial(int x) {
        if (x == 1)
        {
            return "1";
        }
        return factorial(x - 1) + " " + x;
    }
    }


package org.test;

/**
 * Created by Marv on 4/26/2018.
 */
public class Flips {

    static int countFlips(String s) {
           char[] panCakes = s.toCharArray();
           int count = 0;
           for (int i = 0; i < s.length() - 1; i++) {
               if (panCakes[i] != panCakes[i + 1])
                   count++;
           }

           if (panCakes[s.length() - 1] != '+')
               count++;

           return count;
    }
}

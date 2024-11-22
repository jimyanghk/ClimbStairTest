package org.postTest;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args)  {

        ClimbStair climbStair=new ClimbStair();
        try {
            BigInteger ways= ways = climbStair.calculateWays(5);
            System.out.println(ways);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }


    }
}
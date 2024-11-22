package org.postTest;

import java.math.BigInteger;

public class ClimbStair {
    public BigInteger calculateWays(int n) throws InvalidInputException {
        if(n<=0){
            throw new InvalidInputException("Input number should be larger than 0");
        }
        BigInteger lastStep = new BigInteger("1");
        BigInteger secondLastStep = new BigInteger("1");

        for (int i = 2; i <= n; i++) {
            BigInteger curr = lastStep.add(secondLastStep) ;
            secondLastStep = lastStep;
            lastStep = curr;
        }

        return lastStep;
    }

}

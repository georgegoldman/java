package com.genialserial.organized;

import java.util.Arrays;

public class Main {
    int mainVar = 5;



    //recursion
    public static int sum(int k) {
        if (k > 0)
        {
            return k + sum(k - 1);
        }else {
            return 0;
        }
    }

    //overloading

    static int plusMethod(int x, int y)
    {
        return x + y;
    }

    static double plusMethod(double x, double y)
    {
        return x + y;
    }

}

package com.genialserial.organized;

import java.util.Arrays;

public class Main {

//    public static void main(String[] args) {
////	    System.out.println("We got organized");
//        /*int someValue = 5;
//        System.out.println(++someValue);
//        System.out.println(someValue);
//
//        int someOtherValue = 5;
//        System.out.println(someOtherValue++);
//        System.out.println(someOtherValue);
//
//        int myValue = 50 ;
//        myValue += 5;
//
//        int myOtherValue = 100;
//        int val1 = 5;
//        int val2 = 10;
//        myOtherValue /= (val1 * val2);
//
//        System.out.println(myOtherValue);
//
//        System.out.println(myValue);
//
//        int intValueOne = 50;
//        long longValueOne = intValueOne;
//
//        System.out.println(longValueOne);*/
//
//        /*float floatVal = 1.0f;
//        double doubleVal = 4.0d;
//        byte byteVal = 7;
//        short shortVal = 7;
//        long longVal = 5;
//
//        short result1 = (short) longVal;
//        short result2 = (short) (byteVal - longVal);
//        float result3 = longVal - floatVal;
//        System.out.println("Success!");
//
//         */
//        /*int value1 = 7;
//        int value2 = 5;
//        int maxValue = value1 < value2 ? value1 : value2 ;
//        System.out.println(maxValue);
//
//         */
//
//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
//        char[] opCodes = {'d', 'a', 's', 'm'};
//        double[] results = new double[opCodes.length];
//
//
//        int student = 150;
//        int room = 4;
//
//        if (student/room > 30)
////            System.out.println("Created");
////        System.out.println("*** end of program ***");
//
//
////        switch
//
//
//        for(int i=0; i < opCodes.length; i++) {
//            switch (opCodes[i]) {
//                case 'a':
//                    results[i] = leftVals[i] + rightVals[i];
////                    System.out.println(results[i]);
//                    break;
//                case 's':
//                    results[i] = leftVals[i] - rightVals[i];
////                    System.out.println(results[i]);
//                    break;
//                case 'm':
//                    results[i] = leftVals[i] * rightVals[i];
////                    System.out.println(results[i]);
//                    break;
//                case 'd':
//                    results[i] = leftVals[i] / rightVals[i];
////                    System.out.println(results[i]);
//                    break;
//                default:
//                    System.out.println("invalid opcode: " + opCodes[i]);
//                    results[i] = 0.d;
////                    System.out.println(results[i]);
//                    break;
//            }
//        }
//
//
//        int[] numArray = new int[2];
//        numArray[0] = 1;
//        numArray[1] = 3;
////        System.out.println(Arrays.toString(numArray));
//
//        String[] stringArray = {"georgegoldman", "JOHN", "onyedikachi"};
//
////        System.out.println(Arrays.toString(stringArray));
//
////        let make the array double like multi
//        int[][][] doubleArray = new int[2][3][1];
//        doubleArray[0][1][0] = 3;
//        doubleArray[0][0][0] = 2;
//        doubleArray[0][2][0] = 4;
//        doubleArray[1][0][0] = 1;
//        doubleArray[1][1][0] = 0;
//        doubleArray[1][2][0] = 5;
////        System.out.println(Arrays.toString(doubleArray[1][0]))
//
//        System.out.println("Before method call");
//        doSomething();
//        System.out.println("After method call");
//
//        showSum(7.5f, 1.4f, 3);
//        System.out.println("back from show sum");
//
//        System.out.println(calculateInterest(500000, 50, 1));
//        System.out.println(Arrays.toString(produceInterestHistory(20000, 100, 3)));
//
//    }

    static void doSomething() {
        System.out.println("inside method");
        System.out.println("still inside");
    }

    static void showSum(float x, float y, int count) {
        if (count < 1)
            return;
        float sum  = x + y;
        for (int i = 0; i < count; i++)
            System.out.println(sum);
        return;
    }

    static double calculateInterest(double amt, double rate, int years) {
        double interest;
        interest = amt * rate * years;
        return interest;
    }

    static double[] produceInterestHistory(double amt, double rate, int years)
    {
        double[] accumulatedInterest;
        accumulatedInterest = new double[years];
        for(int yearIndex = 0; yearIndex < years; yearIndex++)
        {
            int year = yearIndex + 1;
            accumulatedInterest[yearIndex] = calculateInterest(amt, rate, year);
        }
        return accumulatedInterest;
    }

    public static void main(String[] args)
    {
        if(args.length < 1)
            System.out.println("No output provided");
        else
            for (String arg: args)
                System.out.println(arg);

        checkRelationship();
    }

   private static void handleWhen(String[] parts)
   {
       LocalDate startDate = LocalDate.parse(parts[1]);
       long daysToAdd = (long) valueFromWord(parts[2]);
       LocalDate newDate = startDate.plusDays(daysToAdd);
       String output = String.format("%s plus %d days is %s", startDate, daysToAdd, newDate);
       System.out.println(output);
   }

}

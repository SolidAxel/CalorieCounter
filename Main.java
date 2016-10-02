package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        double breadCal = 63;
        double meatCal = 210;
        double cheeseCal = 106;
        double mayoCal = 49;
        double pickleCal = 25;

        double totalbread, totalmeat, totalcheese, totalmayo, totalpickle;
        totalbread = totalmeat = totalcheese = totalmayo = totalpickle = 0;

	    Scanner s = new Scanner(System.in);
        System.out.println("                Welcome to Calorie Counter");
        System.out.print("Please enter your name:                                                          ");
        String name = s.nextLine();

        boolean success = false;

        while(!success)
        {
            try {

                System.out.print("How many sandwiches would you like?                                                 ");
                double numSandwiches = s.nextDouble();

                if(numSandwiches <= 0)
                {
                    throw new Exception();
                }

                        for (int i = 1; i <= numSandwiches; i++)
                        {
                            boolean success2, success3, success4, success5, success6;
                            success2 = success3 = success4 = success5 = success6 = false;

                            System.out.println("");
                            System.out.println("Hi " + name + ", please enter the amount of ingredients for sandwich number " + i);
                            System.out.println("");

                            while(!success2) {
                                try {
                                    System.out.print("Please enter number of slices of bread used (0 if not used and 5 is max):           ");
                                    double numBreadSlices = s.nextDouble();
                                    if (numBreadSlices < 0 || numBreadSlices > 5) {
                                        throw new Exception();
                                    }
                                    success2 = true;
                                    totalbread = numBreadSlices * breadCal;
                                }
                                catch (Exception e) {
                                    System.out.println("");
                                    System.out.println("       Please enter a value greater than or equal 0 and less than or equal to 5.");
                                    System.out.println("");
                                    success2 = false;
                                    s.nextLine();
                                }
                            }
                            while(!success3) {
                                try {
                                    System.out.print("Please enter number of slices of meat used (0 if not used and 5 is max):            ");
                                    double numMeatSlices = s.nextDouble();
                                    if (numMeatSlices < 0 || numMeatSlices > 5) {
                                        throw new Exception();
                                    }
                                    success3 = true;
                                    totalmeat = numMeatSlices * meatCal;
                                }
                                catch (Exception e) {
                                    System.out.println("");
                                    System.out.println("       Please enter a value greater than or equal 0 and less than or equal to 5.");
                                    System.out.println("");
                                    success3 = false;
                                    s.nextLine();
                                }
                            }
                            while(!success4) {
                                try {
                                System.out.print("Please enter number of slices of cheese used (0 if not used and 5 is max):          ");
                                double numCheeseSlices = s.nextDouble();
                                if (numCheeseSlices < 0 || numCheeseSlices > 5) {
                                    throw new Exception();
                                }
                                    success4 = true;
                                    totalcheese = numCheeseSlices * cheeseCal;
                            }
                                catch (Exception e) {
                                    System.out.println("");
                                    System.out.println("       Please enter a value greater than or equal 0 and less than or equal to 5.");
                                    System.out.println("");
                                    success4 = false;
                                    s.nextLine();
                                    }
                                }
                            while(!success5) {
                                try {
                                    System.out.print("Please enter amount of mayonnaise in grams used (0 if not used and 5 is max):       ");
                                    double numMayoGrams = s.nextDouble();
                                    if (numMayoGrams < 0 || numMayoGrams > 5) {
                                        throw new Exception();
                                    }
                                    success5 = true;
                                    totalmayo = numMayoGrams * mayoCal;
                                }
                                catch (Exception e)
                                {
                                    System.out.println("");
                                    System.out.println("       Please enter a value greater than or equal 0 and less than or equal to 5.");
                                    System.out.println("");
                                    success5 = false;
                                    s.nextLine();
                                }
                            }
                             while (!success6) {
                                 try {
                                     System.out.print("Please enter number of pieces of pickle used (0 if not used and 5 is max):          ");
                                     double numPickles = s.nextDouble();
                                     if (numPickles < 0 || numPickles > 5) {
                                         throw new Exception();
                                     }
                                     success6 = true;
                                     totalpickle = numPickles * pickleCal;
                                 }
                                 catch (Exception e)
                                 {
                                     System.out.println("");
                                     System.out.println("       Please enter a value greater than or equal 0 and less than or equal to 5.");
                                     System.out.println("");
                                     success6 = false;
                                     s.nextLine();
                                 }
                             }
                            System.out.printf("Bread calories: %20.2f%n" , totalbread);
                            System.out.printf("Meat calories: %21.2f%n" , totalmeat);
                            System.out.printf("Cheese calories: %19.2f%n" , totalcheese);
                            System.out.printf("Mayonnaise calories: %15.2f%n" , totalmayo);
                            System.out.printf("Pickle calories: %19.2f%n" , totalpickle);
                            System.out.println("");
                            System.out.printf("Total calories: %20.2f%n" , (totalbread+totalcheese+totalmayo+totalmeat+totalpickle));
                            System.out.printf("********************************************************************************** %n");

                        }
                System.out.println("Thank you for using Calorie Counter.");
                return;
            }

                        catch (Exception e)
                        {
                            System.out.println("");
                            System.out.println("       Please enter a value greater than or equal 0 and less than or equal to 5.");
                            System.out.println("");
                            success = false;
                            s.nextLine();
                        }

        }

    }
}


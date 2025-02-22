package learn.classes.experiment.experiment1;

import java.util.Scanner;

public class Second {



    public static double area(double l1,double l2,double l3){
        double s =(l1+l2+l3)/2;
        return Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
    }

    public static boolean isTriangle(double x1,double y1,
                                     double x2,double y2,
                                     double x3,double y3) {
        return !((y2 - y1)/(x2 - x1) == (y3 - y1)/(x3 - x1));
    }

    public static void main(String[] args) {
        System.out.println("Please enter three points of a triangle");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double x3 = in.nextDouble();
        double y3 = in.nextDouble();
        double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double b = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
        double c = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));

        if(isTriangle(x1,y1,x2,y2,x3,y3)){
            System.out.println("The area of the triangle is"+area(a,b,c));
        }
        else{
            System.out.println("Error");
        }
    }
}

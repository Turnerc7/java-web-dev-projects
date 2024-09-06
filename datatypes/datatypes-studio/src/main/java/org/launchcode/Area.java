package org.launchcode;

import java.util.Scanner;

public class Area {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println(" Enter a radius of a circle ");
            double radius = input.nextDouble();
             double area = Circle.getArea(radius);
//double area = 3.14 * radius * radius;
            System.out.println(" The radius of your circle is: " + area);
        }
    }

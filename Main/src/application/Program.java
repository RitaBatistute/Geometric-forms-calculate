package application;

import application.entities.Circle;
import application.entities.Rectangle;
import application.enums.Color;
import application.enums.GeometricForms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        List<Circle> circleList = new ArrayList<>();
        List<Rectangle> rectangleList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int numberOfShapes = sc.nextInt();

        for(int i=1; i<=numberOfShapes; i++){

            System.out.println("Shape #" + i + " data:");
            System.out.printf("Rectangle or circle? ");
            GeometricForms choice = GeometricForms.valueOf(sc.next().toUpperCase());

            if (choice.equals(GeometricForms.RECTANGLE)){

                Rectangle rectangle = new Rectangle();

                System.out.print("Color (BLACK/BLUE/RED): ");
                rectangle.setColor(Color.valueOf(sc.next().toUpperCase()));
                System.out.print("Width: ");
                rectangle.setWidth(sc.nextDouble());
                System.out.print("Height: ");
                rectangle.setHeight(sc.nextDouble());

                rectangleList.add(rectangle);

            }

            if (choice.equals(GeometricForms.CIRCLE)){

                Circle circle = new Circle();

                System.out.print("Color (BLACK/BLUE/RED): ");
                circle.setColor(Color.valueOf(sc.next().toUpperCase()));
                System.out.print("Radius: ");
                circle.setRadius(sc.nextDouble());

                circleList.add(circle);

            }
        }
        sc.close();

        System.out.println("SHAPE AREAS:");

        rectangleList.forEach(rectangle -> {
            System.out.println(rectangle.area());
        });

        circleList.forEach(circle ->
                System.out.println(circle.area()));
    }
}
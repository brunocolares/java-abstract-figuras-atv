package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int numberOfShapes = sc.nextInt();
		sc.nextLine();
		List<Shape> shapes = new ArrayList<>();
		for(int i = 1; i <= numberOfShapes; i++) {
			System.out.println("Shape #"+i+" data: ");
			System.out.print("Rectangle or circle (r/c)? ");
			char shape = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if(shape == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle(color, width, height));
			} else if(shape == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle(color, radius));
			} else {
				System.out.println("Opção inválida.");
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
	}

}

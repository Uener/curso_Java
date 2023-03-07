package application;

import java.util.ArrayList;
import java.util.List;

import model.entities.Circle;
import model.entities.Rectangle;
import model.entities.Shape;

public class Program {

	public static void main(String[] args) {
		
		List<Shape>list = new ArrayList<>();
		list.add(new Rectangle(3.0,2.0));
		list.add(new Circle(2.0));
		
		double total = totalArea(list);
		System.out.println(String.format("%.2f", total));

		List<Circle>myCircles = new ArrayList<>();
		
		myCircles.add(new Circle(2.0));
		myCircles.add(new Circle(3.0));
		
		System.out.println("Total area: " + totalArea(myCircles));
	}
	
	public static double totalArea (List<? extends Shape>list) {
		double sum = 0.0;
		for(Shape x : list) {
			sum += x.area();
		}
		return sum;
	}

}

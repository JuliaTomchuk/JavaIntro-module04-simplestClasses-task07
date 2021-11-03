package by.home.epam.module04.task07.logic;

import by.home.epam.module04.task07.entity.Point;
import by.home.epam.module04.task07.entity.Triangle;

public class TriangleLogic {
	private PointLogic pointLogic = new PointLogic();


	public Triangle createTriangle(double aX, double aY, double bX, double bY, double acX, double cY) {

		Point pointA = new Point(aX, aY);
		Point pointB = new Point(bX, bY);
		Point pointC = new Point(acX, cY);

		return new Triangle(pointA, pointB, pointC);

	}

	public double findPerimeter(Triangle triangle) {

		double sideA = pointLogic.findDistance(triangle.getVerticeA(), triangle.getVerticeB());
		double sideB = pointLogic.findDistance(triangle.getVerticeB(), triangle.getVerticeC());
		double sideC = pointLogic.findDistance(triangle.getVerticeC(), triangle.getVerticeA());

		return sideA + sideB + sideC;

	}

	public double findArea(Triangle triangle) {

		double p = findPerimeter(triangle) / 2;
		double sideA = pointLogic.findDistance(triangle.getVerticeA(), triangle.getVerticeB());
		double sideB = pointLogic.findDistance(triangle.getVerticeB(), triangle.getVerticeC());
		double sideC = pointLogic.findDistance(triangle.getVerticeC(), triangle.getVerticeA());

		return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

	}

	public Point findIntersectionPoint(Triangle triangle) {

		Point intersectionPoint = new Point();

		intersectionPoint.setX(
				(triangle.getVerticeA().getX() + triangle.getVerticeB().getX() + triangle.getVerticeC().getX()) / 3);
		intersectionPoint.setY(
				(triangle.getVerticeA().getY() + triangle.getVerticeB().getY() + triangle.getVerticeC().getY()) / 3);

		return intersectionPoint;

	}

}

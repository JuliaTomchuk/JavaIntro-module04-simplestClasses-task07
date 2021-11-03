package by.home.epam.module04.task07.logic;

import by.home.epam.module04.task07.entity.Point;

public class PointLogic {
	

	public double findDistance(Point pointFirst, Point pointSecond) {
		double x1 = pointFirst.getX();
		double y1 = pointFirst.getY();
		double x2 = pointSecond.getX();
		double y2 = pointSecond.getY();

		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

	}

}

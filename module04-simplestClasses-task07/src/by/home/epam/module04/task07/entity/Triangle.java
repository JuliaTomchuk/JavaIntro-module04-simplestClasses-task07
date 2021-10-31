package by.home.epam.module04.task07.entity;

/*Описать класс, представляющий треугольник.
 * Предусмотреть методы для создания объектов, вычисления площади, периметра и точки пересечения медиан.*/
public class Triangle {

	private Point verticeA;
	private Point verticeB;
	private Point verticeC;

	public Triangle() {
		verticeA = new Point();
		verticeB = new Point();
		verticeC = new Point();
	}

	public Triangle(Point verticeA, Point verticeB, Point verticeC) {
		this.verticeA = verticeA;
		this.verticeB = verticeB;
		this.verticeC = verticeC;
	}

	public Point getVerticeA() {
		return verticeA;
	}

	public void setVerticeA(Point verticeA) {
		this.verticeA = verticeA;
	}

	public Point getVerticeB() {
		return verticeB;
	}

	public void setVerticeB(Point verticeB) {
		this.verticeB = verticeB;
	}

	public Point getVerticeC() {
		return verticeC;
	}

	public void setVerticeC(Point verticeC) {
		this.verticeC = verticeC;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((verticeA == null) ? 0 : verticeA.hashCode());
		result = prime * result + ((verticeB == null) ? 0 : verticeB.hashCode());
		result = prime * result + ((verticeC == null) ? 0 : verticeC.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (verticeA == null) {
			if (other.verticeA != null)
				return false;
		} else if (!verticeA.equals(other.verticeA))
			return false;
		if (verticeB == null) {
			if (other.verticeB != null)
				return false;
		} else if (!verticeB.equals(other.verticeB))
			return false;
		if (verticeC == null) {
			if (other.verticeC != null)
				return false;
		} else if (!verticeC.equals(other.verticeC))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " [verticeA=" + verticeA + ", verticeB=" + verticeB + ", verticeC="
				+ verticeC + "]";
	}

}

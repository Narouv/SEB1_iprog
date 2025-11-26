public class Circle implements Shape {
  private double radius;

  public Circle(double _radius) {
    this.radius = _radius;
  }

  @Override
  public double area() {
    return Math.PI * Math.pow(radius, 2);
  }

  @Override
  public String name() {
    return "Circle";
  }
}
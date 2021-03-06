public class Point {
  private double x,y;
  public Point (double X, double Y) {
    x = X;
    y = Y;
  }
  public Point(Point p) {
    x = p.x;
    y = p.y;

  }
  public double getX(){
   return x;
 }

 public double getY(){
   return y;
 }
 public boolean equals(Point other ){
   return (other.getX() == getX()) && (other.getY() == getY());
 }
 public double distanceTo (Point other) {
   return Math.sqrt((Math.pow((other.getX()-getX()),2) + Math.pow((other.getY()-getY()),2)));
 }
}

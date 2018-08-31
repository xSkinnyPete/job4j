package ru.job4j.condition;

/**
 * @author Nikita Emelyanov (emeliapw@mail.ru)
 * @version $Id$
 * @since 0.1
 */
 
public class Point {
   private int x;
   private int y;
 
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
      Point a = new Point(0, 1);
      Point b = new Point(2, 5);
  }
  public double distanceTo(Point that) {
     return Math.sqrt(
             Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
     );
  }
}
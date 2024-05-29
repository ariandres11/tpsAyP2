package tp_6_12;

import java.util.Iterator;

public class Tp_6_12 {

    public static void main(String[] args) {
        PositionalList<Shape> p1 = new LinkedPositionalList<Shape>();

        p1.addFirst(new Circle(20));
        p1.addFirst(new Square(10));
        p1.addFirst(new Triangle(20,30));
        p1.addFirst(new Cube(10));
        
        Iterator<Shape> cursor = p1.iterator();
        Shape s;
        while (cursor.hasNext()) {
            s = cursor.next();
            if (s.getArea() <  10) {
                cursor.remove();
            }
        }
            System.out.println(p1);

    }

}

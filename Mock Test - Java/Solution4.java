/*
4. Create an interface called Drawable with a method draw() that has no implementation. Implement this interface in classes Circle and Rectangle. Write a program that creates objects of Circle and Rectangle and calls the draw() method on each object.
*/

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

public class Solution4 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();  // Output: Drawing a circle...

        Rectangle rectangle = new Rectangle();
        rectangle.draw();  // Output: Drawing a rectangle...
    }
}

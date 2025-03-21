package week1;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Circle {
    int radius;
    String name;

    public Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {

        double area;

        Circle pizza = new Circle(10, "자바피자");
        area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle donut = new Circle(2, "자바도넛");
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}

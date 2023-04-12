package aqa.course.tasks.step2;

public class Task1 {
    public static void main(String[] args) {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;

        double halfPerimeter = (sideA + sideB + sideC) / 2;
        double areaOfTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));

        System.out.println("Area: " + areaOfTriangle);
    }
}

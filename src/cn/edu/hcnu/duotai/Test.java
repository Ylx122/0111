package cn.edu.hcnu.duotai;

public class Test {
    public static void main(String[] args) {
//        Square square = new Square(5);
//        System.out.println(square.calcArea());
//
//        Triangle triangle = new Square(5);
//        System.out.println(triangle.calcArea());

        Shape shape = new Square();    //正方形是形状：向上转型（up-casting）,父类的引用指向子类的对象
        shape.calcArea();
    }
}

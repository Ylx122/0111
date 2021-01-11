package cn.edu.hcnu.duotai;

import cn.edu.hcnu.Example.Animal;
import cn.edu.hcnu.Example.Cat;

public class Test {
    public static void main(String[] args) {
//        Square square = new Square(5);
//        System.out.println(square.calcArea());
//
//        Triangle triangle = new Triangle(5,6);
//        System.out.println(triangle.calcArea());

        Shape shape = new Square(5);    //正方形是形状：向上转型（up-casting）,父类的引用指向子类的对象
        shape.calcArea();

    }
}

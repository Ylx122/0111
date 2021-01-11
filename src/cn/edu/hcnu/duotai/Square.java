package cn.edu.hcnu.duotai;

public class Square extends Shape {
    private float side;

    public Square(float i) {     //Square的构造方法
        this.side = i;
    }

    @Override
    public float calcArea() {
        System.out.println("正方形的面积：");
        return side * side;
    }
}

package cn.edu.hcnu.duotai;

public class Square extends Shape {
    private float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float calcArea() {
        System.out.println("正方形的面积：");
        return side * side;
    }
}

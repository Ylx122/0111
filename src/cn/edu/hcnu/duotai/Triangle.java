package cn.edu.hcnu.duotai;

public class Triangle extends Shape {
    private float bottom;
    private float height;

    public Triangle(float bottom, float height){   //Triangled的构造方法
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public float calcArea() {
        System.out.println("三角形的面积：");
        return (bottom * height) / 2;
    }

}

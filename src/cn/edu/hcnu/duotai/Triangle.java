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


    public float getBottom() {
        return bottom;
    }

    public void setBottom(float bottom) {
        this.bottom = bottom;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}

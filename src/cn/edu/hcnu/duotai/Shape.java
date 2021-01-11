package cn.edu.hcnu.duotai;

public abstract class Shape {
    private float area;

    public abstract float calcArea();

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }
}

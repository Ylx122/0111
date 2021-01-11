package cn.edu.hcnu.Example;

public abstract class Animal {
    private String bark;

    public Animal(String bark) {  //构造方法
        setBark(bark);
    }

    public abstract void tedian();


    public String getBark() {
        return bark;
    }

    public void setBark(String bark) {
        this.bark = bark;
    }
}

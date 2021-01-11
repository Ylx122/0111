package cn.edu.hcnu.Example;

public class Cat extends Animal {

    public Cat(String bark){    //构造方法
        super(bark);
    }

    @Override
    public void tedian() {
        System.out.println("猫叫声:"+ getBark());
    }
}

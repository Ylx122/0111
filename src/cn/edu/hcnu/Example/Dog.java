package cn.edu.hcnu.Example;

public class Dog extends Animal {

    public Dog(String bark) {    //构造方法
        super(bark);
    }

    @Override
    public void tedian() {
        System.out.println("狗叫声:" + getBark());
    }
}

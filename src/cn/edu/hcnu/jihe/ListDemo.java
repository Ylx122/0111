package cn.edu.hcnu.jihe;

import java.util.ArrayList;
import java.util.List;

//集合中的List:有序可重复
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);          //list.add(Object e)此函数需要要给对象  为什么 1 也可以 -> 装箱
        list.add("河池学院");
        list.add("888.8F");
        list.add(false);
        list.add(1);
        Object o = 1;

        System.out.println("List集合中可以重复所以现在list中的内容有：" + list.size() +"个");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

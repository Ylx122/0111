package cn.edu.hcnu.jihe;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//集合中的set:无序不可重复
public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(1);
        set.add("河池学院");
        set.add(888.8F);
        set.add(false);
        set.add(1);
        System.out.println("List 集合中可以重复所以现在 set 中的内容有：" + set.size() +"个");

        Iterator iterator = set.iterator();       //迭代器Iterator
        while(iterator.hasNext()){
            System.out.println("集合内的元素:"+iterator.next());
        }
    }
}

package com.ou.cn.iteratorPattern;

/**
 * description: IteratorMain <br>
 * date: 2020/5/8 20:56 <br>
 * author: 夏林梦子 <br>
 */
public class IteratorMain {

    public static void main(String[] args) {
        // 创建三个学生对象
        Student student1 = new Student("夏林",17);
        Student student2 = new Student("梦子",17);
        Student student3 = new Student("夏林梦子",18);

        // 创建集合对象，并且把学生放入对象中
        StudentAggregate aggregate = new StudentAggregate();
        aggregate.add(student1);
        aggregate.add(student2);
        aggregate.add(student3);

        System.out.println("第1次迭代=======");
        StudentAggregate.StudentIterator iterator1 = aggregate.iterator();
        while (iterator1.hasNext()) {
            Student next = iterator1.next();
            System.out.println("名字：" + next.getName() + " 年龄：" + next.getAge());
        }

        // 移除其中一个学生
        aggregate.remove(student2);

        System.out.println("第2次迭代=======");
        StudentAggregate.StudentIterator iterator2 = aggregate.iterator();
        while (iterator2.hasNext()) {
            Student next = iterator2.next();
            System.out.println("名字：" + next.getName() + " 年龄：" + next.getAge());
        }

        // 输出：
        /*
        第1次迭代=======
        名字：夏林 年龄：17
        名字：梦子 年龄：17
        名字：夏林梦子 年龄：18
        第2次迭代=======
        名字：夏林 年龄：17
        名字：夏林梦子 年龄：18
         */
        // 需要说明的是，有很多其他方法可以实现，目前java的集合就已经可以实现，这里只是想让让大家理解一下迭代器模式而已
        // 然后很多方法并没有考虑线程安全或者其他的一些问题，还请见谅
    }

}

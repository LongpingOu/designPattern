package com.ou.cn.iteratorPattern;

import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * description: StudentAggregate <br>
 * date: 2020/5/8 20:25 <br>
 * author: 夏林梦子 <br>
 */
public class StudentAggregate implements Aggregate<Student>  {

    private static List<Student> list = new ArrayList<>();

    @Override
    public void add(Student student) {
        list.add(student);
    }

    @Override
    public void remove(Student student) {
        list.remove(student);
    }

    @Override
    public StudentIterator iterator() {
        StudentIterator studentIterator = new StudentIterator();
        studentIterator.setIndex(0);
        return studentIterator;
    }

    @Setter
    public class StudentIterator implements Iterator<Student>{

        private int index = 0;

        @Override
        public Student next() {
            Student next = list.get(index);
            index++;
            return next;
        }

        @Override
        public boolean hasNext() {
            return list.size() > index;
        }
    }
}

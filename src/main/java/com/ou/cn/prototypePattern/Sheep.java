package com.ou.cn.prototypePattern;

import lombok.Getter;
import lombok.Setter;

import java.io.*;

/**
 * description: Sheep  具体原型：羊<br>
 * date: 2020/5/10 14:10 <br>
 * author: 夏林梦子 <br>
 */
@Getter
public class Sheep implements Prototype<Sheep>, Serializable {

    String name;

    int weight;

    int height;

    public Sheep(String name, int weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public Sheep cloneMe() throws CloneNotSupportedException {
        Sheep sheep = null;
        // 深度复制
        try {
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream outputStream1 = new ObjectOutputStream(outputStream);
            outputStream1.writeObject(this);
            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream inputStream1 = new ObjectInputStream(inputStream);
            sheep = (Sheep) inputStream1.readObject();
        } catch (Exception e) {
            System.out.println(e);
        }
        return sheep;
    }
}

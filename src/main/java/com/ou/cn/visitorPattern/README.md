
# 描述

## 访问者模式：

    表示一个作用于某对象结构中的各个元素的操作，它可以在不改变各个元素的类的前提下定义作用于这些元素的新操作
    
    引自GOF所著《Design Patterns》
    
    访问者模式的结构中包含无种角色
    1.抽象元素(Element):一个抽象类，该类定义了接收访问者的Accept操作
    2.具体元素（Concrete Element）： 抽象元素的子类
    3.对象结构(Object Structure): 一个集合，用于存放Element对象，提供遍历他自己的方法
    4.抽象访问者(Visitor): 一个接口，该接口定义了操作对象(Concrete Element的实例)的方法
    5.具体访问者(Concrete Visitor)：实现Visitor接口的类

### 使用场景：
    设计者需要给出一个算法的固定步骤，并且将这些步骤的具体实现留给子类来实现；需要对代码进行重构，将各个子类公共行为抽取出来集中到一个
    共同的父类中以避免重复代码。假设我们坐高铁的时候，主要是分为三步：1.安检，2.检票，2.找到自己的座位坐下来，然后做飞机，也是三个步骤：
    1.安检，2.检票，2.找到自己的座位坐下来。这种情况下，这三个步骤是固定下来的， 只是针对的对象不一样，我们在软件设计中，针对这种情况，
    为了减少相似代码，重复开发，就可以用模板方法了
    
    下面，我们就以刚才说的乘坐飞机和高铁为例进行阐述说明。
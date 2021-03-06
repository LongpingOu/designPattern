
# 描述

## 外观模式：

    为系统中的一组接口提供一个一致的界面，Facade模式定义了一个高层接口，这个接口使得这一子系统更加容易使用
    
    引自GOF所著《Design Patterns》
    
    适配器模式的结构中包含两种角色
    1.子系统（SubSystem）：子系统是若干个类的组合
    2.外观（Facade）： 外观是一个类，包含子系统找中全部或者部分类的实例引用

### 使用场景：
     一个大的系统一般都由多个子系统构成的，每个子系统又有多个类，这些类协同合作为用户提供一个完整的功能，如果客户端直接和子系统的多个类
     进行交互，那么就会使客户端类和子系统类耦合度过高。外观模式是简化客户端和子系统进行交互的一种设计模式。其关键是为子系统提供一个称为
     外观的类来负责充当客户端和子系统打交道的一个中间件。比如说，我现在要在某宝上购买一台电脑，我们可以分三步：1.选购电脑，2.创建订单，
     3.支付费用。那这三步，就相当于一个子系统，然后我们来看看怎么运用外观模式
    
    下面，我们就以刚才说的某宝上购买一台电脑为例进行阐述说明。
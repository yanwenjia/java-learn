package com.hbd.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @component  创建对象的，等同于<bean>的功能
 * 属性：value就是对象的名称，也就是baen的id值
 * value的值是唯一的。创建的对象在整个spring容器中就一个
 * 位置：在类的上面
 * 只有一个参数value可以省略
 *
 * 不指定对象的名称，由spring提供默认值 @component
 *
 * spring中和component功能一样，创建对象注解还有：
 * 1.@repository（用在持久层类的上面）：放在dao的实现类上面，
 *    表示创建dao对象，dao对象是能访问数据库的
 * 2.@service（用在业务层类的上面）：放在service的实现类上面
 *    创建service对象，service对象是做业务处理，可以有事务等功能
 * 3.@controller（用在控制器上面的）：创建控制器对象，能够节后用户提交的参数，
 *   显示请求的处理的结果
 *以上三个和@component语法一样，都能创建对象，但是又额外功能
 */

@Component
public class Student {
    /**
     * 简单类型的属性赋值@value
     * 属性：value是string类型的，表示简单类型的属性值
     * 位置：1.在属性定义的上面，无需set方法
     *      2. set方法上面
     */
    @Value(value = "张飞xxoo")
    private String name;
    @Value(value = "55")
    private int age;

    /**
     * 引用类型赋值
     * @autowired
     */
    @Autowired()
    @Qualifier("mySchool")
    private School school;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}

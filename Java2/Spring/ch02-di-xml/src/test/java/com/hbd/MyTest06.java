package com.hbd;

import com.hbd.ba06.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest06 {
    @Test
    public void test02(){
// 使用spring容器创建对象
        // 1.指定spring配置文件的名称
        String config = "ba06/total.xml";
        // 2.创建标识spring容器的对象，ApplicationContext
        // ApplicationContext标识spring容器，通过容器对象就能获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取
        Student student = (Student)ac.getBean("myStudent");
        System.out.println(student);

        // 使用
    }
}

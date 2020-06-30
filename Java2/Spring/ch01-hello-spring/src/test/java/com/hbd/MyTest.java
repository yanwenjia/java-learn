package com.hbd;

import com.hbd.service.Impl.SomeServiceImpl;
import com.hbd.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest {
    @Test
    public void test01(){
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }
    @Test
    public void test02(){
        // 使用spring容器创建对象
        // 1.指定spring配置文件的名称
        String config = "beans.xml";
        // 2.创建标识spring容器的对象，ApplicationContext
        // ApplicationContext标识spring容器，通过容器对象就能获取对象
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        // 从容器中获取
        SomeService service = (SomeService)ac.getBean("someService");

        // 使用
        service.doSome();
    }
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int nums = ac.getBeanDefinitionCount();
        System.out.println(nums);
        String[] names = ac.getBeanDefinitionNames();
        for (String name:names){
            System.out.println(name);
        }
    }
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date my = (Date) ac.getBean("mydate");
        System.out.println(my);
    }
}

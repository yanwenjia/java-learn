package com.learn.demo1;

import java.sql.*;

public class Demo {
    public static void main(String[] args) {
        try {
            demo1();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void demo1() throws ClassNotFoundException, SQLException {
        // 加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获取链接
       Connection conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8","root","root");
        // 基本操作
        // 获取执行sql语句的对象
        Statement statement = conn.createStatement();
        String sql = "Select * from users";
        ResultSet rs = statement.executeQuery(sql);
        System.out.println(rs.next());
        System.out.println(rs.getInt("id"));
//        System.out.println(rs.next());
        System.out.println(rs.getInt("id"));
//        while (rs.next()){
//            System.out.print(rs.getInt("id") + " ");
//            System.out.print(rs.getString("email") + " ");
//            System.out.println(rs.getString("name"));
//        }
        // 释放资源
        rs.close();
        statement.close();
        conn.close();
    }
}

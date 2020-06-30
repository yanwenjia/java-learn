package com.demo2;

import java.util.ArrayList;
import java.util.stream.Stream;

public class demo {
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> wonList = new ArrayList<>();

        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        wonList.add("林心如");
        wonList.add("张曼玉");
        wonList.add("林青霞");
        wonList.add("柳岩");
        wonList.add("林志林");
        wonList.add("王祖贤");


//        manList.stream().filter(s->s.length()==3).limit(3).forEach(s->{
//            Actor ac =  new Actor(s);
//            actors.add(ac);
//        });
//        wonList.stream().filter(s->s.startsWith("林")).skip(1).forEach(s->{
//            Actor ac =  new Actor(s);
//            actors.add(ac);
//        });
        Stream<String> manStream = manList.stream().filter(s -> s.length() == 3).limit(3);
        Stream<String> wonStream = wonList.stream().filter(s -> s.startsWith("林")).skip(1);

        Stream<String> allStream = Stream.concat(manStream, wonStream);
        allStream.map(Actor::new).forEach(System.out::println);

    }
}

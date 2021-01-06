package com.comac.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Stream {
    @Test
    public void  test(){
        List<User> lists = new ArrayList<>();
        User u1=new User("a",18);
        User u2=new User("b",19);
        User u3=new User("c",20);
        lists.addAll(Arrays.asList(u1,u2,u3));

//        lists.parallelStream().forEach(list->{
//            list.setName(list.getName()+"_test");
//        });

        lists.parallelStream().forEach(
            System.out::println);
        System.out.println("--------------------------------------");
        lists.parallelStream().map(list->list.getAge()+10).forEach(System.out::println);
        System.out.println("----------------------------------------");
        lists.parallelStream().filter(list -> list.getName().equals("c")).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("-----------------------------------------");
        lists.parallelStream().filter(list->!list.getAge().equals(19)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++==");
        lists.parallelStream().filter(list->list.getName().startsWith("b"))
                .filter(list->list.getName().length()==1)
//                .forEach(System.out::println);
                .forEach(System.out::println);
    }


}

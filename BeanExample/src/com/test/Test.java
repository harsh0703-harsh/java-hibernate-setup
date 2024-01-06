package com.test;

import com.bean.BeanExample;

public class Test {

    public static  void main(String[] args){

        BeanExample bean = new BeanExample();

        bean.setPassword("Harshgive@12i95");
        bean.setUserId("H0703");

        String pass_word = bean.getPassword();
        System.out.println(pass_word);

    }
}

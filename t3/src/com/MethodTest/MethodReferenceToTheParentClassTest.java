package com.MethodTest;

import com.Dome04.MethodReferenceEnhancement.MethodReferenceToTheParentClass;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MethodReferenceToTheParentClassTest {

    // 此注解会在每次测试方法运行前运行
    @Before
    public void before() {
        System.out.println("我会在每次测试方法运行开始前运行");
    }


    // 测试类的注解，这个注解在不需要mian方法是也可以运行
    @Test
    public void MySuberTest() {
        MethodReferenceToTheParentClass m = new MethodReferenceToTheParentClass();
//        Assert.assertEquals(参数1，参数2); 断言操作，用来判断预计结果和实际结果是否相符
//        m.MySuber( );
    }

    // 此注解会在每次测试方法运行后运行，Before喝After注解主要用于io测试
    @After
    public void after() {
        System.out.println("我会在每次测试方法运行完毕后运行");
    }
}

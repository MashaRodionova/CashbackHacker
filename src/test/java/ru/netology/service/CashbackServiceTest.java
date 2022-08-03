package ru.netology.service;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CashbackServiceTest {
private CashbackService service = new CashbackService();

    @Test
    public void test1(){

        int expected = 113;
        int actual = service.remain(887);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2(){

        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test3(){

        int expected = 999;
        int actual = service.remain(1001);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test4(){

        int expected = 1;
        int actual = service.remain(999);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test5(){

        int expected = 999;
        int actual = service.remain(1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test6(){

        int expected = 1000;
        int actual = service.remain(0);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test7(){

        int expected = 1001;
        int actual = service.remain(-1);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test8(){

        int expected = 0;
        int actual = service.remain(2000);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test9(){

        int expected = 700;
        int actual = service.remain(300);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test10(){

        int expected = 300;
        int actual = service.remain(1700);
        Assert.assertEquals(actual, expected);
    }


}

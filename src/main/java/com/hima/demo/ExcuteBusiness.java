package com.hima.demo;

import java.util.Objects;

public class ExcuteBusiness {


    public Integer add(Integer a, Integer b) throws InterruptedException {

        Thread.sleep(2000);

        if(Objects.isNull(a) || Objects.isNull(b)){
            return 0;
        }else {
            return a + b;
        }

    }
}

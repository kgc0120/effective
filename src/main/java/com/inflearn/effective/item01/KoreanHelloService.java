package com.inflearn.effective.item01;

/**
 * @author bumblebee
 */
public class KoreanHelloService implements HelloService{

    @Override
    public String hello() {
        return "안녕하세요!";
    }
}

package com.inflearn.effective.item03.functionalinterface;

/**
 * @author bumblebee
 *
 * 함수형 인터페이스
 */
@FunctionalInterface
public interface MyFunction {

    String valueOf(Integer integer);

    static String hello() {
        return "hello";
    }

}

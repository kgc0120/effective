package com.inflearn.effective.item03.staticfactory;

import java.util.function.Supplier;

/**
 * @author bumblebee
 *
 * 정적 팩터리의 메서드 참조를 공급자(Supplier)로 사용할 수 있다.
 */
public class Concert {

    public void start(Supplier<Singer> singerSupplier) {
        Singer singer = singerSupplier.get();
        singer.sing();
    }

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(ElvisV2::getInstance);
    }

}

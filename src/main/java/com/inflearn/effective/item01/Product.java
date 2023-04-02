package com.inflearn.effective.item01;

import static com.inflearn.effective.item01.Order.primeOrder;

/**
 * @author bumblebee
 */
public class Product {

    public static void main(String[] args) {
        Product product = new Product();
        Order primeorder = primeOrder(product);

        /*
        * 인터페이스와 정적 메서드 예제
        * */
        HelloService.of("eng"); // 정적 메서드(인스턴스 호출없이 가능, private한 정적 메서드는 java 9+이상부터 가능)

        EnglishHelloService englishHelloService = new EnglishHelloService();
        englishHelloService.bye(); // 기본 메서드(인스턴스를 가지고 사용해야 한다.)
    }


}

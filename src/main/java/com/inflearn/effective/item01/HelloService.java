package com.inflearn.effective.item01;

/**
 * @author bumblebee
 */
public interface HelloService {

    String hello();

    /*
     * 정적 팩터리 메서드 (장점3)
     * 인터페이스 기반의 프레임워크를 사용하도록 강조할 수 있다.
     * 반환 타입의 하위 타입 객체를 반할 수 있다.
     * */
    static HelloService of(String lang) {
        if(lang.equals("ko")) { // 장점4 매개변수에 따라 매번 다른 클래의 객체를 반환 할 수 있다.
            return new KoreanHelloService();
        } else {
            return new EnglishHelloService();
        }
    }
}

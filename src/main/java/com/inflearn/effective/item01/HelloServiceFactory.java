package com.inflearn.effective.item01;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * @author bumblebee
 */
public class HelloServiceFactory {

    public static void main(String[] args) {
        //정적 팩터리 메서드 (장점3,4)
//        HelloService eng = HelloService.of("eng");
//        System.out.println(eng.hello());

        /*
        * 정적 팩터리 메서드 (장점 5)
        * 예를 들어 ChineseHelloService를 jar 파일로 임폴트 했다고 가정하자.
        * 아래와 같이 사용하면 어떤 구현체가 올지 모르는 상태에서 사용하기 때문에 ChineseHelloService에 의존하지 않는다.
        * new ChineseHelloService 해서 직접 인스턴스를 만들어서 사용하는 거랑은 완전 다른 이야기이다. (ChineseHelloService를 import 해야함)
        * 아래와 같이 사용하면 굉장한 유연함을 준다.
        * 예시로 jdbc 드라이버 어떤 db를 사용할지 유연하게 해준다.
        * */
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class); // 이 시점에 HelloService 모든 구현체를 가져온다.
        Optional<HelloService> first = loader.findFirst();
        first.ifPresent( h -> {
            System.out.println(h.hello());
        });

    }

}

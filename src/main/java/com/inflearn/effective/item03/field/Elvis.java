package com.inflearn.effective.item03.field;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author bumblebee
 */
// 코드 3-1 pulbic static final 필드 방식의 싱글턴
public class Elvis implements IElvis, Serializable {

    /**
    * 싱글톤 오브젝트
     *
     * 장점 : 간편하고 보기 좋다.
     *      문서화해서 자바doc에 눈에 띄게 볼 수 있다.
     * 단점 : 클라이언트 코드를 테스트하기가 어려워진다.
     *       -> 하지만 인터페이스를 생성하면 테스트가 가능하다 MockElvs 확인
    * */
    public static final Elvis INSTANCE = new Elvis();
    private static boolean created;

    private Elvis() {
        if(created) { // 리플렉션으로 인스턴스 생성 방지
            throw new UnsupportedOperationException("can`t be created");
        }
        created = true;
    }

    public void leaveTheBuilding() {
        System.out.println("whoa baby, I`m outta here!");
    }

    public void sing() {
        System.out.println("I`ll have a blue~ Christmas without you~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
    }

    // 역질렬화 할 때 새로운 인스턴스 생성을 막기위함
    // 역질렬화 할 때 새로운 인스턴스가 생성된다.
    // 오버라이딩이 아닌 오버라이딩과 같은...
    private Object readResolve() {
        return INSTANCE;
    }

}

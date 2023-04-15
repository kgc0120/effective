package com.inflearn.effective.item02.hierarchicalbuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * @author bumblebee
 *
 * 코드 2-4 계층적으로 설계된 클래스와 잘 어울리는 빌더 패턴
 *
 * 참고 : 여기서 사용한 '시뮬레이트한 셀프 타입(simulated self-type)' 관용구는
 * 빌더뿐 아니라 임의의 유동적인 계층구조를 허용한다.
 *
 * 코드 2-1 점층적 생성자 패턴 : 확장하기 어렵다.
 *                          어떤 파라미터를 넣어줘야 하는지 유추하기가 어렵다(command + p 이용해서 intellij에서는 확인이 가능하다)
 * 코드 2-2 자비 빈즈 패턴 : 어디까지 세팅을 해야 이 객체가 완전한 건지 알기가 어렵다.
 *              불변 객체로 만들수가 없다.
 */
public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // 하위 클래스는 이 메서드를 재정의(overriding)하여
        // "this"를 반환하도록 해야 한다.
        protected abstract T self();

    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }

}

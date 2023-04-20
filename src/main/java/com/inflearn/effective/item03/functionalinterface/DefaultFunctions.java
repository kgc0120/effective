package com.inflearn.effective.item03.functionalinterface;

import com.inflearn.effective.item03.methodreference.Person;

import java.time.LocalDate;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author bumblebee
 */
public class DefaultFunctions {

    public static void main(String[] args) {
        Function<Integer, String> intToString = Object::toString; // Integer 파라미터로 받아서 String으로 리턴

        Supplier<Person> personSupplier = Person::new; // 받는건 없고 나오는 것만 있다.

        Function<LocalDate, Person> personFunction = Person::new; // 선언에 따라 각기 다른 생성자 참조 가능하다.

        Consumer<Integer> integerConsumer = System.out::println; // 받아서 출력만 하는 것

        Predicate<Person> predicate; // 인자를 하나 받아서 boolean을 리턴

    }

}

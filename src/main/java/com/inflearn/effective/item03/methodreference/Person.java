package com.inflearn.effective.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 메소드 참조
 * 메소드 하나만 호출하는 람다 표현식을 줄였는 방법
 *
 * 스태틱 메소드 레퍼런스
 * 인스턴스 메소드 레퍼런스
 * 임의 객체의 인스턴스 메소드 레퍼런스
 * 생성성 레퍼런스
 *
 * @author bumblebee
 */
public class Person {

    LocalDate birthday;

//     스태틱 메소드 레퍼런스
    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

//     인스턴스 메소드 레퍼런스
//    public int compareByAge(Person a, Person b) {
//        return a.birthday.compareTo(b.birthday);
//    }

//    임의 객체의 인스턴스 메소드 레퍼런스
//    public int compareByAge(Person b) {
//        return this.birthday.compareTo(b.birthday);
//    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2011, 3, 7)));
        people.add(new Person(LocalDate.of(2024, 4, 20)));

        people.sort(Person::compareByAge); // 스태틱 메소드 레퍼런스

//        Person person = new Person();
//        people.sort(person::compareByAge); // 인스턴스 메소드 레퍼런스

//        people.sort(Person::compareByAge); // 임의 객체의 인스턴스 메소드 레퍼런스

        List<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.of(1982, 7, 15));
        dates.add(LocalDate.of(2011, 3, 7));
        dates.add(LocalDate.of(2024, 4, 20));
        dates.stream().map(Person::new).collect(Collectors.toList()); // 새성자 레퍼런스 (Person::new)

    }

    public Person() {

    }
    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return LocalDate.now().getYear() - birthday.getYear();
    }
}

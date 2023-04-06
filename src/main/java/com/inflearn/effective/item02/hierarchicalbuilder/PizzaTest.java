package com.inflearn.effective.item02.hierarchicalbuilder;

import static com.inflearn.effective.item02.hierarchicalbuilder.NyPizza.Size.SMALL;
import static com.inflearn.effective.item02.hierarchicalbuilder.Pizza.Topping.*;
/**
 * @author bumblebee
 *
 * 계층적 빌더 사용
 */
public class PizzaTest {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();

        Pizza calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calzone);
    }

}

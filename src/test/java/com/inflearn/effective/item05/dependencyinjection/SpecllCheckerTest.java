package com.inflearn.effective.item05.dependencyinjection;

import com.inflearn.effective.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bumblebee
 */
class SpecllCheckerTest {

    @Test
    void isValid() {
        SpecllChecker specllChecker = new SpecllChecker(new DefaultDictionary());
        specllChecker.isValid("test");
    }

    @Test
    void test() {


        long start = 10000000;
        int end = 500_000;
        double test = 1_000_000.;

        double sum = start - end / test ;

        System.out.println(test);
    }


}
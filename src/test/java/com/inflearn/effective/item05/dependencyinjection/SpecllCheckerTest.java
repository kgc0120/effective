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


}
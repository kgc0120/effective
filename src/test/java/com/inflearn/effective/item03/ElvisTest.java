package com.inflearn.effective.item03;

import com.inflearn.effective.item03.field.Concert;
import com.inflearn.effective.item03.field.Elvis;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author bumblebee
 */
class ElvisTest {

    @Test
    void perform() {
        Concert concert = new Concert(new MockElvis());
        concert.perform();

        assertTrue(concert.isLightsOn());
        assertTrue(concert.isMainStateOpen());
    }

}
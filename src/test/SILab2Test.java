import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    @Test
    void functionTest1(List<Time> timesList){

    }

    @Test
    void functionTest2(List<Time> timesList) {
        timesList = ["-10:00:00"];
        assertEquals("The hours are smaller than the minimum", CFG.function(timesList));
        timesList = ["25:00:00"];
        assertEquals("The hours are grater than the maximum", CFG.function(timesList));
        assertEquals("The time is greater than the maximum", CFG.function(timesList));
        timesList = ["23:-10:00"];
        assertEquals("The minutes are not valid!", CFG.function(timesList));
        timesList = ["23:65:00"];
        assertEquals("The minutes are not valid!", CFG.function(timesList));
        timesList = ["23:00:-10"];
        assertEquals("The seconds are not valid", CFG.function(timesList));
        timesList = ["23:00:75"];
        assertEquals("The seconds are not valid", CFG.function(timesList));   
        timesList = ["00:00:00"];
        assertEquals(0, CFG.function(timesList));
        timesList = ["24:00:00"];
        assertEquals(14400, CFG.function(timesList));

    }
}
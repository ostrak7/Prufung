package com.example.prufung;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HammingControllerTests {

    @Test
    public void HammTest(){

        HammingController controller = new HammingController();

        int result = controller.hamming(1010);

        assertEquals(result, 2);
    }
}

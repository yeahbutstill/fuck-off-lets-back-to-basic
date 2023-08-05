package com.artivisi.example.iso8583.test;

import com.artivisi.example.iso8583.RunningNumberGenerator;
import org.junit.jupiter.api.Test;

public class RunningNumberGeneratorTest {

    @Test
    public void testGenerateStan() {
        RunningNumberGenerator gen = new RunningNumberGenerator();
        System.out.println("STAN : " + gen.generateStan());
    }

    @Test
    public void testGenerateRrn() {
        RunningNumberGenerator gen = new RunningNumberGenerator();
        System.out.println("RRN : " + gen.generateRrn());
    }

}

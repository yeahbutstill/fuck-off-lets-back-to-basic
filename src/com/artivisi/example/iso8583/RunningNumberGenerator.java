package com.artivisi.example.iso8583;

import java.util.Random;

public class RunningNumberGenerator {
    private final Random next = new Random();

    public String generateStan() {
        // TODO: ambil value dari database

        return String.format("%06d", this.next.nextInt(1, 999_999));
    }

    public String generateRrn() {
        // TODO: ambil value dari database

        return String.format("%012d", this.next.nextLong(1, 999_999_999_999L));
    }

}
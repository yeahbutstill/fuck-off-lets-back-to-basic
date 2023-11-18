package com.yeahbutstill.java21.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void repeat() {
        String tokai = new StringBuilder().repeat("💩", 9).toString();
        Assertions.assertEquals(
                "\uD83D\uDCA9\uD83D\uDCA9\uD83D\uDCA9\uD83D\uDCA9\uD83D"
                        + "\uDCA9\uD83D\uDCA9\uD83D\uDCA9\uD83D\uDCA9\uD83D\uDCA9",
                tokai);
        System.out.println(tokai);
    }

    @Test
    void emojis() {
        String shockedFaceEmoji = "\uD83E\uDD2F";
        String hotFaceEmoji = "🥵";
        int cpShockedFace = Character.codePointAt(shockedFaceEmoji.toCharArray(), 0);
        int cpHotFace = Character.codePointAt(hotFaceEmoji.toCharArray(), 0);

        Assertions.assertTrue(Character.isEmoji(cpShockedFace));
        Assertions.assertTrue(Character.isEmoji(cpHotFace));
        System.out.println(shockedFaceEmoji);
        System.out.println(hotFaceEmoji);
    }
}

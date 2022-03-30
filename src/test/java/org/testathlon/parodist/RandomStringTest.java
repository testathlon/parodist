package org.testathlon.parodist;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public final class RandomStringTest {

    @Test
    void generateRandomStringWithDefaultAlphabet() throws Exception {
        MatcherAssert.assertThat(
            new RandomString(2, 10).value(),
            Matchers.matchesRegex("^[AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz]{2,10}$")
        );
    }

    @Test
    void generateRandomString() throws Exception {
        final int length = 5;
        final String alphabet = "1234567890";
        MatcherAssert.assertThat(
            new RandomString(alphabet, length).value(),
            Matchers.matchesRegex("^[" + alphabet + "]{" + length + "}$")
        );
    }
}
package org.testathlon.parodist.data;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

public final class NameTest {

    @Test
    void generateDefaultName() throws Exception {
        MatcherAssert.assertThat(
            new Name.DefaultName().value(),
            Matchers.matchesRegex("^[AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz]{3,7}$")
        );
    }
}
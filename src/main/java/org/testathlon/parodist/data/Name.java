package org.testathlon.parodist.data;

import org.cactoos.Scalar;
import org.cactoos.scalar.Sticky;
import org.testathlon.parodist.RandomString;

public interface Name {

    String value() throws Exception;

    final class DefaultName implements Name {

        private final Scalar<String> value;

        public DefaultName() {
            this(new RandomString(3,7));
        }

        public DefaultName(Scalar<String> value) {
            this.value = new Sticky<>(value);
        }

        @Override
        public String value() throws Exception {
            return this.value.value();
        }
    }
}

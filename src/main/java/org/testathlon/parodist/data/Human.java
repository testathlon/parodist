package org.testathlon.parodist.data;

public interface Human {

    String sex();

    float height();

    float weight();

    String eye();

    String race();

    final class DefaultHuman implements Human {

        @Override
        public String sex() {
            return new RandomOf("Female", "Male");
        }

        @Override
        public float height() {
            return new RandomFloat();
        }

        @Override
        public float weight() {
            return 0;
        }

        @Override
        public String eye() {
            return null;
        }

        @Override
        public String race() {
            return null;
        }
    }
}

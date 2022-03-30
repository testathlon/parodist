package org.testathlon.parodist;

import org.cactoos.Scalar;

import java.security.SecureRandom;
import java.util.Random;

public final class RandomString implements Scalar<String> {

    private final String alphabet;

    private final int min;

    private final int max;

    private Random random = new SecureRandom();

    public RandomString(final int length) {
        this("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz", length);
    }

    public RandomString(final String alphabet, final int length) {
        this(alphabet, length, length);
    }

    public RandomString(final int min, final int max) {
        this("AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz", min, max);
    }

    public RandomString(String alphabet, int min, int max) {
        this.alphabet = alphabet;
        this.min = min;
        this.max = max;
    }

    @Override
    public String value() throws Exception {
        var array = this.alphabet.toCharArray();
        char[] result = new char[this.random.nextInt(this.max - this.min + 1) + this.min];
        for (int i =0; i < result.length; i++) {
            result[i] = array[this.random.nextInt(array.length)];
        }
        return new String(result);
    }
}

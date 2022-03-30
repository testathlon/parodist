package org.testathlon.parodist.data;

import java.util.Optional;

public interface Person extends Human {

    String name();

    String firstName();

    Optional<String> lastName();


}

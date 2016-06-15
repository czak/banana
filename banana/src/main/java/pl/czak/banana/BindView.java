package pl.czak.banana;

import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;

@Target(FIELD)
public @interface BindView {
    int value();
}

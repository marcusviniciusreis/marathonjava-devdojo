package academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;
@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}

package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("green", 2011),
            new Car("red", 1998),
            new Car("black", 2019));


    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByAgeBefore(cars, 2000));
    }

    private static List<Car> filterGreenCar(List<Car> cars){
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")){
                greenCars.add(car);
            }
        }
        return greenCars;
    }

    private static List<Car> filterRedCar(List<Car> cars){
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")){
                redCars.add(car);
            }
        }
        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color){
        List<Car> colorCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)){
                colorCars.add(car);
            }
        }
        return colorCars;
    }

    private static List<Car> filterCarByAgeBefore(List<Car> cars, int year){
        List<Car> oldCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year){
                oldCars.add(car);
            }
        }
        return oldCars;
    }

}

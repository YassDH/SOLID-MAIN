package com.directi.training.srp.exercise;

import java.util.List;

public class CarManager
{
    private final List<Car> _carsDb;

    public CarManager(List<Car> carsDb) {
        _carsDb = carsDb;
    }
    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}

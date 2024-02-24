package id.ac.ui.cs.advprog.eshop.service;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import id.ac.ui.cs.advprog.eshop.model.Car;
import id.ac.ui.cs.advprog.eshop.repository.CarRepository;

@Service
public class CarServiceImpl implements CarService {
  @Autowired
  private CarRepository carRepository;

  @Override
  public Car create(Car car) {
    carRepository.create(car);
    return car;
  }

  @Override
  public List<Car> findAll() {
    Iterator<Car> carIterator = carRepository.findAll();
    List<Car> allCar = new ArrayList<>();
    carIterator.forEachRemaining(allCar::add);
    return allCar;
  }

  @Override
  public Car findById(String carId) {
    Car car = carRepository.findById(carId);
    return car;
  }

  @Override
  public Car update(Car car) {
    return carRepository.update(car);
  }

  @Override
  public Car delete(String carId) {
    return carRepository.delete(carId);
  }
}

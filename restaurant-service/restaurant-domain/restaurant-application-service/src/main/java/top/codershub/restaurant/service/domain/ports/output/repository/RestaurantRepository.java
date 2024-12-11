package top.codershub.restaurant.service.domain.ports.output.repository;

import org.springframework.stereotype.Repository;
import top.codershub.restaurant.service.domain.entity.Restaurant;

import java.util.Optional;

@Repository
public interface RestaurantRepository {
    Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}

package com.restaurant.order.restaurantlisting.mapper;

import com.restaurant.order.restaurantlisting.dto.RestaurantDTO;
import com.restaurant.order.restaurantlisting.entity.Restaurant;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-11T16:59:52-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 18 (Oracle Corporation)"
)
public class RestaurantMapperImpl implements RestaurantMapper {

    @Override
    public Restaurant mapRestaurantDTOToRestaurant(RestaurantDTO restaurantDTO) {
        if ( restaurantDTO == null ) {
            return null;
        }

        Restaurant restaurant = new Restaurant();

        restaurant.setId( restaurantDTO.getId() );
        restaurant.setName( restaurantDTO.getName() );
        restaurant.setAddress( restaurantDTO.getAddress() );
        restaurant.setCity( restaurantDTO.getCity() );
        restaurant.setRestaurantDescription( restaurantDTO.getRestaurantDescription() );

        return restaurant;
    }

    @Override
    public RestaurantDTO mapRestaurantToRestaurantDTO(Restaurant restaurant) {
        if ( restaurant == null ) {
            return null;
        }

        RestaurantDTO restaurantDTO = new RestaurantDTO();

        restaurantDTO.setId( restaurant.getId() );
        restaurantDTO.setName( restaurant.getName() );
        restaurantDTO.setAddress( restaurant.getAddress() );
        restaurantDTO.setCity( restaurant.getCity() );
        restaurantDTO.setRestaurantDescription( restaurant.getRestaurantDescription() );

        return restaurantDTO;
    }
}

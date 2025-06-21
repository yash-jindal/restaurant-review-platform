package com.yash.restaurant.services.impl;

import com.yash.restaurant.domain.GeoLocation;
import com.yash.restaurant.domain.entities.Address;
import com.yash.restaurant.services.GeoLocationService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomGeoLocationService implements GeoLocationService {

    private static final float MIN_LATITUDE = 6.75f;
    private static final float MAX_LATITUDE = 37.10f;
    private static final float MIN_LONGITUDE = 68.12f;
    private static final float MAX_LONGITUDE = 97.42f;

    @Override
    public GeoLocation geoLocate(Address address) {
        Random random = new Random();
        double latitude = MIN_LATITUDE + random.nextDouble() * (MAX_LATITUDE - MIN_LATITUDE);
        double longitude = MIN_LONGITUDE + random.nextDouble() * (MAX_LONGITUDE - MIN_LONGITUDE);

        return GeoLocation.builder()
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }
}

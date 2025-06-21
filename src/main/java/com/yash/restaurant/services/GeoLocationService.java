package com.yash.restaurant.services;

import com.yash.restaurant.domain.GeoLocation;
import com.yash.restaurant.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}

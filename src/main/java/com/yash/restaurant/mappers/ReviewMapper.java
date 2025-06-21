package com.yash.restaurant.mappers;

import com.yash.restaurant.domain.ReviewCreateUpdateRequest;
import com.yash.restaurant.domain.dtos.ReviewCreateUpdateRequestDto;
import com.yash.restaurant.domain.dtos.ReviewDto;
import com.yash.restaurant.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {
    ReviewCreateUpdateRequest toReviewCreateUpdateRequest(ReviewCreateUpdateRequestDto dto);

    ReviewDto toDto(Review review);
}

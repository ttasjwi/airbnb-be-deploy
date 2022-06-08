package codesquad.airbnb.accommodation.web.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import static codesquad.airbnb.accommodation.util.RandomValueGenerator.*;

@Getter
public class AccommodationListElement {

    private static final AtomicLong SAMPLE_SEQUENCE = new AtomicLong();

    private Long accommodationId;
    private String accommodationName;
    private String description;
    private Integer limitGuestCount;
    private Integer pricePerDate;
    private String locationName;
    private Double latitude;
    private Double longitude;
    private Integer roomCount;
    private Integer bedCount;
    private Integer bathRoomCount;
    private boolean hasKitchen;
    private boolean hasWifi;
    private boolean hasAirConditioner;
    private boolean hasHairDrier;
    private String mainImageUrl;
    private int reviewCount;
    private double gradeAverage;

    @Builder
    public AccommodationListElement(Long accommodationId, String accommodationName, String description, Integer limitGuestCount, Integer pricePerDate, String locationName, Double latitude, Double longitude, Integer roomCount, Integer bedCount, Integer bathRoomCount, boolean hasKitchen, boolean hasWifi, boolean hasAirConditioner, boolean hasHairDrier, String mainImageUrl, int reviewCount, double gradeAverage) {
        this.accommodationId = accommodationId;
        this.accommodationName = accommodationName;
        this.description = description;
        this.limitGuestCount = limitGuestCount;
        this.pricePerDate = pricePerDate;
        this.locationName = locationName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.roomCount = roomCount;
        this.bedCount = bedCount;
        this.bathRoomCount = bathRoomCount;
        this.hasKitchen = hasKitchen;
        this.hasWifi = hasWifi;
        this.hasAirConditioner = hasAirConditioner;
        this.hasHairDrier = hasHairDrier;
        this.mainImageUrl = mainImageUrl;
        this.reviewCount = reviewCount;
        this.gradeAverage = gradeAverage;
    }

    public static AccommodationListElement sampleCreate() {
        Long sampleId = SAMPLE_SEQUENCE.incrementAndGet();
        Random random = new Random();

        return AccommodationListElement.builder()
                .accommodationId(sampleId)
                .accommodationName("accommodation"+sampleId)
                .description("우아하고 아름다운 accommodation"+sampleId)
                .limitGuestCount(createRandomInt(random, 1, 5))
                .pricePerDate(createRandomInt(random,10000, 1000000))
                .locationName("서울특별시 강남구 도곡동 accommodation"+sampleId)
                .latitude(createRandomDouble(random, 37.413294, 37.715133))
                .longitude(createRandomDouble(random, 126.734086, 127.269311))
                .roomCount(createRandomInt(random, 1, 4))
                .bedCount(createRandomInt(random,1,4))
                .bathRoomCount(createRandomInt(random, 1,3))
                .hasKitchen(crateRandomBoolean(random))
                .hasWifi(crateRandomBoolean(random))
                .hasAirConditioner(crateRandomBoolean(random))
                .mainImageUrl("https://picsum.photos/300/300")
                .reviewCount(createRandomInt(random, 0,1000))
                .gradeAverage(createRandomDouble(random,0, 5))
                .build();
    }

}

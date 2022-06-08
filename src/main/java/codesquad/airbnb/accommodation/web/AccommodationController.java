package codesquad.airbnb.accommodation.web;

import codesquad.airbnb.accommodation.web.dto.AccommodationListResponse;
import codesquad.airbnb.accommodation.web.dto.AccommodationPricesResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {

    //TODO: 숙소들
    @GetMapping("/prices")
    public AccommodationPricesResponse getPriceList() {
        return AccommodationPricesResponse.sampleApi();
    }

    @GetMapping
    public AccommodationListResponse getAccommodationList() {
        return AccommodationListResponse.sampleApi(1000);
    }
}

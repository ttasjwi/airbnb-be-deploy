package codesquad.airbnb.accommodation.web;

import codesquad.airbnb.accommodation.web.dto.AccommodationPricesResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accommodations")
public class AccommodationController {

    //TODO: 가격분포 + 숙소 가격 평균
    @GetMapping("/prices")
    public AccommodationPricesResponse priceStatistic() {
        return AccommodationPricesResponse.sampleApi();
    }

}

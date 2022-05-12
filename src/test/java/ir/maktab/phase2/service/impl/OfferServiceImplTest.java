package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.service.OfferService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest

class OfferServiceImplTest {


    @Autowired
    private OfferService offerService;
    @Test
    void save(){
      /*  Offer offer = new Offer();
        offer.setSuggestPrice(25.6);
        offer.setDuration("gggg");
      //  offerService.save(offer);
        Offer offer1 = offerService.find("gggg");
      //  assertEquals(1,offer.getId());
        System.out.println(offer1);
        assertEquals("gggg",offer1.getDuration());*/
    }

    @Test
    void showList(){

     List<Offer> offersSortByTechnician = offerService.findOfferSortByTechnician(1);
     List<Offer> offersSortByPrice = offerService.findOfferSortByPrice(1);
     offersSortByPrice.forEach(System.out::println);
        System.out.println();
     offersSortByTechnician.forEach(System.out::println);
    assertEquals(3,offersSortByTechnician.size());
    assertEquals(3,offersSortByPrice.size());

    }

}
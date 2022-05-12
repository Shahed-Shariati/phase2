package ir.maktab.phase2.service;

import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.service.base.BaseService;

import java.util.List;

public interface OfferService extends BaseService<Offer,Integer>{

    List<Offer> findOfferSortByTechnician(Integer id);
    List<Offer> findOfferSortByPrice(Integer id);

}

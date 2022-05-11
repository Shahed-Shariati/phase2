package ir.maktab.phase2.service;

import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.service.base.BaseService;

public interface OfferService extends BaseService<Offer,Integer>{

    Offer find(String duration);
}

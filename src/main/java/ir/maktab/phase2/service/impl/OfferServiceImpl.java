package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.repository.base.OfferRepository;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl extends BaseServiceImpl<OfferRepository, Offer,Integer> {


private OfferRepository offerRepository;


    public OfferServiceImpl(OfferRepository repository) {
        super(repository);
        this.offerRepository = repository;
    }
}

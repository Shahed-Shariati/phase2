package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.repository.base.OfferRepository;
import ir.maktab.phase2.service.OfferService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OfferServiceImpl extends BaseServiceImpl<OfferRepository, Offer,Integer> implements OfferService {


private OfferRepository offerRepository;


    public OfferServiceImpl(OfferRepository repository) {
        super(repository);
        this.offerRepository = repository;
    }



    @Override
    public List<Offer> findOfferSortByTechnician(Integer id) {
       return repository.findOfferByOrder_Id(id,Sort.by(Sort.Direction.DESC,"technician"));
     //   return repository.findOfferByOrder_Id(id,Sort.by("technician").descending().and(Sort.by("suggestPrice")));
    }

    @Override
    public List<Offer> findOfferSortByPrice(Integer id) {
        return offerRepository.findOfferByOrder_Id(id,Sort.by(Sort.Direction.ASC,"suggestPrice"));
    }

}

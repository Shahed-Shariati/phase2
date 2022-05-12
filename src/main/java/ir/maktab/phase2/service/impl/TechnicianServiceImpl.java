package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.exception.SuggestPriceUnderBasePrice;
import ir.maktab.phase2.model.Offer;
import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.model.Technician;
import ir.maktab.phase2.model.enumeration.OrderStatus;
import ir.maktab.phase2.repository.base.TechnicianRepository;
import ir.maktab.phase2.service.OfferService;
import ir.maktab.phase2.service.OrderService;
import ir.maktab.phase2.service.TechnicianService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TechnicianServiceImpl extends BaseServiceImpl<TechnicianRepository, Technician,Integer> implements TechnicianService {

    private TechnicianRepository technicianRepository;
    private OrderService orderService;
    private OfferService offerService;

    public TechnicianServiceImpl(TechnicianRepository repository, OrderService orderService,OfferService offerService) {
        super(repository);
        this.technicianRepository = repository;
        this.orderService = orderService;
        this.offerService = offerService;
    }

    @Override
    public Technician findById(Integer id) {

        return technicianRepository.findById(id).get();
    }


    @Override
    public List<Order> showOrderByTechnicianSubSpecialist(List<SubSpecialist> subSpecialists) {
        return orderService.findBySubSpecialistIn(subSpecialists);
    }

    @Override
    @Transactional
    public void submitOffer(Offer offer) {
      double basePriceSubSpecialist = offer.getOrder().getSubSpecialist().getBasePrice();
      double suggestPrice = offer.getSuggestPrice();
      if(suggestPrice < basePriceSubSpecialist)
          throw new SuggestPriceUnderBasePrice();
      offerService.save(offer);
      orderService.upDateOrderStatus(OrderStatus.waitingExpertSelection,offer.getOrder().getId());
    }
}

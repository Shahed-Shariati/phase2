package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.model.Technician;
import ir.maktab.phase2.repository.base.TechnicianRepository;
import ir.maktab.phase2.service.OrderService;
import ir.maktab.phase2.service.TechnicianService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnicianServiceImpl extends BaseServiceImpl<TechnicianRepository, Technician,Integer> implements TechnicianService {

    private TechnicianRepository technicianRepository;
    private OrderService orderService;

    public TechnicianServiceImpl(TechnicianRepository repository, OrderService orderService) {
        super(repository);
        this.technicianRepository = repository;
        this.orderService = orderService;
    }

    @Override
    public Technician findById(Integer id) {

        return technicianRepository.findById(id).get();
    }


    @Override
    public List<Order> showOrderByTechnicianSubSpecialist(List<SubSpecialist> subSpecialists) {
        return orderService.findBySubSpecialistIn(subSpecialists);
    }
}

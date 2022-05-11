package ir.maktab.phase2.service;

import ir.maktab.phase2.model.Order;
import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.model.Technician;
import ir.maktab.phase2.repository.base.TechnicianRepository;
import ir.maktab.phase2.service.base.BaseService;
import ir.maktab.phase2.service.base.BaseServiceImpl;

import java.util.List;

public interface TechnicianService extends BaseService<Technician,Integer> {
    List<Order> showOrderByTechnicianSubSpecialist(List<SubSpecialist> subSpecialists);
}

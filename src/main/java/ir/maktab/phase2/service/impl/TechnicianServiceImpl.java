package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Technician;
import ir.maktab.phase2.repository.base.TechnicianRepository;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class TechnicianServiceImpl extends BaseServiceImpl<TechnicianRepository, Technician,Integer> {
    public TechnicianServiceImpl(TechnicianRepository repository) {
        super(repository);
    }
}

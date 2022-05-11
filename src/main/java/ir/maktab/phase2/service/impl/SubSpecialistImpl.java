package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.repository.base.SubSpecialistRepository;
import ir.maktab.phase2.service.SubSpecialistService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SubSpecialistImpl extends BaseServiceImpl<SubSpecialistRepository, SubSpecialist,Integer> implements SubSpecialistService {

    public SubSpecialistImpl(SubSpecialistRepository repository) {
        super(repository);
    }
}

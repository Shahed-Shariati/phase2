package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Specialist;
import ir.maktab.phase2.repository.base.SpecialistRepository;
import ir.maktab.phase2.service.SpecialistService;
import ir.maktab.phase2.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class SpecialistServiceImpl extends BaseServiceImpl<SpecialistRepository, Specialist,Integer>  implements SpecialistService {
    public SpecialistServiceImpl(SpecialistRepository repository) {
        super(repository);
    }
}

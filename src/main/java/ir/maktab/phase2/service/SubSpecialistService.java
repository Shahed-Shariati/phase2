package ir.maktab.phase2.service;

import ir.maktab.phase2.model.SubSpecialist;
import ir.maktab.phase2.service.base.BaseService;

import java.util.List;

public interface SubSpecialistService extends BaseService<SubSpecialist,Integer> {
    List<SubSpecialist> showSubSpecial(Integer parentId);
}

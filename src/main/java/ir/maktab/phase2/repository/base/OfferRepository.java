package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Offer;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfferRepository extends JpaRepository<Offer,Integer> {

      List<Offer> findOfferByOrder_Id(Integer order_id,Sort sort);
   }

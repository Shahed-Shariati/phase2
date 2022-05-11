package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet,Integer> {
}

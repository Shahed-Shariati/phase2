package ir.maktab.phase2.service.impl;

import ir.maktab.phase2.model.Wallet;
import ir.maktab.phase2.repository.base.WalletRepository;
import ir.maktab.phase2.service.base.BaseServiceImpl;

public class WalletServiceImpl extends BaseServiceImpl<WalletRepository, Wallet,Integer> {
    public WalletServiceImpl(WalletRepository repository) {
        super(repository);
    }
}

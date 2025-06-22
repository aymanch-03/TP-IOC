package net.ayman.metier;

import net.ayman.doa.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double result = t * 43 /3;
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

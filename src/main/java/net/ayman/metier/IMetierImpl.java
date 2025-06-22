package net.ayman.metier;

import net.ayman.doa.IDao;

public class IMetierImpl implements IMetier {
    private IDao dao;

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    public IMetierImpl() {
    }

    @Override
    public double calcul() {
        double t = dao.getData();
        double result = t * 12 * Math.PI/2 * Math.cos(t);
        return result;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

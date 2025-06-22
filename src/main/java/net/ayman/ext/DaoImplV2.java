package net.ayman.ext;

import net.ayman.doa.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs...");
        double t = 12;
        return t;
    }
}

package net.ayman.dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version BD");
        double t = 22;
        return t;
    }
}

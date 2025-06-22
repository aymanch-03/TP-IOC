package net.ayman.doa;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("Version BD");
        double t = 34;
        return t;
    }
}

package net.ayman.presentation;

import net.ayman.dao.IDao;
import net.ayman.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
//        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();
//        Method setDao = cMetier.getMethod("setDao", IDao.class);
//        setDao.invoke(metier, dao);

        System.out.println("RES="+metier.calcul());
    }
}

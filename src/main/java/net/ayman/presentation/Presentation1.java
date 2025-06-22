package net.ayman.presentation;

import net.ayman.doa.DaoImpl;
import net.ayman.metier.MetierImpl;

public class Presentation1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println("RES= "+ metier.calcul());
    }
}

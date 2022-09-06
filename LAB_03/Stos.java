package com.company;

import java.util.Arrays;

public class Stos {

    private int[] tabRepStos;
    private int wskaznikStosu;



    public int getWskaznikStosu() {
        return wskaznikStosu;
    }

    public void setWskaznikStosu(int wskaznikStosu) {
        this.wskaznikStosu = wskaznikStosu;
    }

    public int[] getTabRepStos() {
        return tabRepStos;
    }

    public void setTabRepStos(int[] tabRepStos) {
        this.tabRepStos = tabRepStos;

    }

    public String toString() {
        return "Stos{" +
                "tabRepStos=" + Arrays.toString(tabRepStos) +
                ", wskaznikStosu=" + wskaznikStosu +
                '}';
    }
}


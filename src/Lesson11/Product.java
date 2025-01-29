package Lesson11;

public class Product {
    private String name;
    private int zhiri;
    private int belki;
    private int uglevodi;
    private int callories;

    public Product(String name, int zhiri, int belki, int uglevodi, int callories) {
        this.name = name;
        this.zhiri = zhiri;
        this.belki = belki;
        this.uglevodi = uglevodi;
        this.callories = callories;
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(int belki) {
        this.belki = belki;
    }

    public Product(String name, int zhiri, int belki, int uglevodi) {
        this.name = name;
        this.zhiri = zhiri;
        this.belki = belki;
        this.uglevodi = uglevodi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZhiri() {
        return zhiri;
    }

    public void setZhiri(int zhiri) {
        this.zhiri = zhiri;
    }

    public int getBelki() {
        return belki;
    }

    public void setBelki(int belki) {
        this.belki = belki;
    }

    public int getUglevodi() {
        return uglevodi;
    }

    public void setUglevodi(int uglevodi) {
        this.uglevodi = uglevodi;
    }

    public int getCallories() {
        return callories;
    }

    public void setCallories(int callories) {
        this.callories = callories;
    }


}

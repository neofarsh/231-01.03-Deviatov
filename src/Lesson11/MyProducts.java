package Lesson11;

public class MyProducts {
    private int maxZhiri;
    private int maxBelki;
    private int maxUglovode;
    private int maxCallories;
    private int productcounter = 10;
    private Product[] spisok = new Product[productcounter];

    public MyProducts(int productcounter, Product[] spisok) {
        this.productcounter = productcounter;
        this.spisok = spisok;

        for(int i=0; i<productcounter; ++i){
            this.maxZhiri += spisok[i].getZhiri();
            this.maxBelki += spisok[i].getBelki();
            this.maxUglovode += spisok[i].getUglevodi();
            this.maxCallories += spisok[i].getCallories();
        }
    }

    public int getMaxZhiri() {
        return maxZhiri;
    }

    public void setMaxZhiri(int maxZhiri) {
        this.maxZhiri = maxZhiri;
    }

    public int getMaxBelki() {
        return maxBelki;
    }

    public void setMaxBelki(int maxBelki) {
        this.maxBelki = maxBelki;
    }

    public int getMaxUglovode() {
        return maxUglovode;
    }

    public void setMaxUglovode(int maxUglovode) {
        this.maxUglovode = maxUglovode;
    }

    public int getMaxCallories() {
        return maxCallories;
    }

    public void setMaxCallories(int maxCallories) {
        this.maxCallories = maxCallories;
    }

    public int getProductcounter() {
        return productcounter;
    }

    public void setProductcounter(int productcounter) {
        this.productcounter = productcounter;
    }

    public Product[] getSpisok() {
        return spisok;
    }

    public void setSpisok(Product[] spisok) {
        this.spisok = spisok;
    }


}

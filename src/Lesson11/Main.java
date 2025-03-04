package Lesson11;

public class Main {
    public static void main(String[] args) {
        Product shava = new Product("шаверма",52,150,96,355);
        Product borsh = new Product("борщик",67,42,453,4723);
        Product tortik = new Product("Тортик",8349,38,99,854);
        Product salatik = new Product("Оливьешка",74,83,42,914);
        Product pivo = new Product("пиво",843,93,99,672);
        Product milkshake = new Product("Коктейльчик",83,42,52,43);
        Product[] arr1 = {borsh, tortik, salatik, pivo};
        MyProducts karzinaOdin = new MyProducts(4, arr1);

        System.out.println(karzinaOdin.getMaxBelki()+" всего белков в первой корзине");
        System.out.println(karzinaOdin.getMaxZhiri()+" всего жиров в первой корзине");
        System.out.println(karzinaOdin.getMaxUglovode()+" всего углеводов в первой корзине");
        System.out.println(karzinaOdin.getMaxCallories()+" всего каллорий в первой корзине");



    }


}

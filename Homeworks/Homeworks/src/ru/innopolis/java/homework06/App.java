package ru.innopolis.java.homework06;
import java.util.ArrayList;
import java.util.List;
public class App {
    public static void main(String[] args) {
        Person person1 = new Person("Павел Андреевич", 10000);
        Person person2 = new Person("Aнна Петровна", 2000);
        Person person3 = new Person("Борис", 10);
        Person person4 = new Person("Женя", 0);
        Person person5 = new Person("Света", -3);
        Product product1 = new Product("Хлеб", 40);
        Product product2 = new Product("Молоко", 60);
        Product product3 = new Product("Торт", 1000);
        Product product4 = new Product("Кофе растворимый", 879);
        Product product5 = new Product("Масло", 150);
        Product product6 = new Product("Мороженое", 200);
        Product product7 = new Product("Макароны", 800);

        List<Product> forPerson1 = new ArrayList<>();
        double balance1 = person1.getCash();
        if (balance1 < 0) { System.out.println("Деньги немогут быть отрицательным числом");}
        if (balance1 < product1.getCost()) { System.out.println(person1.getName() +
                " не   может   позволить   себе " + product1.getName());}
        else forPerson1.add(product1);
        balance1 = balance1 - product1.getCost();
        if (balance1 < product3.getCost()) { System.out.println(person1.getName() +
                " не   может   позволить   себе " + product3.getName());}
        else forPerson1.add(product3);
        balance1 = balance1 - product3.getCost();
        if (balance1 < product5.getCost()) { System.out.println(person1.getName() +
                " не   может   позволить   себе " + product5.getName());}
        else forPerson1.add(product5);
        if (forPerson1.isEmpty()) { System.out.println(person1.getName() + " ни чего не купил");}
        else  System.out.println(person1.getName() + " купил " + forPerson1);
////////////////////////////////////////////////////////////////////////////////
        List<Product> forPerson2 = new ArrayList<>();
        double balance2 = person2.getCash();
        if (balance2 < 0) { System.out.println("Деньги немогут быть отрицательным числом");}
        if (balance2 < product4.getCost()) { System.out.println(person2.getName() +
                " не   может   позволить   себе " + product4.getName());}
        else forPerson2.add(product4) ;
        balance2 = balance2 - product4.getCost();
        if (balance2 < product2.getCost()) { System.out.println(person2.getName() +
                " не   может   позволить   себе " + product2.getName());}
        else forPerson2.add(product2);
        balance2 = balance2 - product2.getCost();
        if (balance2 < product2.getCost()) { System.out.println(person2.getName() +
                " не   может   позволить   себе " + product2.getName());}
        else forPerson2.add(product2);
        balance2 = balance2 - product2.getCost();
        if (balance2 < product2.getCost()) { System.out.println(person2.getName() +
                " не   может   позволить   себе " + product2.getName());}
        else forPerson2.add(product2);
        balance2 = balance2 - product2.getCost();
        if (balance2 < product3.getCost()) { System.out.println(person2.getName() +
                " не   может   позволить   себе " + product3.getName());}
        else forPerson2.add(product3);
        if (forPerson2.isEmpty()) { System.out.println(person2.getName() + " ни чего не купил");}
        else  System.out.println(person2.getName() + " купил " + forPerson2);
////////////////////////////////////////////////////////////////////////////////////
        List<Product> forPerson3 = new ArrayList<>();
        double balance3 = person3.getCash();
        if (balance3 < 0) { System.out.println("Деньги немогут быть отрицательным числом");}
        if (balance3 < product3.getCost()) { System.out.println(person3.getName() +
                " не   может   позволить   себе " + product3.getName());}
        else forPerson3.add(product3);
        if (forPerson3.isEmpty()) { System.out.println(person3.getName() + " ни чего не купил");}
        else  System.out.println(person3.getName() + " купил " + forPerson3);
/////////////////////////////////////////////////////////////////////////////////////////////////
        List<Product> forPerson4 = new ArrayList<>();
        double balance4 = person4.getCash();
        if (balance4 < 0) { System.out.println("Деньги немогут быть отрицательным числом");}
        if (balance4 < product6.getCost()) { System.out.println(person4.getName() +
                " не   может   позволить   себе " + product6.getName());}
        else forPerson4.add(product6);
        if (forPerson4.isEmpty()) { System.out.println(person4.getName() + " ни чего не купил");}
        else  System.out.println(person4.getName() + " купил " + forPerson4);
/////////////////////////////////////////////////////////////////////////////////////////////////
        List<Product> forPerson5 = new ArrayList<>();
        double balance5 = person5.getCash();
        if (balance5 < 0) { System.out.println("Деньги немогут быть отрицательным числом");}
        if (balance5 < product7.getCost()) { System.out.println(person5.getName() +
                " не   может   позволить   себе " + product7.getName());}
        else forPerson5.add(product7);
        if (forPerson5.isEmpty()) { System.out.println(person5.getName() + " ни чего не купил");}
        else  System.out.println(person5.getName() + " купил " + forPerson5);
    }
}

package java_group6_lab1_Nazarov_varA9;

// Класс Eggs, наследуемый от базового класса Food
public class Eggs extends Food {
    // Новое внутреннее поле данных - КОЛИЧЕСТВО
    private int quantity;

    // Конструктор класса Eggs, принимающий количество яиц в качестве параметра
    public Eggs(int quantity) {
        // Вызвать конструктор предка, передав ему имя класса
        super("Яиц");
        // Инициализировать количество яиц
        this.quantity = quantity;
    }

    // Переопределение метода consume для яиц
    public void consume() {
        System.out.println(this + " съедено");
    }

    // Селектор для доступа к полю данных КОЛИЧЕСТВО
    public int getQuantity() {
        return quantity;
    }

    // Модификатор для изменения поля данных КОЛИЧЕСТВО
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Переопределение метода toString, возвращающее название продукта и информацию о съедаемости
    public String toString() {
        return super.toString() + ": " + quantity + " штук";
    }

    // Переопределение метода equals, учитывающее количество яиц
//    public boolean equals(Object arg0) {
//        if (super.equals(arg0)) {
//            if (!(arg0 instanceof Eggs)) return false;
//            return quantity == ((Eggs) arg0).quantity;
//        } else
//            return false;
//    }
}
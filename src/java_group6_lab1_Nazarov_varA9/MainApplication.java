package java_group6_lab1_Nazarov_varA9;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[20];
        int itemsSoFar = 0;

        for (String arg : args) {
            if (arg.startsWith("-count/")) {
                // Обработка запроса на подсчет продукта
                String[] countParts = arg.split("/");
                if (countParts.length == 2) {
                    String productType = countParts[1];
                    int count = countItemsOfType(breakfast, productType);
                    System.out.println("Количество " + productType + ": " + count);
                }
            } else {
                // Обработка добавления продукта в завтрак
                String[] parts = arg.split("/");
                if (parts[0].equals("Cheese")) {
                    breakfast[itemsSoFar] = new Cheese();
                } else if (parts[0].equals("Apple")) {
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                } else if (parts[0].equals("Eggs")) {
                    breakfast[itemsSoFar] = new Eggs(Integer.parseInt(parts[1]));
                }
                itemsSoFar++;
            }
        }

        // Употребление продуктов
        for (Food item : breakfast) {
            if (item != null)
                item.consume();
            else
                break;
        }

        System.out.println("Всего хорошего!");
    }

    private static <T> int countItemsOfType(T[] items, String type) {
        int count = 0;
        Food itemToCount;
        switch (type){
            case "Apple": itemToCount= new Apple("small");
            break;
            case "Cheese": itemToCount= new Cheese();
            break;
            case "Eggs":itemToCount=new Eggs(3);
            break;
            default: itemToCount=new Eggs(3);
        }

        for (T item : items) {
            if (item != null && item.equals(itemToCount)) {
                count++;
            }
        }
        return count;
    }
}
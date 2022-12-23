
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] prices = new int[] {100, 200, 300};
        String[] products = new String[]{"Хлеб", "Яблоки", "Молоко"};
        System.out.println(Arrays.toString(products));
        System.out.println(Arrays.toString(prices));
        int currentPrice = 0;
        int[] basket = new int[3];
        while(true) {
            System.out.print("Введите номер продукта: ");
            String userProduct = scanner.nextLine();
            if("end".equals(userProduct)){
                break;
            }
            System.out.print("Введите количество: ");
            int amount = scanner.nextInt();
            int userNumberProduct = Integer.parseInt(userProduct);
            currentPrice = currentPrice + (prices[userNumberProduct - 1] * amount);
            scanner.nextLine();
            basket[userNumberProduct - 1] = basket[userNumberProduct - 1] + amount;
        }
        for (int i = 0; i < 3; i++){
            System.out.println("продукт " + products[i]);
            System.out.println("количество " + basket[i]);
            int priceOfproduct = basket[i] * prices[i];
            System.out.println("стоимость " + priceOfproduct);
        }
        System.out.println("общая цена " + currentPrice);
        scanner.close();
    }
}
0








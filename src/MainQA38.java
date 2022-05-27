public class MainQA38 {

    public static void main(String[] args) {

        int startingAccount = 1000; // начальный счет клиента
        int payAccount = 999; // сумма пополнения счета
        int numberOfBonus = 100; // стоимость одного бонуса

        System.out.println("Начальный счет клиента: " + startingAccount + " рублей");
        System.out.println("Сумма пополнения счета: " + payAccount + " рублей");

        if (payAccount >= 1000) {
            int countBonus = payAccount / numberOfBonus; // количество бонусов за пополнение счета от 1000 рублей
            int finalAccount = startingAccount + payAccount + countBonus;
            System.out.println("Итоговая сумма на счету клиента: " + finalAccount + " с учетом " + countBonus + " бонусов");
        } else {
            int finalAccount = startingAccount + payAccount;
            System.out.println("Итоговая сумма на счету клиента: " + finalAccount + " без учета бонусов");
        }

    }

}

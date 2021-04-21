public class Application {

    public static void main(String[] args) {

        String facultyNumber    = "1101261005";
        String firstName        = "Mihail";
        String lastName         = "Petrov";

        // 1. извеждане чрез допълнителна променлива
        String studentSignature         = facultyNumber + " " + firstName + " " + lastName;
        System.out.println(studentSignature);

        // 2. извеждане чрез използване на идентификатори
        System.out.println(facultyNumber + " " + firstName + " " + lastName);

        // # Описание на предметите в склада
        // променлива - идентификатор съдържащ експлицитна информация че това е бройка
        // int metalSwordCount = 15;
        // int metalSwordsCount = 15;
        // int countOfMetalSword = 15
        // int countOfMetalSwords = 15
        int metalSwordCount = 15;
        int aluminiumArmorCount = 10;
        int gasPistolCount = 1;
        int woodenTankCount = 1;
        int plasticBarrelCount = 1;
        double letherSakMoneyAmount = 169.77;

        // # Описание на уникалните идентификатори на артикулите
        String metalSwordId = "s6";
        String aluminiumArmorId = "a5";
        String gasPistolId = "p8";
        String woodenTankId = "t4";
        String plasticBarrelId = "b5";
        String letherSakMoneyAmountId = "s3";

        // # Създаване на списъци съдържащи, свойства и предмети

        // за елементи, които са предварително известни
        String[] itemPropertyCollection = {
                "метални", "алуминиеви", "газов", "дървен", "пластмасов", "кожен"
        };

        // алтернативен синтаксис
        // за елементи чиите стойности не знаем в аванс
//        String[] itemPropertyCollection = new String[6];
//        itemPropertyCollection[0] = "метален";
//        itemPropertyCollection[1] = "алуминиеви";
//        itemPropertyCollection[2] = "газов";
//        itemPropertyCollection[3] = "дървен";
//        itemPropertyCollection[4] = "пластмасов";
//        itemPropertyCollection[5] = "кожен";

        String[] itemIdentificatorCollection = {
          "мечове", "брони", "пистолет", "танк", "бидон", "сак"
        };

//        String[] itemIdentificatorCollection = new String[6];
//        itemIdentificatorCollection[0] = "мечове";
//        itemIdentificatorCollection[1] = "брони";
//        itemIdentificatorCollection[2] = "пистолет";
//        itemIdentificatorCollection[3] = "танк";
//        itemIdentificatorCollection[4] = "бидон";
//        itemIdentificatorCollection[5] = "сак";

        System.out.println(itemPropertyCollection[0] + " " +itemIdentificatorCollection[0]);
        System.out.println(itemPropertyCollection[1] + " " +itemIdentificatorCollection[1]);
        System.out.println(itemPropertyCollection[2] + " " +itemIdentificatorCollection[2]);
        System.out.println(itemPropertyCollection[3] + " " +itemIdentificatorCollection[3]);
        System.out.println(itemPropertyCollection[4] + " " +itemIdentificatorCollection[4]);
        System.out.println(itemPropertyCollection[5] + " " +itemIdentificatorCollection[5]);

        // # идентификатор - булев съдържащ желание за завършване
        // * has / is / should / can / do
        boolean doYouWantToCompleatTheAcademy = true;

    }
}

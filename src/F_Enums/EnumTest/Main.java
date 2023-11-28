package F_Enums.EnumTest;

import F_Enums.DocumentType;

public class Main {

    public static void main(String[] args) {

//        WeekDay weekDay = WeekDay.SUNDAY;
//        System.out.println(weekDay.toString() + " - " + weekDay.getValue());

//        WeekDay[] weekDays = WeekDay.values();  //value - valueOf
//        for (WeekDay weekDay : WeekDay.values()) {
//            System.out.println(weekDay);
//        }

//        WeekDay weekDay;
//        System.out.println(Enum.valueOf(WeekDay.class, "SUNDAY"));

        for (DocumentType documentType : DocumentType.values()) {
            System.out.println(documentType + " " + documentType.geraNumeroTeste());
        }
    }
}

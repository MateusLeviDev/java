//Author: Levi
//        jul/23

package Enums;

//doc: https://docs.oracle.com/javase/8/docs/api/java/lang/Enum.html
//enum extends java.lang - nao podem ser instanciadas - implements interface and not inh - solo or class
public enum WeekDay {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private int value;

    WeekDay(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

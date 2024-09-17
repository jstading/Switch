public class NumberOfDaysInMonth {

    public static boolean isLeapYear (int year){
        if (year < 1 || year > 9999){
            return false;
        } else if (((year%4 == 0) && (year%100 != 0)) || ((year%100 == 0) && (year%400 == 0))){
            return true;
        }else{
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        boolean leapYear = isLeapYear(year);
        if (month < 1 || month > 12){
            return -1;
        } else if (year < 1 || year > 9999){
            return -1;
        } else if (leapYear == true){
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 29;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        } else if (leapYear == false){
            return switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 2 -> 28;
                case 4, 6, 9, 11 -> 30;
                default -> -1;
            };
        } else{
            return -1;
        }
    }
}

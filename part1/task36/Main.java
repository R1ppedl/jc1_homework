package part1.task36;

public class Main {
    public static void main(String[] args) {
        SeasonsOfYear autumn = SeasonsOfYear.AUTUMN;
        SeasonsOfYear summer = SeasonsOfYear.SUMMER;
        SeasonsOfYear spring = SeasonsOfYear.SPRING;
        SeasonsOfYear winter = SeasonsOfYear.WINTER;
        int countOfDaysAutumn = autumn.countOfDays = 90;
        int countOfDaysSummer = summer.countOfDays = 90;
        int countOfDaysSpring = spring.countOfDays = 90;
        int countOfDaysWinter = winter.countOfDays = 90;
        String a = autumn.description = "это сезон после лета, когда листья на деревьях меняют цвета и начинают опадать, а также птицы улетают на юг";
        String sp = spring.description = "это сезон после зимы, когда тает снег, птицы возвращаются и все оживает";
        String sum = summer.description = "это сезон после весны, когда тепло на улице, люди отдыхают от работы, ездят на море ";
        String win = winter.description = "это сезон после осеени, когда все живое замерзает, идет снег, дети веселятся на снежных горках, а взрослые сидят дома и пьют какао";
        System.out.println("Осень - " + a);
        System.out.println("Колличество дней в осени: " + countOfDaysAutumn);
        System.out.println("Зима - " + win);
        System.out.println("Колличество дней в зиме: " + countOfDaysWinter);
        System.out.println("Весна - " + sp);
        System.out.println("Колличество дней в весне: " + countOfDaysSpring);
        System.out.println("Лето - " + sum);
        System.out.println("Колличество дней летом: " + countOfDaysSummer);
    }
}

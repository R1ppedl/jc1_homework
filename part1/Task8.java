package part1;

public class Task8 {
    public static void main(String[] args) {
        int a = 90;
        int b = 10;
        int r = 10;
        double diaganal1  = Math.sqrt(a*a + b*b);
        int diaganal2 = r*2;
        if (diaganal2 > diaganal1)
            System.out.println("Прямоукольное отверстие можно закрыть");
        else
            System.out.println("Прямоукольное отверстие нельзя закрыть");
    }
}

import java.util.Scanner;

public class dien_tich_hinh_chu_nhat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float widthRectangle;
        float heightRectangle;
        float arenaRectangle;

        System.out.println("input width rectangle \n");
        widthRectangle = input.nextFloat();
        System.out.println("input length rectangle \n");
        heightRectangle = input.nextFloat();
        arenaRectangle = widthRectangle * heightRectangle;
        System.out.println("area of rectangle is : " + arenaRectangle);

    }

}

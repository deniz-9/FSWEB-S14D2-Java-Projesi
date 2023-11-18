


import com.workintech.model.*;
import com.workintech.model.enums.LampType;
import com.workintech.model.enums.PaintColor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Bedroom bedroom = new Bedroom(
                "Yatak Odası",
                new Wall("Doğu"),
                new Wall("Batı"),
                new Wall("Kuzey"),
                new Wall("Güney"),
                new Ceiling(275, PaintColor.BLUE),
                new Bed(6, "yok", "yok", 1, 5),
                new Lamp(true, 20, LampType.TABLE),
                new Wardrobe(120, 120, 200),
                new Carpet(250, 120, PaintColor.GREEN)
        );

        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getLamp().turnOn();
    }
}






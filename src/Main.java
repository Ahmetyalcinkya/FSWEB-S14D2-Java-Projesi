import com.workintech.house.Bedroom;
import com.workintech.house.bed.Bed;
import com.workintech.house.carpet.Carpet;
import com.workintech.house.carpet.PaintColor;
import com.workintech.house.ceiling.Ceiling;
import com.workintech.house.lamp.Lamp;
import com.workintech.house.lamp.LampType;
import com.workintech.house.wall.Wall;
import com.workintech.house.wardrobe.Wardrobe;

public class Main {
    public static void BedroomCreator() {
        Bedroom bedroomOne = new Bedroom("Children",
                new Wall("north"),new Wall("south"),
                new Wall("east"),new Wall("west"),
                new Ceiling(300, PaintColor.POWDER),
                new Bed("Metal Bed Frame",1,300,1,1),
                new Lamp(true,3, LampType.TORCHIERE),
                new Wardrobe(500,250,80),
                new Carpet(250,500,PaintColor.LIGHTGRAY));
        System.out.println("-------------------------------------------");
        bedroomOne.getBed().make();
        bedroomOne.getCeiling().create();
        bedroomOne.getLamp().turnOn();
        bedroomOne.getWardrobe().add();
        bedroomOne.getCarpet().lying();
        System.out.println("-------------------------------------------");
        System.out.println(bedroomOne);
        System.out.println("-------------------------------------------");
    }
    public static void main(String[] args) {
        BedroomCreator();
    }
}
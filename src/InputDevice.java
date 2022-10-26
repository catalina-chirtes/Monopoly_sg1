import java.util.Random;

public class InputDevice {
    Integer[] fr = new Integer[10];
    public void declare(){
        for(int i=0;i<10;i++)
            fr[i]=0;
    }
    public String getName(){
        String[] names = {"Dog", "Cat", "Battleship", "Penguin", "Rubber Ducky", "Top Hat", "Race Car", "Thimble"};
        Random random = new Random();
        int r = random.nextInt(8);
        while(fr[r] == 1)
            r = random.nextInt(8);
        fr[r]=1;

        return names[r];
    }

    public int ThrowDice(){
        Random random = new Random();
        int x = random.nextInt(2,12);
        return x;
    }

    public Square[] getPlaces(){
        Square[] locations = {
                new Square("Start"),
                new Property("Mediterranean Avenue", 100, 20, null ),
                new Square("Community Chest"),
                new Property("Baltic Avenue", 110, 22, null),
                new Square("INCOME TAX"),
                new Property("Reading Railroad", 200, 25, null),
                new Property("Oriental Avenue", 120, 24, null),
                new Square("Chance"),
                new Property("Vermont Avenue", 130, 26, null),
                new Property("Connecticut Avenue", 140, 28, null),
                new Square("Just Visiting Jail"),
                new Property("St. Charles Place", 150, 30, null),
                new Property("Electric Company", 160, 32, null),
                new Property("States Avenue", 170, 34, null),
                new Property("Virginia Avenue", 180, 36, null),
                new Property("Pennsylvania Railroad", 190, 38, null),
                new Property("St. James Place", 200, 40, null),
                new Square("Community Chest"),
                new Property("Tennessee Avenue", 210, 42, null),
                new Property("New York Avenue", 220, 44, null),
                new Square("Free Parking"),
                new Property("Kentucky Avenue", 230, 46, null),
                new Square("Chance"),
                new Property("Indiana Avenue", 240, 48, null),
                new Property("Illinois Avenue", 250, 50, null),
                new Property("B&O Railroad", 260, 52, null),
                new Property("Atlantic Avenue", 270, 54, null),
                new Property("Ventnor Avenue", 280, 56, null),
                new Property("Water Works", 290, 58, null),
                new Property("Marvin Gardens", 300, 60, null),
                new Square("Go to Jail"),
                new Property("Pacific Avenue", 310, 62, null),
                new Property("North Carolina Avenue", 320, 64, null),
                new Square("Community Chest"),
                new Property("Pennsylvania Avenue", 330, 66, null),
                new Property("Short Line Railroad", 340, 68, null),
                new Square("Chance"),
                new Square("Park Place"),
                new Square("LUXURY TAX"),
                new Property("Boardwalk", 350, 70, null),

        };        return locations;
    }
}

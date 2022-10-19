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

    public String[] getPlaces(){
        String[] locations = {"Start", "Mediterranean Avenue", "Community Chest", "Baltic Avenue", "INCOME TAX", "Reading Railroad", "Oriental Avenue", "Chance", "Vermont Avenue", "Connecticut Avenue", "Just Visiting Jail", "St. Charles Place", "Electric Company","States Avenue", "Virginia Avenue", "Pennsylvania Railroad", "St. James Place", "Community Chest", "Tennessee Avenue", "New York Avenue", "Free Parking", "Kentucky Avenue", "Chance", "Indiana Avenue", "Illinois Avenue", "B&O Railroad", "Atlantic Avenue", "Ventnor Avenue", "Water Works", "Marvin Gardens", "Go to Jail", "Pacific Avenue", "North Carolina Avenue", "Community Chest", "Pennsylvania Avenue", "Short Line", "Chance", "Park Place", "LUXURY TAX", "Boardwalk"};
        return locations;
    }
}

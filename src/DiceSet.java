import java.util.Random;

public class DiceSet {
    private Random rnd = new Random();

    public int roll(DiceType diceType) {
        int myval = 0;
        switch(diceType) {
            case D4:
                myval = rnd.nextInt(4) + 1;
            break;
            case D6:
                myval = rnd.nextInt(6) + 1;
            break;

        }


        return myval;
    }

    public static void main(String[] args) {
        
        DiceSet set = new DiceSet();

        System.out.println("TESTING DiceSet (D4): " + set.roll(DiceType.D4));
        System.out.println("TESTING DiceSet (D6): " + set.roll(DiceType.D6));
        System.out.println("TESTING DiceSet (D8): " + set.roll(DiceType.D8));
        System.out.println("TESTING DiceSet (D10): " + set.roll(DiceType.D10));
        System.out.println("TESTING DiceSet (D12): " + set.roll(DiceType.D12));
        System.out.println("TESTING DiceSet (D20): " + set.roll(DiceType.D20));
    }

    
}

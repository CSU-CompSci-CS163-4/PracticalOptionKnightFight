public class Fortune implements Attributes {
    private int armor;

    public Fortune(String name, int hpBonus, int armor, int hitModifier) {
        this(name, hpBonus, armor, hitModifier, null);
    }

    public Fortune(String name, int hpBonus, int armor, int hitModifier, DiceType type) {
        this.armor = armor;
    }
    @Override
    public int getArmor() {
        return armor;
    }

    @Override
    public int getMaxHP() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public DiceType getDamageDie() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getHitModifier() {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        Fortune ftn = new Fortune("Merlin Luck", 10, 5, 2, DiceType.D12);
        System.out.println("TESTING Armor in fortune " + ftn.getArmor());
    }
    
}

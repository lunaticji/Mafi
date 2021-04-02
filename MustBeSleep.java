public class MustBeSleep extends Player{

    public MustBeSleep(String name, Roles role) {
        super(name, role);
    }
}
class Joker extends MustBeSleep{

    public Joker(String name, Roles role) {
        super(name, role);
    }
}
class Villager extends MustBeSleep{

    public Villager(String name, Roles role) {
        super(name, role);
    }
}
class BulletProof extends MustBeSleep{

    boolean hasProof=true;

    public BulletProof(String name, Roles role) {
        super(name, role);
    }

    @Override
    protected void die(){
        if (this.hasProof || super.rescue) {
            this.hasProof=false;
            super.rescue=false;
            System.out.println("No players were killed");
        }else {
            super.isLive=false;
            System.out.println("Player with name " + super.name + " Killed");
        }
    }
}
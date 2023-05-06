
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossDamage(75);
        boss.setBossHealth(500);
        boss.setBarrierType("Magic");
        System.out.println("Damage = " + boss.getBossDamage()+ "Health= " + boss.getBossHealth() + "BarrieType = " + boss.getBarrierType());
        
    }
}


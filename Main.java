public class Main {
    public static void main(String[] args) {
        System.out.println("=== SIMULASI TURN-BASED RPG ===\n");
        
        Player hero = new Player("P01", "Warrior", 100, 25);
        BossMusuh boss = new BossMusuh("B01", "Minotaur", 80);

        System.out.println("--- STATUS AWAL ---");
        hero.tampilkanStatus();
        boss.tampilkanStatus();

        System.out.println("\n--- TURN 1 ---");
        Penyerang giliran1 = hero;
        Penyerang giliran2 = boss;

        giliran1.serang(boss);
        giliran2.serang(hero);

        System.out.println("\n--- STATUS SETELAH TURN 1 ---");
        hero.tampilkanStatus();
        boss.tampilkanStatus();

        System.out.println("\n--- TURN 2 ---");
        giliran1.serang(boss);
        giliran2.serang(hero);

        System.out.println("\n--- STATUS AKHIR ---");
        hero.tampilkanStatus();
        boss.tampilkanStatus();
    }
}
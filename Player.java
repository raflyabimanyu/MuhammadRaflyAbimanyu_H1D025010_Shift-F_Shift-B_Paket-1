public class Player extends Karakter implements Penyerang, Bertahan {
    private int stamina;

    public Player(String idKarakter, String nama, int hp, int stamina) {
        super(idKarakter, nama, hp);
        this.stamina = stamina;
    }

    public int getStamina() { return this.stamina; }
    public void setStamina(int stamina) { this.stamina = stamina; }

    @Override
    public void eksekusiSerangan(Karakter target) {
        if (this.stamina >= 20) {
            System.out.println(getNama() + " memakai 20 Stamina untuk SERANGAN ULTIMATE!");
            target.setHp(target.getHp() - 40);
            this.stamina -= 20;
        } else {
            System.out.println(getNama() + " kelelahan! Hanya bisa serangan biasa.");
            target.setHp(target.getHp() - 10);
            this.stamina += 15;
        }
    }

    @Override
    public void serang(Karakter target) {
        eksekusiSerangan(target);
    }

    @Override
    public void pulihkan() {
        System.out.println(getNama() + " memilih bertahan memulihkan 20 HP & 10 Stamina.");
        setHp(getHp() + 20);
        this.stamina += 10;
    }

    @Override
    public void tampilkanStatus() {
        super.tampilkanStatus();
        System.out.println("  => Stamina: " + this.stamina);
    }
}

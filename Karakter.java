public abstract class Karakter {
    public static final int MAX_HP = 1000;
    private final String idKarakter;

    private String nama;
    private int hp;

    public Karakter(String idKarakter, String nama) {
        this.idKarakter = idKarakter;
        this.nama = nama;
        this.hp = 100; 
    }

    public Karakter(String idKarakter, String nama, int hp) {
        this.idKarakter = idKarakter;
        this.nama = nama;
        this.hp = hp;
    }

    public String getIdKarakter() { return this.idKarakter; }
    
    public String getNama() { return this.nama; }
    public void setNama(String nama) { this.nama = nama; }
    
    public int getHp() { return this.hp; }
    
    public void setHp(int hp) { 
        if (hp > MAX_HP) this.hp = MAX_HP;
        else if (hp < 0) this.hp = 0;
        else this.hp = hp;
    }

    public void tampilkanStatus() {
        System.out.println("[" + this.idKarakter + "] " + this.nama + " | HP: " + this.hp);
    }

    public abstract void eksekusiSerangan(Karakter target);
}
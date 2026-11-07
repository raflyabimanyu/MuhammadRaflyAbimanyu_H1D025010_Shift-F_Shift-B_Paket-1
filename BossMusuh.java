public class BossMusuh extends Karakter implements Penyerang {
    private boolean isEnraged;

    public BossMusuh(String idKarakter, String nama, int hp) {
        super(idKarakter, nama, hp);
        this.isEnraged = false;
    }

    @Override
    public void eksekusiSerangan(Karakter target) {
        if (getHp() < 50 && !this.isEnraged) {
            System.out.println(getNama() + " ENTERING RAGE MODE!");
            this.isEnraged = true;
        }

        if (this.isEnraged) {
            System.out.println(getNama() + " melepaskan Fury Attack!");
            target.setHp(target.getHp() - 30);
        } else {
            System.out.println(getNama() + " memberikan serangan standar.");
            target.setHp(target.getHp() - 15);
        }
    }

    @Override
    public void serang(Karakter target) {
        eksekusiSerangan(target);
    }
}
public class Zamestnanec {
    String meno;
    int vek;
    int id;
    int plat;
    public Zamestnanec(String meno, int vek, int id, int plat)
    {
        this.meno = meno;
        this.vek = vek;
        this.id = id;
        this.plat = plat;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlat() {
        return plat;
    }

    public void setPlat(int id) {
        this.plat = plat;
    }


}

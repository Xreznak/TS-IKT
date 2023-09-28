public class Clovek {
    String meno;
    int vek;
    int id;

    public Clovek(String meno, int vek, int id){
        this.meno = meno;
        this.vek  = vek;
        this.id   = id;
    }

    ////////////////////////////////////vek////////////////////////////////////
    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek  = vek;
    }

    ////////////////////////////////////meno//////////////////////////////////
    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno  = meno;
    }
    ////////////////////////////////////ID/////////////////////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

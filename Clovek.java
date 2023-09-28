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

    ////////////////////////////////////IF/////////////////////////////////////
    public void porovnajVek(){
        if(this.vek < 40){
            System.out.println("Si mladý");
        }
        else {
            System.out.println("Si starý");
        }
    }

    ////////////////////////////////////FOR/////////////////////////////////////
    public void vypisCisla(int max){
        for(int i = 0; i<max; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }
    }

    ////////////////////////////////////FOR/////////////////////////////////////
}

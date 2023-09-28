public class pouzitie_throw {
    public static void main(String[] args)
    {
        try
        {
            double teplota_celzia = 20;
            double teplot_farenthait = -500;
            TemperutureConverter_celza_to_farenthait(teplota_celzia);
            TemperutureConverter_farenthait_to_celzia(teplot_farenthait);
        }
        catch(Exception IllegalArgumentException)
        {
            System.err.println("Vynimka: " + IllegalArgumentException.getMessage());
        }
    }

    static void TemperutureConverter_celza_to_farenthait(double teplota_celzia) throws Exception {
        if(teplota_celzia < -273.15)
        {
            throw new Exception("zadal si zly vstup pre celzia");
        }
        System.out.println("Stupne farenthaitov je = " + (1.8 * teplota_celzia + 32));
    }

    static void TemperutureConverter_farenthait_to_celzia(double teplot_farenthait) throws Exception {
        if(teplot_farenthait < -459.67)
        {
            throw new Exception("zadal si zly vstup pre farenhaity");
        }
        System.out.println("Stupne farenthaitov je = " + ((teplot_farenthait - 32) / 1.8));
    }
}
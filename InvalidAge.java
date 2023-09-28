public class InvalidAge{
    public static void main(String[] args)
    {
        try
        {
            int vek = 8;
            overVek(vek);
        }
        catch(Exception e)
        {
            System.out.println("Vynimka: " + e.getMessage());
        }
    }

    static void overVek(int vek) throws Exception {
        if(vek < 18)
        {
            throw new Exception("Mas malo rokov");
        }
        System.out.println("Mas dostatocny vek ist do baru");
    }
}

public class Resources {
    long gold;
    byte silver;
    short wood;
    long health;
    boolean hasHelper;

    public Resources (
            long inp_gold,
            byte inp_silver,
            short inp_wood,
            long inp_health,
            boolean inp_hasHelper
    ) {
        gold = inp_gold;
        silver = inp_silver;
        wood = inp_wood;
        health = inp_health;
        hasHelper = inp_hasHelper;
    }
}
package logika;
/**
 *  Třída PrikazNPoloz implementuje pro hru příkaz poloz.
 *  Tato třída je součástí jednoduché textové hry.
 */
public class PrikazPoloz implements IPrikaz{
    /**
     * příkaz polož se volá klíčovým slovem "polož"
     */
    private static final String JMENO = "poloz";
    /**
     * herní plán
     */

    private HerniPlan plan;

    /**
     * kosntruktor třídy PrikazPoloz
     * @param plan
     */

    public PrikazPoloz(HerniPlan plan){
        this.plan = plan;
    }

    /**
     * proveď příkaz
     * @param parametry počet parametrů závisí na daném příkazu
     * @return
     */

    @Override
    public String provedPrikaz(String... parametry) {
        if(parametry.length == 0){
            return "Musíš zadat co chceš položit!";
        }

        String nazevVeci = parametry[0];

        if(plan.getBrasna().obsahujePolozku(nazevVeci)) {
            Polozka vecKPolozeni = plan.getBrasna().vyndejZBrasny(nazevVeci);
            plan.getAktualniProstor().vlozPolozku(vecKPolozeni);
            return  nazevVeci + "  jsi položil do prostoru " + plan.getAktualniProstor().getJmeno();
        }

        return nazevVeci + " věc neni v brašně";
    }



    @Override
    public String getJmeno() {
        return JMENO;
    }

}

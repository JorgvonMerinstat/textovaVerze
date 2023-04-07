package logika;
/**
 *  Třída implementující toto rozhraní bude
 *  ve hře zpracovávat jeden konkrétní příkaz.
 *  Toto rozhraní je součástí jednoduché textové hry.
 */
public interface IPrikaz {
    /**
     *
     * @param parametry počet parametrů závisí na daném příkazu
     */
    public String provedPrikaz(String... parametry);

    /**
     * Metoda vrací název příkazu (slovo které používá hráč pro jeho vyvolání)
     * @return nazev prikazu
     */
    public String getJmeno();
}

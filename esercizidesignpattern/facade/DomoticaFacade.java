package myRepo.esercizidesignpattern.facade;

public class DomoticaFacade {

    private Luci luci;
    private Temperatura temperatura;
    private Porte porte;

    public DomoticaFacade() {
        this.luci = new Luci();
        this.temperatura = new Temperatura();
        this.porte = new Porte();
    }

    public DomoticaFacade(Luci luci, Temperatura temperatura, Porte porte) {
        this.luci = luci;
        this.temperatura = temperatura;
        this.porte = porte;
    }

    public void ritornoACasa() {
        luci.accendi();
        temperatura.alzaTemperatura();
        porte.chiudiPorte();
    }

    public void escoDaCasa() {
        luci.spegni();
        temperatura.abbassaTemperatura();
        porte.apriPorte();
        porte.chiudiPorte();
    }


}

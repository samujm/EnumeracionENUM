package enumeracion;

public enum Continentes {
    //AFRICA(53, "1.2 billones"),
    AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);

    private final int paises;
   // private final int habitantes;

    private Continentes(int paises/*, String habitantes*/) {
        this.paises = paises;
        //this.habitantes = habitantes;
    }

    public int getPaises() {
        return this.paises;
        //return this.habitantes;
    }    
    //NOTA!!! Las partes comentadas indican que se pueden agregar más atributos a las enumeraciones, por cada elemento puede tener mas atributos definidos
}

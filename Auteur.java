public class Auteur {
    private String nomAuteur;
    private String perfTrag;
    private int qualTrag;
    private String perfCom;
    private int qualCom;
    private String perfDram;
    private int qualDram;

    public Auteur(String nomAuteur, String perfTrag, int qualTrag, String perfCom, int qualCom, String perfDram, int qualDram) {
        this.nom = nomAuteur;
        this.perfTrag = perfTrag;
        this.qualTrag = qualTrag;
        this.perfCom = perfCom;
        this.qualCom = qualCom;
        this.perfDram = perfDram;
        this.qualDram = qualDram;
}
    public void getQualiteTrag() {
        return this.qualTrag;
}
    @Override
    public String toString() {
        return "L'honorable" + this.nomAuteur;
}
}
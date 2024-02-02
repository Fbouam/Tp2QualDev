public class Auteur {
    private String nomAuteur;
    private String perfTrag;
    private int qualTrag;
    private String perfCom;
    private int qualCom;
    private String perfDram;
    private int qualDram;

    public Auteur(String nomAuteur, String perfTrag, int qualTrag, String perfCom, int qualCom, String perfDram, int qualDram) {
        this.nomAuteur = nomAuteur;
        this.perfTrag = perfTrag;
        this.qualTrag = qualTrag;
        this.perfCom = perfCom;
        this.qualCom = qualCom;
        this.perfDram = perfDram;
        this.qualDram = qualDram;
    }
    public int getQualiteTrag() {
        return this.qualTrag;
    }
    public String getPerfTrag(){
        return this.perfTrag;
    }
    public int getQualiteCom() {
        return this.qualCom;
    }
    public String getPerfCom(){
        return this.perfCom;
    }
    public int getQualiteDram() {
        return this.qualDram;
    }
    public String getPerfDram(){
        return this.perfDram;
    }
    public String pointFort(){
        if (this.qualCom > this.qualDram && this.qualCom > this.qualTrag ){
            return "COMEDIE";
        }
        else if (this.qualDram > this.qualTrag){
            return "DRAME";
        }
        else{
            return "TRAGEDIE";
        }
    }
    public int qualitéStyle(Style s){
        if(s.equals("COMÉDIE")){
            return this.qualCom;
        }
        else if(s.equals("TRAGÉDIE")){
            return this.qualTrag;
        }
        else{
            return this.qualDram;
        }
    }
    

    @Override
    public String toString() {
        return "L'honorable" + this.nomAuteur;
        }
}
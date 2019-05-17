package model;

public class selectedCase {


    private static int idPion = 0;
    private static int SelPosxG = -1;
    private static int SelPosxyG = -1;

    private static int SelPosxD = -1;
    private static int SelPosxyD = -1;

    private static String colorG = "bleu";
    private static String colorD = "bleu";


    public static String getColorG() {
        return colorG;
    }

    public static void setColorG(String colorG) {
        selectedCase.colorG = colorG;
    }

    public static String getColorD() {
        return colorD;
    }

    public static void setColorD(String colorD) {
        selectedCase.colorD = colorD;
    }

    public static int getSelPosxG() {
        return SelPosxG;
    }

    public static int getIdPion() {
        return idPion;
    }

    public static void setIdPion(int idPion) {
        selectedCase.idPion = idPion;
    }

    public static void setSelPosxG(int selPosxG) {
        SelPosxG = selPosxG;
    }

    public static int getSelPosxyG() {
        return SelPosxyG;
    }

    public static void setSelPosxyG(int selPosxyG) {
        SelPosxyG = selPosxyG;
    }

    public static int getSelPosxD() {
        return SelPosxD;
    }

    public static void setSelPosxD(int selPosxD) {
        SelPosxD = selPosxD;
    }

    public static int getSelPosxyD() {
        return SelPosxyD;
    }

    public static void setSelPosxyD(int selPosxyD) {
        SelPosxyD = selPosxyD;
    }

    public static void setted4Black(Pion p){
        selectedCase.setSelPosxG(p.getX()-1);
        selectedCase.setSelPosxyG(p.getY()-1);
        selectedCase.setSelPosxD(p.getX()+1);
        selectedCase.setSelPosxyD(p.getY()-1);
        selectedCase.setIdPion(p.getid());


    }
    public static void setted4White(Pion p){

        selectedCase.setSelPosxG(p.getX()-1);
        selectedCase.setSelPosxyG(p.getY()+1);
        selectedCase.setSelPosxD(p.getX()+1);
        selectedCase.setSelPosxyD(p.getY()+1);
        selectedCase.setIdPion(p.getid());

    }
    public static void resetSelectedCase(){
        selectedCase.setSelPosxG(-1);
        selectedCase.setSelPosxyG(-1);
        selectedCase.setSelPosxD(-1);
        selectedCase.setSelPosxyD(-1);
        selectedCase.setIdPion(-1);
    }

}

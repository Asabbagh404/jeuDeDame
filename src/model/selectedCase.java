package model;

public class selectedCase {
    private static int SelPosxG = 0;

    private static int SelPosxyG = 0;

    private static int SelPosxD = 0;

    private static int SelPosxyD = 0;


    public static int getSelPosxG() {
        return SelPosxG;
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

    }
    public static void setted4White(Pion p){
        selectedCase.setSelPosxG(p.getX()-1);
        selectedCase.setSelPosxyG(p.getY()+1);
        selectedCase.setSelPosxD(p.getX()+1);
        selectedCase.setSelPosxyD(p.getY()+1);
    }
    public static void resetSelectedCase(){
        selectedCase.setSelPosxG(0);
        selectedCase.setSelPosxyG(0);
        selectedCase.setSelPosxD(0);
        selectedCase.setSelPosxyD(0);
    }

}

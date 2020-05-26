/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ale
 */
public class Agendars {
        String Act1;
        String notad1;
        String Dur1;
        //String dd1;
        String Hor1;
        String Lug1;
        String Tel1;
        //String annio1;
        String Direc1;
        //String mes1; 
        String Acomp1;

public Agendars(String Act, String notad, String Dur, /*String dd,*/ String Hor, String Lug, String Tel,
        /*String annio,*/ String Direc, /*String mes,*/ String Acomp){
        this.Act1 = Act;
        this.notad1=notad;
        this.Dur1 = Dur;
        //this.dd1=dd;
        this.Hor1=Hor;
        this.Lug1=Lug;
        this.Tel1=Tel;
        //this.annio1=annio;
        this.Direc1=Direc;
        //this.mes1=mes; 
        this.Acomp1=Acomp;
}

    public String getAcomp1() {
        return Acomp1;
    }

    public void setAcomp1(String Acomp1) {
        this.Acomp1 = Acomp1;
    }

    Agendars(String texto1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAct1(String Act1) {
        this.Act1 = Act1;
    }

    public void setNotad1(String notad1) {
        this.notad1 = notad1;
    }

    public void setDur1(String Dur1) {
        this.Dur1 = Dur1;
    }

    /*public void setDd1(String dd1) {
        this.dd1 = dd1;
    }*/

    public void setHor1(String Hor1) {
        this.Hor1 = Hor1;
    }

    public void setLug1(String Lug1) {
        this.Lug1 = Lug1;
    }

    public void setTel1(String Tel1) {
        this.Tel1 = Tel1;
    }

    /*public void setAnnio1(String annio1) {
        this.annio1 = annio1;
    }*/

    public void setDirec1(String Direc1) {
        this.Direc1 = Direc1;
    }

    /*public void setMes1(String mes1) {
        this.mes1 = mes1;
    }*/

    public String getAct1() {
        return Act1;
    }

    public String getNotad1() {
        return notad1;
    }

    public String getDur1() {
        return Dur1;
    }

    /*public String getDd1() {
        return dd1;
    }*/

    public String getHor1() {
        return Hor1;
    }

    public String getLug1() {
        return Lug1;
    }

    public String getTel1() {
        return Tel1;
    }

    /*public String getAnnio1() {
        return annio1;
    }*/

    public String getDirec1() {
        return Direc1;
    }

    /*public String getMes1() {
        return mes1;
    }*/

}

package com.workintech.model;

public class Bed {
    private  int pillows;
    private String style;
    private String height;
    private int sheets;
    private int quilts;
    public void make(){
        System.out.println("the bed ...");

    }

    public Bed(int pillows, String style, String height, int sheets, int quilts) {
        this.pillows = pillows;
        this.style = style;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public int getPillows() {
        return pillows;
    }



    public String getStyle() {
        return style;
    }



    public String getHeight() {
        return height;
    }



    public int getSheets() {
        return sheets;
    }


    public int getQuilts() {
        return quilts;
    }


}

package com.example.darpan.toursimproject;

import java.security.PublicKey;
import java.util.ArrayList;
public class Information{
    private int tpTimining;
    private int tpAddress;
    private int tpRatings;
    private  int tpImage;
    private int tpName;
    private int tpSpecial;
    public Information(int name,int timining,int address,int ratings,int special,int image)
    {
        tpTimining=timining;
        tpAddress=address;
        tpRatings=ratings;
        tpName=name;
        tpSpecial=special;
        tpImage=image;
    }
    public int getTiming(){
        return tpTimining;
    }
    public int getAddress(){
        return tpAddress;
    }
    public int getRatings(){return tpRatings;}
    public int getName(){return tpName;}
    public int getSpecial(){return tpSpecial;}
    public int getImage(){
        return tpImage;
    }

}

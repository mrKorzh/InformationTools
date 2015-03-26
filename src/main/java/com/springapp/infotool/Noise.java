package com.springapp.infotool;

import com.springapp.infotool.dao.NoiseDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by mkorshun on 3/26/2015.
 */
public class Noise {
//    public static void main(String[] args) {
//        System.out.println("main");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
//        NoiseDaoImpl dao = ctx.getBean("NoiseDaoImpl", NoiseDaoImpl.class);
//        List<Noise> noiseList = dao.getAllNoises();
//        for (Noise noise : noiseList){
//            System.out.println(noise.getId() + " " + noise.getHeight());
//        }
//
//    }

    private int id;
    private double lambda;
    private double height;
    private double sigmar;
    private double sigmav;
    private double sigmatetta;
    private double sigmax;
    private double sigmafi;
    private double sigmab;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSigmar() {
        return sigmar;
    }

    public void setSigmar(double sigmar) {
        this.sigmar = sigmar;
    }

    public double getSigmav() {
        return sigmav;
    }

    public void setSigmav(double sigmav) {
        this.sigmav = sigmav;
    }

    public double getSigmatetta() {
        return sigmatetta;
    }

    public void setSigmatetta(double sigmatetta) {
        this.sigmatetta = sigmatetta;
    }

    public double getSigmax() {
        return sigmax;
    }

    public void setSigmax(double sigmax) {
        this.sigmax = sigmax;
    }

    public double getSigmafi() {
        return sigmafi;
    }

    public void setSigmafi(double sigmafi) {
        this.sigmafi = sigmafi;
    }

    public double getSigmab() {
        return sigmab;
    }

    public void setSigmab(double sigmab) {
        this.sigmab = sigmab;
    }
}

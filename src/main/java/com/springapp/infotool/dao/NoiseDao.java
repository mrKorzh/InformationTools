package com.springapp.infotool.dao;

import com.springapp.infotool.InfoTool;
import com.springapp.infotool.Noise;

import java.util.List;

/**
 * Created by mkorshun on 3/26/2015.
 */
public interface NoiseDao {


    void create(Noise noise);

    List<Noise> getAllNoise();
}

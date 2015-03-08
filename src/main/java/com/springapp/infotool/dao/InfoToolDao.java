package com.springapp.infotool.dao;

import com.springapp.infotool.InfoTool;

public interface InfoToolDao {

    void create(InfoTool infoTool);

    InfoTool getInfoToolByID(Integer id);

}

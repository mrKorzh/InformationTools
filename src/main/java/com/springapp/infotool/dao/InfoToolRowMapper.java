package com.springapp.infotool.dao;


import com.springapp.infotool.InfoTool;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class InfoToolRowMapper implements RowMapper<InfoTool> {

    @Override
    public InfoTool mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        InfoTool infoTool = new InfoTool();
        infoTool.setId(resultSet.getInt("id"));
        infoTool.setType(resultSet.getInt("type"));
        infoTool.setStateLongitude(resultSet.getDouble("stateLongitude"));
        infoTool.setStateLatitude(resultSet.getDouble("stateLatitude"));
        infoTool.setStateHeight(resultSet.getDouble("stateHeight"));
        infoTool.setZoneType(resultSet.getInt("zoneType"));
        infoTool.setRangeMax(resultSet.getDouble("rangeMax"));
        infoTool.setRangeMin(resultSet.getDouble("rangeMin"));
        infoTool.setAzimutMax(resultSet.getDouble("azimutMax"));
        infoTool.setAzimutMin(resultSet.getDouble("azimutMin"));
        infoTool.setPlaceAngleMax(resultSet.getDouble("placeAngleMax"));
        infoTool.setPlaceAngleMin(resultSet.getDouble("placeAngleMin"));
        infoTool.setRange(resultSet.getDouble("range"));
        infoTool.setPenetratingPower(resultSet.getDouble("penetratingPower"));
        infoTool.setCountInTime(resultSet.getInt("countInTime"));

        return infoTool;
    }
}

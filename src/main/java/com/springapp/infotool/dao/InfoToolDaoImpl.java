package com.springapp.infotool.dao;

import com.springapp.infotool.InfoTool;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class InfoToolDaoImpl implements InfoToolDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // здесь только selectы (база статическая)

    @Override
    public void create(InfoTool infoTool) {  // удалить после полного тестирования бд
        String sql = "insert into infotools (type, stateLongitude, stateLatitude, stateHeight, zoneType, rangeMax, " +
                "rangeMin, azimutMax, azimutMin, placeAngleMax, placeAngleMin, range, penetratingPower, countInTime) " +
                "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update( sql, infoTool.getType(), infoTool.getStateLongitude(), infoTool.getStateLatitude(),
                infoTool.getStateHeight(), infoTool.getZoneType(), infoTool.getRangeMax(), infoTool.getRangeMin(),
                infoTool.getAzimutMax(), infoTool.getAzimutMin(), infoTool.getPlaceAngleMax(),
                infoTool.getPlaceAngleMin(), infoTool.getRange(), infoTool.getPenetratingPower(),
                infoTool.getCountInTime());

        System.out.println("Created Record: "
                + "type = " + infoTool.getType()
                + "stateLongitude = " + infoTool.getStateLongitude()
                + "stateLatitude = " + infoTool.getStateLatitude()
                + "stateHeight = " + infoTool.getStateHeight()
                + "zoneType = " + infoTool.getZoneType()
                + "rangeMax = " + infoTool.getRangeMax()
                + "rangeMax = " + infoTool.getRangeMin()
                + "azimutMax = " + infoTool.getAzimutMax()
                + "azimutMin = " + infoTool.getAzimutMin()
                + "placeAngleMax = " + infoTool.getPlaceAngleMax()
                + "placeAngleMin = " + infoTool.getPlaceAngleMin()
                + "range = " + infoTool.getRange()
                + "penetratingPower = " + infoTool.getPenetratingPower()
                + "countInTime = " + infoTool.getCountInTime());
    }

    @Override
    public InfoTool getInfoToolByID(Integer id) {
        String sql = "select * from InfoTools where id = ?";
        InfoTool infoTool = jdbcTemplate.queryForObject(sql, new Object[]{id}, new InfoToolRowMapper());
        return infoTool;
    }
}

package com.springapp.infotool.dao;

import com.springapp.infotool.Noise;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by mkorshun on 3/26/2015.
 */
public class NoiseRowMapper implements RowMapper<Noise> {
//    private static NoiseRowMapper ourInstance = new NoiseRowMapper();
//
//    public static NoiseRowMapper getInstance() {
//        return ourInstance;
//    }
//
//    private NoiseRowMapper() {
//    }

    @Override
    public Noise mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Noise noise = new Noise();

        noise.setId(resultSet.getInt("id"));
        noise.setHeight(resultSet.getDouble("height"));
        noise.setLambda(resultSet.getDouble("lambda"));
        noise.setSigmab(resultSet.getDouble("sigmab"));
        noise.setSigmafi(resultSet.getDouble("sigmafi"));
        noise.setSigmar(resultSet.getDouble("sigmar"));
        noise.setSigmatetta(resultSet.getDouble("sigmatetta"));
        noise.setSigmav(resultSet.getDouble("sigmav"));
        noise.setSigmax(resultSet.getDouble("sigmax"));

        return noise;
    }
}

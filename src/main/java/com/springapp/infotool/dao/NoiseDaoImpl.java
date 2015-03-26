package com.springapp.infotool.dao;

import com.springapp.infotool.Noise;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mkorshun on 3/26/2015.
 */
@Repository
public class NoiseDaoImpl {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List <Noise> getAllNoises() {
        String sql = "select * from noise ";
//        return noises;
        return jdbcTemplate.query(sql, new NoiseRowMapper());
    }
}

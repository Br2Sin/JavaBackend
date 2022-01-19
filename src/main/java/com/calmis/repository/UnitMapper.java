package com.calmis.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.calmis.beans.Unit;

@Component
public class UnitMapper implements RowMapper<Unit> {

	@Override
	public Unit mapRow(ResultSet rs, int arg1) throws SQLException {
		Unit untCde = new Unit();
		untCde.setUnitCde(rs.getInt("UNIT_CDE"));
		return untCde;
	}
}

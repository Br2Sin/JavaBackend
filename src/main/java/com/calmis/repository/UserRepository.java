package com.calmis.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.calmis.beans.ResponseEntity;
import com.calmis.beans.Unit;
import com.calmis.beans.UserInfo;
import com.calmis.common.QueryConstant;

@Repository
public class UserRepository implements QueryConstant {
    private static Logger LOG = LoggerFactory.getLogger(UserRepository.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    UnitMapper nmanager;
    private UnitDetailsProc sproc;
    private LoginProc loginProc;
    private UnitValidationProc validateUnitProc;

    /**
     * This method is used to get the list list of Unit code
     *
     * @return
     */
    public List<Unit> fetchUnitList() {
        LOG.info("Inside fetchUnitList method()");
        final String sql = "select unit_cde,  eng_abbr_nme  from ils.unt";
        return jdbcTemplate.query(sql, nmanager);
    }

    /**
     * This method is used to validate the user account status.
     *
     * @param userId
     * @return
     */
    public String validate(String userId) {
        LOG.info("Inside validate method()");
        String outputMsg = null;
        outputMsg = jdbcTemplate.query(CHECK_USER_ACCOUNT_STATUS, new Object[]{userId},
                new ResultSetExtractor<String>() {
                    @Override
                    public String extractData(ResultSet rs) throws SQLException, DataAccessException {
                        return rs.next() ? rs.getString("ACCOUNT_STATUS") : null;
                    }
                });

        return outputMsg;
    }

    /**
     * This method is used to get the unit code associated with the user
     *
     * @param userName
     * @return
     */
    public String getUnitCodeByUserName(String userName) {
        LOG.info("Inside getUnitCode method()");
        String outputMsg = "No Unit Code mapped for selected user";
        List<String> unitCodeList = new ArrayList<>();
        List<Map<String, Object>> list = jdbcTemplate.queryForList(GET_UNIT_CODE, new Object[]{userName});
        if (list != null) {
            list.forEach(it -> {
                unitCodeList.add((String) it.get("UNIT_CODE"));
            });

            if (unitCodeList.size() == 1) {
                outputMsg = unitCodeList.get(0);
            } else if (unitCodeList.size() > 1) {
                outputMsg = unitCodeList.get(0);
            }
        }
        return outputMsg;
    }

    /**
     * This method is used to get the unit Code details by passing the user Id and
     * password
     *
     * @param user
     * @return
     */
    public ResponseEntity authenticateUser(UserInfo user) {
        LOG.info("Inside getUnitDetails method()");
        sproc = new UnitDetailsProc(jdbcTemplate.getDataSource());
        return sproc.execute(user.getUsername(), user.getPassword());
    }

    /**
     * This method is used to get the login details
     *
     * @param user
     * @return
     */
    public ResponseEntity login(UserInfo user) {
        LOG.info("Inside login method()");
        loginProc = new LoginProc(jdbcTemplate.getDataSource());
        return loginProc.execute(user.getUsername(), user.getUnitCode());
    }

    /**
     * This method returns the unit code details for the unit code passed
     *
     * @param user
     * @return
     */
    public ResponseEntity fetchUnitCodeDtls(UserInfo user) {
        LOG.info("Inside fetchUnitCodeDtls method()");
        validateUnitProc = new UnitValidationProc(jdbcTemplate.getDataSource());
        return validateUnitProc.execute(user.getUnitCode());
    }
}

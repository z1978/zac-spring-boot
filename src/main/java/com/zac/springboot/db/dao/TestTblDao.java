package com.zac.springboot.db.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.zac.springboot.db.entity.TestTbl;




/**
 */
//@Dao(config = AppConfig.class)
@ConfigAutowireable
@Dao
public interface TestTblDao {

    /**
     * @param id
     * @return the TestTbl entity
     */
    @Select
    TestTbl selectById(Integer id);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(TestTbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(TestTbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(TestTbl entity);
}
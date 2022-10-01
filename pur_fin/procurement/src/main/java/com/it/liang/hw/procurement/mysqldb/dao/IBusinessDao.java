package com.it.liang.hw.procurement.mysqldb.dao;

import com.it.liang.hw.procurement.mysqldb.model.entity.PersonEntity;

import java.util.List;


public interface IBusinessDao {

    /**
     * 新增数据服务
     *
     * @param insList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    int insertDao( List<PersonEntity> insList);

    /**
     * 删除数据服务
     *
     * @param idList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    int deleteDao(List<Integer> idList);

    /**
     * 删除数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    int updateDao(List<PersonEntity> updList);

    /**
     * 删除数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    int selectDao(List<PersonEntity> updList);



}

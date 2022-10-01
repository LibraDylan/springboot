package com.it.liang.hw.procurement.mysqldb.implement;

import com.it.liang.hw.procurement.mysqldb.dao.IBusinessDao;
import com.it.liang.hw.procurement.mysqldb.interfaces.IBusinessService;
import com.it.liang.hw.procurement.mysqldb.model.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusinessService implements IBusinessService {
    @Autowired
    private IBusinessDao businessDao;

    @Override
    public int insertService(List<PersonEntity> insList){
        return businessDao.insertDao(insList);
    }

    /**
     * 删除数据服务
     *
     * @param idList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @Override
    public int deleteService(List<Integer> idList){
        return businessDao.deleteDao(idList);
    }

    /**
     * 删除数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @Override
    public int updateService(List<PersonEntity> updList){
        return businessDao.updateDao(updList);
    }

    /**
     * 删除数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @Override
    public int selectService(List<PersonEntity> updList){
        return businessDao.selectDao(updList);
    }

    /**
     * 导出数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @Override
    public int exportService(List<PersonEntity> updList){
        return 0;
    }

    /**
     * 导入数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @Override
    public int importService(List<PersonEntity> updList) {
        return 0;
    }

}

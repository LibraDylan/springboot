package com.it.liang.hw.procurement.mysqldb.interfaces;

import com.it.liang.hw.procurement.mysqldb.model.entity.PersonEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 新增数据服务
 *
 * @author ydl
 * @since 2022/7/18
 */
@Controller("/v1/businessService")
public interface IBusinessService {
    /**
     * 新增数据服务
     *
     * @param insList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @RequestMapping("/insertService")
    int insertService(List<PersonEntity> insList);

    /**
     * 删除数据服务
     *
     * @param idList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @RequestMapping("/deleteService")
    int deleteService(List<Integer> idList);

    /**
     * 删除数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @RequestMapping("/updateService")
    int updateService(List<PersonEntity> updList);

    /**
     * 删除数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @RequestMapping("/selectService")
    int selectService(List<PersonEntity> updList);

    /**
     * 导出数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @RequestMapping("/exportService")
    int exportService(List<PersonEntity> updList);

    /**
     * 导入数据服务
     *
     * @param updList
     * @return int
     * @throw Except
     * @author ydl
     * @since 2022/7/18
     */
    @RequestMapping("/importService")
    int importService(List<PersonEntity> updList);

}

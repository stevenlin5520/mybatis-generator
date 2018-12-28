package com.steven.bike.dao;

import com.steven.bike.dto.Repair;
import com.steven.bike.dto.RepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    long countByExample(RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    int deleteByExample(RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    int deleteByPrimaryKey(String repairId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    int insert(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    int insertSelective(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    List<Repair> selectByExample(RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    Repair selectByPrimaryKey(String repairId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    int updateByPrimaryKeySelective(Repair record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_repair
     *
     * @mbg.generated Wed Oct 03 15:20:59 CST 2018
     */
    int updateByPrimaryKey(Repair record);
}
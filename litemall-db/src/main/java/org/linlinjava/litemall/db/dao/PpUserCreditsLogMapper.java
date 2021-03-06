package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.PpUserCreditsLog;
import org.linlinjava.litemall.db.domain.PpUserCreditsLogExample;

public interface PpUserCreditsLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    long countByExample(PpUserCreditsLogExample example);

    int countByToday(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    int deleteByExample(PpUserCreditsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    int insert(PpUserCreditsLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    int insertSelective(PpUserCreditsLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    PpUserCreditsLog selectOneByExample(PpUserCreditsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    PpUserCreditsLog selectOneByExampleSelective(@Param("example") PpUserCreditsLogExample example, @Param("selective") PpUserCreditsLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    List<PpUserCreditsLog> selectByExampleSelective(@Param("example") PpUserCreditsLogExample example, @Param("selective") PpUserCreditsLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    List<PpUserCreditsLog> selectByExample(PpUserCreditsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    PpUserCreditsLog selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") PpUserCreditsLog.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    PpUserCreditsLog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PpUserCreditsLog record, @Param("example") PpUserCreditsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PpUserCreditsLog record, @Param("example") PpUserCreditsLogExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PpUserCreditsLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits_log
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PpUserCreditsLog record);
}

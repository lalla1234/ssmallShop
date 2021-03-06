package org.linlinjava.litemall.db.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.linlinjava.litemall.db.domain.PpUserCredits;
import org.linlinjava.litemall.db.domain.PpUserCreditsExample;

public interface PpUserCreditsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    long countByExample(PpUserCreditsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    int deleteByExample(PpUserCreditsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    int insert(PpUserCredits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    int insertSelective(PpUserCredits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    PpUserCredits selectOneByExample(PpUserCreditsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    PpUserCredits selectOneByExampleSelective(@Param("example") PpUserCreditsExample example, @Param("selective") PpUserCredits.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    List<PpUserCredits> selectByExampleSelective(@Param("example") PpUserCreditsExample example, @Param("selective") PpUserCredits.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    List<PpUserCredits> selectByExample(PpUserCreditsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    PpUserCredits selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") PpUserCredits.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    PpUserCredits selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") PpUserCredits record, @Param("example") PpUserCreditsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") PpUserCredits record, @Param("example") PpUserCreditsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(PpUserCredits record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pp_user_credits
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(PpUserCredits record);
}
package jp.co.fbsc.salessupport.mapper;

import java.util.List;
import java.util.Map;

import jp.co.fbsc.salessupport.model.TOrderManage;
import jp.co.fbsc.salessupport.model.TOrderManageExample;
import org.apache.ibatis.annotations.Param;

public interface TOrderManageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_order_manage
     *
     * @mbg.generated Thu Jun 06 21:37:49 ICT 2024
     */
    long countByExample(TOrderManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_order_manage
     *
     * @mbg.generated Thu Jun 06 21:37:49 ICT 2024
     */
    int deleteByExample(TOrderManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_order_manage
     *
     * @mbg.generated Thu Jun 06 21:37:49 ICT 2024
     */
    int insert(TOrderManage row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_order_manage
     *
     * @mbg.generated Thu Jun 06 21:37:49 ICT 2024
     */
    int insertSelective(TOrderManage row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_order_manage
     *
     * @mbg.generated Thu Jun 06 21:37:49 ICT 2024
     */
    List<TOrderManage> selectByExample(TOrderManageExample example);
    List<TOrderManage> selectAll();
    List<String> keySearch();
    List<TOrderManage> selectByKey(@Param("key")String key,@Param("value") String value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_order_manage
     *
     * @mbg.generated Thu Jun 06 21:37:49 ICT 2024
     */
    int updateByExampleSelective(@Param("row") TOrderManage row, @Param("example") TOrderManageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.t_order_manage
     *
     * @mbg.generated Thu Jun 06 21:37:49 ICT 2024
     */
    int updateByExample(@Param("row") TOrderManage row, @Param("example") TOrderManageExample example);
}
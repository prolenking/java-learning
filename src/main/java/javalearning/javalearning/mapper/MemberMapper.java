package javalearning.javalearning.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import javalearning.javalearning.entity.LibMember;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
public interface MemberMapper extends BaseMapper<LibMember> {

    /**
     * 通过用户id查询用户信息
     *
     * @param id
     * @return
     */
    LibMember selectMemberById(@Param("id") Long id);

    /**
     * 通过关键字模糊查询用户
     *
     * @param libMemberQueryVO
     * @param id
     * @return
     */
    List<LibMemberVO> query(@Param("LMQVO") LibMemberQueryVO libMemberQueryVO, @Param("libId") Long id);

    /**
     * 修改用户信息
     *
     * @param libMemberVO
     */
    void update(@Param("LMVO") LibMemberVO libMemberVO);

    /**
     * 逻辑删除用户:将deleted字段设置为true，不删除记录
     *
     * @param id
     */
    void logicDelete(@Param("id") Long id);

    LibMemberVO queryForDetails(@Param("id") Long id);
}

package javalearning.javalearning.mapper;

import javalearning.javalearning.entity.LibMember;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
@Mapper
public interface MemberMapper {
    /**
     * 插入新用户
     *
     * @param mvo
     * @param libId
     */
    void add(@Param("MIVO") MemberInsertVO mvo, @Param("libId") Long libId);

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
    LibMemberVO query(@Param("LMQVO") LibMemberQueryVO libMemberQueryVO, @Param("libId") Long id);

    /**
     * 修改用户信息
     *
     * @param libMemberVO
     */
    void update(@Param("LMVO") LibMemberVO libMemberVO);
}

package javalearning.javalearning.service;

import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
public interface LibMemberService {

    /**
     * 新增用户方法
     *
     * @param memberInsertVO
     * @param libId
     * @return
     */
    Boolean add(MemberInsertVO memberInsertVO, Long libId);

    /**
     * 模糊查询
     *
     * @param libMemberQueryVO
     * @param libId
     * @return
     */
    LibMemberVO query(LibMemberQueryVO libMemberQueryVO, Long libId);

    /**
     * 修改用户信息方法
     *
     * @param libMemberVO
     * @return
     */
    Boolean update(LibMemberVO libMemberVO);

    /**
     * 逻辑删除用户
     *
     * @param id
     * @return
     */
    Boolean delete(Long id);
}

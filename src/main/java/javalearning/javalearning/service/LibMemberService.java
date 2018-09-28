package javalearning.javalearning.service;

import javalearning.javalearning.pojo.vo.lib.member.LibBookMemberDetailVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;

import java.util.List;

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
    Integer add(MemberInsertVO memberInsertVO, Long libId);

    /**
     * 模糊查询
     *
     * @param libMemberQueryVO
     * @param libId
     * @return
     */
    List<LibMemberVO> query(LibMemberQueryVO libMemberQueryVO, Long libId);

    /**
     * 修改用户信息方法
     *
     * @param libMemberVO
     * @return
     */
    Integer update(LibMemberVO libMemberVO);

    /**
     * 逻辑删除用户
     *
     * @param id
     * @return
     */
    Boolean delete(Long id);

    /**
     * 查询用户详细信息，包括用户的基本信息和所借图书信息
     *
     * @param id
     * @return
     */
    LibMemberVO queryMemberDetails(Long id);

    /**
     * 搜索借过对应书的用户信息
     *
     * @param bId
     * @param libId
     * @return
     */
    List<LibBookMemberDetailVO> selectMemberInfoByBookId(Long bId, Long libId);
}

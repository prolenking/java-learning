package javalearning.javalearning.service.serviceimpl;

import javalearning.javalearning.common.base.BaseServiceImpl;
import javalearning.javalearning.mapper.MemberMapper;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;
import javalearning.javalearning.service.LibMemberService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhouzhiwei
 * @Date: 2018/8/21
 * @Time: 10:03
 */
@Service
public class LibMemberServiceImpl extends BaseServiceImpl<MemberMapper> implements LibMemberService {

    @Override
    public Integer add(MemberInsertVO memberInsertVO, Long libId) {
        this.addInsertCommonField(memberInsertVO, libId);
        memberInsertVO.setLibId(libId);
        return super.baseMapper.insert(memberInsertVO);
    }

    @Override
    public List<LibMemberVO> query(LibMemberQueryVO libMemberQueryVO, Long libId) {
        return this.baseMapper.query(libMemberQueryVO, libId);
    }

    @Override
    public Integer update(LibMemberVO libMemberVO) {
        return this.baseMapper.updateById(libMemberVO);
    }

    @Override
    public Boolean delete(Long id) {
        this.baseMapper.logicDelete(id);
        return true;
    }

    @Override
    public LibMemberVO queryMemberDetails(Long id) {
        return this.baseMapper.queryForDetails(id);
    }

    @Override
    public List<LibMemberVO> selectMemberInfoByBookId(Long bId, Long libId) {
        return this.baseMapper.selectMemberInfoByBookId(bId,libId);
    }
}

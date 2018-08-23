package javalearning.javalearning.service.serviceImpl;

import javalearning.javalearning.common.base.BaseServiceImpl;
import javalearning.javalearning.mapper.MemberMapper;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;
import javalearning.javalearning.service.LibMemberService;
import org.springframework.stereotype.Service;

@Service
public class LibMemberServiceImpl extends BaseServiceImpl<MemberMapper> implements LibMemberService {

    @Override
    public Boolean add(MemberInsertVO memberInsertVO, Long libId) {
        this.addInsertCommonField(memberInsertVO, libId);
        this.baseMapper.add(memberInsertVO, libId);
        return true;
    }

    @Override
    public LibMemberVO query(LibMemberQueryVO libMemberQueryVO, Long libId) {
        return this.baseMapper.query(libMemberQueryVO, libId);
    }
}

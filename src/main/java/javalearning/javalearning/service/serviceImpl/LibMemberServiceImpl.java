package javalearning.javalearning.service.serviceImpl;

import javalearning.javalearning.common.base.BaseServiceImpl;
import javalearning.javalearning.entity.LibMember;
import javalearning.javalearning.mapper.MemberMapper;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;
import javalearning.javalearning.service.LibMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibMemberServiceImpl extends BaseServiceImpl<LibMember> implements LibMemberService {
    @Autowired
    private MemberMapper memberMapper;

    @Override
    public Boolean add(MemberInsertVO memberInsertVO, Long libId) {
        this.addInsertCommonField(memberInsertVO, libId);
        memberMapper.insert(memberInsertVO, libId);
        return true;
    }

    @Override
    public LibMemberVO query(LibMemberQueryVO libMemberQueryVO, Long libId) {
        return memberMapper.query(libMemberQueryVO, libId);
    }
}

package javalearning.javalearning.service;

import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;


public interface LibMemberService {
    Boolean add(MemberInsertVO memberInsertVO, Long libId);

    LibMemberVO query(LibMemberQueryVO libMemberQueryVO, Long libId);
}

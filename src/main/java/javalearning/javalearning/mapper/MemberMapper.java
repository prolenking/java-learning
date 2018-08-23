package javalearning.javalearning.mapper;

import javalearning.javalearning.entity.LibMember;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberQueryVO;
import javalearning.javalearning.pojo.vo.lib.member.LibMemberVO;
import javalearning.javalearning.pojo.vo.lib.member.MemberInsertVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {
    void add(@Param("MIVO") MemberInsertVO mvo, @Param("libId") Long libId);

    LibMember selectMemberById(@Param("id") Long id);

    LibMemberVO query(@Param("LMQVO") LibMemberQueryVO libMemberQueryVO, @Param("libId") Long id);
}

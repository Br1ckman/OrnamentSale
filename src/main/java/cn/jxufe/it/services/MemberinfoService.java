package cn.jxufe.it.services;

import cn.jxufe.it.entity.Memberinfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface MemberinfoService {

    void insertMemberinfo(Memberinfo memberinfo);

    void deleteMemberinfoByMemberId(Integer memberId);

    void updateMemberinfo(Memberinfo memberinfo);

    Page<Memberinfo> searchMemberinfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

    List<Memberinfo> searchMemberinfoByParams(@Param("map") Map<String, String> map);
}

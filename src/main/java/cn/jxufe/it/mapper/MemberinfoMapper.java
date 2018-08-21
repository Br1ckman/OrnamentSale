package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.Memberinfo;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface MemberinfoMapper {

	void insertMemberinfo(Memberinfo memberinfo);

	void deleteMemberinfoByMemberId(Integer memberId);

	void updateMemberinfo(Memberinfo memberinfo);

	Page<Memberinfo> searchMemberinfoByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Memberinfo> searchMemberinfoByParams(@Param("map") Map<String, String> map);

} 

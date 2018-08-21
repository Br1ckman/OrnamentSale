package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.Memberaddress;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface MemberaddressMapper {

	void insertMemberaddress(Memberaddress memberaddress);

	void deleteMemberaddressByAddressid(Integer addressid);

	void updateMemberaddress(Memberaddress memberaddress);

	Page<Memberaddress> searchMemberaddressByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Memberaddress> searchMemberaddressByParams(@Param("map") Map<String, String> map);

} 

package cn.jxufe.it.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import cn.jxufe.it.entity.Admin;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;

public interface AdminMapper {

	void insertAdmin(Admin admin);

	void deleteAdminByAdminId(Integer adminId);

	void updateAdmin(Admin admin);

	Page<Admin> searchAdminByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Admin> searchAdminByParams(@Param("map") Map<String, String> map);

} 

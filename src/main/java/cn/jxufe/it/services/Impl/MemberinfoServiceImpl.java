package cn.jxufe.it.services.Impl;

import cn.jxufe.it.entity.Memberinfo;
import cn.jxufe.it.mapper.MemberinfoMapper;
import cn.jxufe.it.services.MemberinfoService;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class MemberinfoServiceImpl implements MemberinfoService {

    @Resource
    private MemberinfoMapper mm;

    @Override
    public void insertMemberinfo(Memberinfo memberinfo) {
        mm.insertMemberinfo(memberinfo);
    }

    @Override
    public void deleteMemberinfoByMemberId(Integer memberId) {
        mm.deleteMemberinfoByMemberId(memberId);
    }

    @Override
    public void updateMemberinfo(Memberinfo memberinfo) {
        mm.updateMemberinfo(memberinfo);
    }

    @Override
    public Page<Memberinfo> searchMemberinfoByParams(Map<String, String> map, Pageable pageable) {
        return mm.searchMemberinfoByParams(map,pageable);
    }

    @Override
    public List<Memberinfo> searchMemberinfoByParams(Map<String, String> map) {
        return mm.searchMemberinfoByParams(map);
    }
}

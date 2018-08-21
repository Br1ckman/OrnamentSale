package cn.jxufe.it.services.Impl;

import cn.jxufe.it.entity.Advertisement;
import cn.jxufe.it.mapper.AdvertisementMapper;
import cn.jxufe.it.services.AdvertisementService;
import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class AdvertisementServiceImpl implements AdvertisementService {

    @Resource
    private AdvertisementMapper advm;

    @Override
    public void insertAdvertisement(Advertisement advertisement) {
        advm.insertAdvertisement(advertisement);
    }

    @Override
    public void deleteAdvertisementByAdvId(Integer advId) {
        advm.deleteAdvertisementByAdvId(advId);
    }

    @Override
    public void updateAdvertisement(Advertisement advertisement) {
        advm.updateAdvertisement(advertisement);
    }

    @Override
    public Page<Advertisement> searchAdvertisementByParams(Map<String, String> map, Pageable pageable) {
        return advm.searchAdvertisementByParams(map,pageable);
    }

    @Override
    public List<Advertisement> searchAdvertisementByParams(Map<String, String> map) {
        return advm.searchAdvertisementByParams(map);
    }
}

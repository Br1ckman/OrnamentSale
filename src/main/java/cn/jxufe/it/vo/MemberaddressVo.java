package cn.jxufe.it.vo;

/**
 * 
 * @author 666
 */
public class MemberaddressVo {
	/**
	 *  主键
	 */
	private Integer addressid;
	/**
	 *  省名字
	 */
	private String provinceName;
	/**
	 *  城市名字
	 */
	private String cityName;
	/**
	 *  区域名字
	 */
	private String areaName;
	/**
	 *  详细地址
	 */
	private String detailaddress;
	/**
	 *  所属会员
	 */
	private Integer memberId;
	/**
	 *  是否默认
	 */
	private Integer isdefault;
	/**
	 * 主键
	 * @param addressid
	 */
	public void setAddressid(Integer addressid){
		this.addressid = addressid;
	}
	
    /**
     * 主键
     * @return Integer
     */	
    public Integer getAddressid(){
    	return addressid;
    }
	/**
	 * 省名字
	 * @param provinceName
	 */
	public void setProvinceName(String provinceName){
		this.provinceName = provinceName;
	}
	
    /**
     * 省名字
     * @return String
     */	
    public String getProvinceName(){
    	return provinceName;
    }
	/**
	 * 城市名字
	 * @param cityName
	 */
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	
    /**
     * 城市名字
     * @return String
     */	
    public String getCityName(){
    	return cityName;
    }
	/**
	 * 区域名字
	 * @param areaName
	 */
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	
    /**
     * 区域名字
     * @return String
     */	
    public String getAreaName(){
    	return areaName;
    }
	/**
	 * 详细地址
	 * @param detailaddress
	 */
	public void setDetailaddress(String detailaddress){
		this.detailaddress = detailaddress;
	}
	
    /**
     * 详细地址
     * @return String
     */	
    public String getDetailaddress(){
    	return detailaddress;
    }
	/**
	 * 所属会员
	 * @param memberId
	 */
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	
    /**
     * 所属会员
     * @return Integer
     */	
    public Integer getMemberId(){
    	return memberId;
    }
	/**
	 * 是否默认
	 * @param isdefault
	 */
	public void setIsdefault(Integer isdefault){
		this.isdefault = isdefault;
	}
	
    /**
     * 是否默认
     * @return Integer
     */	
    public Integer getIsdefault(){
    	return isdefault;
    }
}
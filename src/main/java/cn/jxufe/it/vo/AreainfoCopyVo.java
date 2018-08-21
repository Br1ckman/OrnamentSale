package cn.jxufe.it.vo;

/**
 * 
 * @author 666
 */
public class AreainfoCopyVo {
	/**
	 *  索引ID
	 */
	private Integer areaId;
	/**
	 *  地区名称
	 */
	private String areaName;
	/**
	 *  地区父ID
	 */
	private Integer areaParentId;
	/**
	 *  排序
	 */
	private Byte areaSort;
	/**
	 *  地区深度，从1开始
	 */
	private Boolean areaDeep;
	/**
	 *  字母索引
	 */
	private String groupid;
	/**
	 *  创建时间
	 */
	private Long createTime;
	/**
	 *  修改时间
	 */
	private Long updateTime;
	/**
	 *  是否热门（1代表热门城市）
	 */
	private Integer isHot;
	/**
	 * 索引ID
	 * @param areaId
	 */
	public void setAreaId(Integer areaId){
		this.areaId = areaId;
	}
	
    /**
     * 索引ID
     * @return Integer
     */	
    public Integer getAreaId(){
    	return areaId;
    }
	/**
	 * 地区名称
	 * @param areaName
	 */
	public void setAreaName(String areaName){
		this.areaName = areaName;
	}
	
    /**
     * 地区名称
     * @return String
     */	
    public String getAreaName(){
    	return areaName;
    }
	/**
	 * 地区父ID
	 * @param areaParentId
	 */
	public void setAreaParentId(Integer areaParentId){
		this.areaParentId = areaParentId;
	}
	
    /**
     * 地区父ID
     * @return Integer
     */	
    public Integer getAreaParentId(){
    	return areaParentId;
    }
	/**
	 * 排序
	 * @param areaSort
	 */
	public void setAreaSort(Byte areaSort){
		this.areaSort = areaSort;
	}
	
    /**
     * 排序
     * @return Byte
     */	
    public Byte getAreaSort(){
    	return areaSort;
    }
	/**
	 * 地区深度，从1开始
	 * @param areaDeep
	 */
	public void setAreaDeep(Boolean areaDeep){
		this.areaDeep = areaDeep;
	}
	
    /**
     * 地区深度，从1开始
     * @return Boolean
     */	
    public Boolean getAreaDeep(){
    	return areaDeep;
    }
	/**
	 * 字母索引
	 * @param groupid
	 */
	public void setGroupid(String groupid){
		this.groupid = groupid;
	}
	
    /**
     * 字母索引
     * @return String
     */	
    public String getGroupid(){
    	return groupid;
    }
	/**
	 * 创建时间
	 * @param createTime
	 */
	public void setCreateTime(Long createTime){
		this.createTime = createTime;
	}
	
    /**
     * 创建时间
     * @return Long
     */	
    public Long getCreateTime(){
    	return createTime;
    }
	/**
	 * 修改时间
	 * @param updateTime
	 */
	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}
	
    /**
     * 修改时间
     * @return Long
     */	
    public Long getUpdateTime(){
    	return updateTime;
    }
	/**
	 * 是否热门（1代表热门城市）
	 * @param isHot
	 */
	public void setIsHot(Integer isHot){
		this.isHot = isHot;
	}
	
    /**
     * 是否热门（1代表热门城市）
     * @return Integer
     */	
    public Integer getIsHot(){
    	return isHot;
    }
}
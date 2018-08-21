package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class GoodsCategory {
	/**
	 *  主键ID
	 */
	private Integer catId;
	/**
	 *  分类名称
	 */
	private String catName;
	/**
	 *  排序
	 */
	private Integer sort;
	/**
	 *  描述
	 */
	private String description;
	/**
	 *  类名是否禁用 0禁用。1表示启用
	 */
	private Integer isOffline;
	/**
	 *  
	 */
	private java.util.Date createdTime;
	/**
	 *  更新时间(自更新)
	 */
	private java.util.Date updatedTime;
	/**
	 * 主键ID
	 * @param catId
	 */
	public void setCatId(Integer catId){
		this.catId = catId;
	}
	
    /**
     * 主键ID
     * @return
     */	
    public Integer getCatId(){
    	return catId;
    }
	/**
	 * 分类名称
	 * @param catName
	 */
	public void setCatName(String catName){
		this.catName = catName;
	}
	
    /**
     * 分类名称
     * @return
     */	
    public String getCatName(){
    	return catName;
    }
	/**
	 * 排序
	 * @param sort
	 */
	public void setSort(Integer sort){
		this.sort = sort;
	}
	
    /**
     * 排序
     * @return
     */	
    public Integer getSort(){
    	return sort;
    }
	/**
	 * 描述
	 * @param description
	 */
	public void setDescription(String description){
		this.description = description;
	}
	
    /**
     * 描述
     * @return
     */	
    public String getDescription(){
    	return description;
    }
	/**
	 * 类名是否禁用 0禁用。1表示启用
	 * @param isOffline
	 */
	public void setIsOffline(Integer isOffline){
		this.isOffline = isOffline;
	}
	
    /**
     * 类名是否禁用 0禁用。1表示启用
     * @return
     */	
    public Integer getIsOffline(){
    	return isOffline;
    }
	/**
	 * 
	 * @param createdTime
	 */
	public void setCreatedTime(java.util.Date createdTime){
		this.createdTime = createdTime;
	}
	
    /**
     * 
     * @return
     */	
    public java.util.Date getCreatedTime(){
    	return createdTime;
    }
	/**
	 * 更新时间(自更新)
	 * @param updatedTime
	 */
	public void setUpdatedTime(java.util.Date updatedTime){
		this.updatedTime = updatedTime;
	}
	
    /**
     * 更新时间(自更新)
     * @return
     */	
    public java.util.Date getUpdatedTime(){
    	return updatedTime;
    }
}
package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class Admin {
	/**
	 *  管理员ID
	 */
	private Integer adminId;
	/**
	 *  管理员名称
	 */
	private String adminName;
	/**
	 *  管理员密码
	 */
	private String adminPassword;
	/**
	 *  登录次数
	 */
	private Integer adminLoginNum;
	/**
	 *  是否超级管理员
	 */
	private Integer adminIsSuper;
	/**
	 *  是否禁用
	 */
	private Integer isDisable;
	/**
	 *  登录时间
	 */
	private java.util.Date adminLoginTime;
	/**
	 *  创建时间
	 */
	private java.util.Date createdTime;
	/**
	 *  修改时间
	 */
	private java.util.Date updatedTime;
	/**
	 * 管理员ID
	 * @param adminId
	 */
	public void setAdminId(Integer adminId){
		this.adminId = adminId;
	}
	
    /**
     * 管理员ID
     * @return
     */	
    public Integer getAdminId(){
    	return adminId;
    }
	/**
	 * 管理员名称
	 * @param adminName
	 */
	public void setAdminName(String adminName){
		this.adminName = adminName;
	}
	
    /**
     * 管理员名称
     * @return
     */	
    public String getAdminName(){
    	return adminName;
    }
	/**
	 * 管理员密码
	 * @param adminPassword
	 */
	public void setAdminPassword(String adminPassword){
		this.adminPassword = adminPassword;
	}
	
    /**
     * 管理员密码
     * @return
     */	
    public String getAdminPassword(){
    	return adminPassword;
    }
	/**
	 * 登录次数
	 * @param adminLoginNum
	 */
	public void setAdminLoginNum(Integer adminLoginNum){
		this.adminLoginNum = adminLoginNum;
	}
	
    /**
     * 登录次数
     * @return
     */	
    public Integer getAdminLoginNum(){
    	return adminLoginNum;
    }
	/**
	 * 是否超级管理员
	 * @param adminIsSuper
	 */
	public void setAdminIsSuper(Integer adminIsSuper){
		this.adminIsSuper = adminIsSuper;
	}
	
    /**
     * 是否超级管理员
     * @return
     */	
    public Integer getAdminIsSuper(){
    	return adminIsSuper;
    }
	/**
	 * 是否禁用
	 * @param isDisable
	 */
	public void setIsDisable(Integer isDisable){
		this.isDisable = isDisable;
	}
	
    /**
     * 是否禁用
     * @return
     */	
    public Integer getIsDisable(){
    	return isDisable;
    }
	/**
	 * 登录时间
	 * @param adminLoginTime
	 */
	public void setAdminLoginTime(java.util.Date adminLoginTime){
		this.adminLoginTime = adminLoginTime;
	}
	
    /**
     * 登录时间
     * @return
     */	
    public java.util.Date getAdminLoginTime(){
    	return adminLoginTime;
    }
	/**
	 * 创建时间
	 * @param createdTime
	 */
	public void setCreatedTime(java.util.Date createdTime){
		this.createdTime = createdTime;
	}
	
    /**
     * 创建时间
     * @return
     */	
    public java.util.Date getCreatedTime(){
    	return createdTime;
    }
	/**
	 * 修改时间
	 * @param updatedTime
	 */
	public void setUpdatedTime(java.util.Date updatedTime){
		this.updatedTime = updatedTime;
	}
	
    /**
     * 修改时间
     * @return
     */	
    public java.util.Date getUpdatedTime(){
    	return updatedTime;
    }
}
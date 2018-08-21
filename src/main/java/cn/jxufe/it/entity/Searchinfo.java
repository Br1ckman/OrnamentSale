package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class Searchinfo {
	/**
	 *  主键
	 */
	private Integer SId;
	/**
	 *  所属关键字
	 */
	private String searchKey;
	/**
	 *  会员ID
	 */
	private Integer memberId;
	/**
	 *  搜索时间
	 */
	private java.util.Date searchTime;
	/**
	 * 主键
	 * @param SId
	 */
	public void setSId(Integer SId){
		this.SId = SId;
	}
	
    /**
     * 主键
     * @return
     */	
    public Integer getSId(){
    	return SId;
    }
	/**
	 * 所属关键字
	 * @param searchKey
	 */
	public void setSearchKey(String searchKey){
		this.searchKey = searchKey;
	}
	
    /**
     * 所属关键字
     * @return
     */	
    public String getSearchKey(){
    	return searchKey;
    }
	/**
	 * 会员ID
	 * @param memberId
	 */
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	
    /**
     * 会员ID
     * @return
     */	
    public Integer getMemberId(){
    	return memberId;
    }
	/**
	 * 搜索时间
	 * @param searchTime
	 */
	public void setSearchTime(java.util.Date searchTime){
		this.searchTime = searchTime;
	}
	
    /**
     * 搜索时间
     * @return
     */	
    public java.util.Date getSearchTime(){
    	return searchTime;
    }
}
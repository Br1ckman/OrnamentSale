package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class GoodsComment {
	/**
	 *  评论id
	 */
	private Integer scommId;
	/**
	 *  评论的商品ID
	 */
	private Integer goodisId;
	/**
	 *  评论内容
	 */
	private String scommContent;
	/**
	 *  会员id
	 */
	private Integer scommMemberid;
	/**
	 *  会员名称
	 */
	private String scommMembername;
	/**
	 *  会员头像
	 */
	private String scommMemberavatar;
	/**
	 *  评论时间
	 */
	private String scommTime;
	/**
	 *  创建时间
	 */
	private Long createTime;
	/**
	 *  修改时间
	 */
	private Long updateTime;
	/**
	 * 评论id
	 * @param scommId
	 */
	public void setScommId(Integer scommId){
		this.scommId = scommId;
	}
	
    /**
     * 评论id
     * @return
     */	
    public Integer getScommId(){
    	return scommId;
    }
	/**
	 * 评论的商品ID
	 * @param goodisId
	 */
	public void setGoodisId(Integer goodisId){
		this.goodisId = goodisId;
	}
	
    /**
     * 评论的商品ID
     * @return
     */	
    public Integer getGoodisId(){
    	return goodisId;
    }
	/**
	 * 评论内容
	 * @param scommContent
	 */
	public void setScommContent(String scommContent){
		this.scommContent = scommContent;
	}
	
    /**
     * 评论内容
     * @return
     */	
    public String getScommContent(){
    	return scommContent;
    }
	/**
	 * 会员id
	 * @param scommMemberid
	 */
	public void setScommMemberid(Integer scommMemberid){
		this.scommMemberid = scommMemberid;
	}
	
    /**
     * 会员id
     * @return
     */	
    public Integer getScommMemberid(){
    	return scommMemberid;
    }
	/**
	 * 会员名称
	 * @param scommMembername
	 */
	public void setScommMembername(String scommMembername){
		this.scommMembername = scommMembername;
	}
	
    /**
     * 会员名称
     * @return
     */	
    public String getScommMembername(){
    	return scommMembername;
    }
	/**
	 * 会员头像
	 * @param scommMemberavatar
	 */
	public void setScommMemberavatar(String scommMemberavatar){
		this.scommMemberavatar = scommMemberavatar;
	}
	
    /**
     * 会员头像
     * @return
     */	
    public String getScommMemberavatar(){
    	return scommMemberavatar;
    }
	/**
	 * 评论时间
	 * @param scommTime
	 */
	public void setScommTime(String scommTime){
		this.scommTime = scommTime;
	}
	
    /**
     * 评论时间
     * @return
     */	
    public String getScommTime(){
    	return scommTime;
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
     * @return
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
     * @return
     */	
    public Long getUpdateTime(){
    	return updateTime;
    }
}
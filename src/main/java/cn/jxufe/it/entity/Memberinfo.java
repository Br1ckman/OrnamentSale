package cn.jxufe.it.entity;

/**
 * 
 * @author 666
 */
public class Memberinfo {
	/**
	 *  会员id
	 */
	private Integer memberId;
	/**
	 *  手机号
	 */
	private String memberMobile;
	/**
	 *  会员昵称
	 */
	private String memberName;
	/**
	 *  生日
	 */
	private java.util.Date memberBirthday;
	/**
	 *  会员密码
	 */
	private String memberPasswd;
	/**
	 *  会员邮箱
	 */
	private String memberEmail;
	/**
	 *  微信OPENDID
	 */
	private String memberWw;
	/**
	 *  登录次数
	 */
	private Integer memberLoginNum;
	/**
	 *  会员注册时间
	 */
	private java.util.Date createTime;
	/**
	 *  当前登录时间
	 */
	private java.util.Date memberLoginTime;
	/**
	 *  上次登录时间
	 */
	private java.util.Date memberOldLoginTime;
	/**
	 *  当前登录ip
	 */
	private String memberLoginIp;
	/**
	 *  上次登录ip
	 */
	private String memberOldLoginIp;
	/**
	 *  会员是否有发布商品权限 1为开启 0为关闭
	 */
	private Boolean isSell;
	/**
	 *  会员的开启状态 1为开启 0为关闭
	 */
	private Boolean memberState;
	/**
	 *  会员头像
	 */
	private String memberPic;
	/**
	 * 会员id
	 * @param memberId
	 */
	public void setMemberId(Integer memberId){
		this.memberId = memberId;
	}
	
    /**
     * 会员id
     * @return
     */	
    public Integer getMemberId(){
    	return memberId;
    }
	/**
	 * 手机号
	 * @param memberMobile
	 */
	public void setMemberMobile(String memberMobile){
		this.memberMobile = memberMobile;
	}
	
    /**
     * 手机号
     * @return
     */	
    public String getMemberMobile(){
    	return memberMobile;
    }
	/**
	 * 会员昵称
	 * @param memberName
	 */
	public void setMemberName(String memberName){
		this.memberName = memberName;
	}
	
    /**
     * 会员昵称
     * @return
     */	
    public String getMemberName(){
    	return memberName;
    }
	/**
	 * 生日
	 * @param memberBirthday
	 */
	public void setMemberBirthday(java.util.Date memberBirthday){
		this.memberBirthday = memberBirthday;
	}
	
    /**
     * 生日
     * @return
     */	
    public java.util.Date getMemberBirthday(){
    	return memberBirthday;
    }
	/**
	 * 会员密码
	 * @param memberPasswd
	 */
	public void setMemberPasswd(String memberPasswd){
		this.memberPasswd = memberPasswd;
	}
	
    /**
     * 会员密码
     * @return
     */	
    public String getMemberPasswd(){
    	return memberPasswd;
    }
	/**
	 * 会员邮箱
	 * @param memberEmail
	 */
	public void setMemberEmail(String memberEmail){
		this.memberEmail = memberEmail;
	}
	
    /**
     * 会员邮箱
     * @return
     */	
    public String getMemberEmail(){
    	return memberEmail;
    }
	/**
	 * 微信OPENDID
	 * @param memberWw
	 */
	public void setMemberWw(String memberWw){
		this.memberWw = memberWw;
	}
	
    /**
     * 微信OPENDID
     * @return
     */	
    public String getMemberWw(){
    	return memberWw;
    }
	/**
	 * 登录次数
	 * @param memberLoginNum
	 */
	public void setMemberLoginNum(Integer memberLoginNum){
		this.memberLoginNum = memberLoginNum;
	}
	
    /**
     * 登录次数
     * @return
     */	
    public Integer getMemberLoginNum(){
    	return memberLoginNum;
    }
	/**
	 * 会员注册时间
	 * @param createTime
	 */
	public void setCreateTime(java.util.Date createTime){
		this.createTime = createTime;
	}
	
    /**
     * 会员注册时间
     * @return
     */	
    public java.util.Date getCreateTime(){
    	return createTime;
    }
	/**
	 * 当前登录时间
	 * @param memberLoginTime
	 */
	public void setMemberLoginTime(java.util.Date memberLoginTime){
		this.memberLoginTime = memberLoginTime;
	}
	
    /**
     * 当前登录时间
     * @return
     */	
    public java.util.Date getMemberLoginTime(){
    	return memberLoginTime;
    }
	/**
	 * 上次登录时间
	 * @param memberOldLoginTime
	 */
	public void setMemberOldLoginTime(java.util.Date memberOldLoginTime){
		this.memberOldLoginTime = memberOldLoginTime;
	}
	
    /**
     * 上次登录时间
     * @return
     */	
    public java.util.Date getMemberOldLoginTime(){
    	return memberOldLoginTime;
    }
	/**
	 * 当前登录ip
	 * @param memberLoginIp
	 */
	public void setMemberLoginIp(String memberLoginIp){
		this.memberLoginIp = memberLoginIp;
	}
	
    /**
     * 当前登录ip
     * @return
     */	
    public String getMemberLoginIp(){
    	return memberLoginIp;
    }
	/**
	 * 上次登录ip
	 * @param memberOldLoginIp
	 */
	public void setMemberOldLoginIp(String memberOldLoginIp){
		this.memberOldLoginIp = memberOldLoginIp;
	}
	
    /**
     * 上次登录ip
     * @return
     */	
    public String getMemberOldLoginIp(){
    	return memberOldLoginIp;
    }
	/**
	 * 会员是否有发布商品权限 1为开启 0为关闭
	 * @param isSell
	 */
	public void setIsSell(Boolean isSell){
		this.isSell = isSell;
	}
	
    /**
     * 会员是否有发布商品权限 1为开启 0为关闭
     * @return
     */	
    public Boolean getIsSell(){
    	return isSell;
    }
	/**
	 * 会员的开启状态 1为开启 0为关闭
	 * @param memberState
	 */
	public void setMemberState(Boolean memberState){
		this.memberState = memberState;
	}
	
    /**
     * 会员的开启状态 1为开启 0为关闭
     * @return
     */	
    public Boolean getMemberState(){
    	return memberState;
    }
	/**
	 * 会员头像
	 * @param memberPic
	 */
	public void setMemberPic(String memberPic){
		this.memberPic = memberPic;
	}
	
    /**
     * 会员头像
     * @return
     */	
    public String getMemberPic(){
    	return memberPic;
    }
}
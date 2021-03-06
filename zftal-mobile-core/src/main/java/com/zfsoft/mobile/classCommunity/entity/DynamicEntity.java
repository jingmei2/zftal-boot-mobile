package com.zfsoft.mobile.classCommunity.entity;

import java.util.List;

/**
 * 帖子实体
 * @author H110MF
 *
 */
public class DynamicEntity {
	private String id;         //唯一主键
	private String content;    //内容
	private String praiseCount;//点赞
	private String createTime; //创建时间
	private String isTop;      //是否置顶
	private String type;       //1是0否
	private String publisherId;//发布人id
	private String publisherName;//发布人姓名
	private List<DynamicFileEntity> pictureList;    //图片列表
	private List<DynamicCommentEntity> commentList; //评论列表
	private String havePraise;                      //当前用户是否点过赞

	private String classId;//帖子所属圈子id

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPraiseCount() {
		return praiseCount;
	}
	public void setPraiseCount(String praiseCount) {
		this.praiseCount = praiseCount;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getIsTop() {
		return isTop;
	}
	public void setIsTop(String isTop) {
		this.isTop = isTop;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(String publisherId) {
		this.publisherId = publisherId;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public List<DynamicCommentEntity> getCommentList() {
		return commentList;
	}
	public void setCommentList(List<DynamicCommentEntity> commentList) {
		this.commentList = commentList;
	}
	public List<DynamicFileEntity> getPictureList() {
		return pictureList;
	}
	public void setPictureList(List<DynamicFileEntity> pictureList) {
		this.pictureList = pictureList;
	}
	public String getHavePraise() {
		return havePraise;
	}
	public void setHavePraise(String havePraise) {
		this.havePraise = havePraise;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}


}

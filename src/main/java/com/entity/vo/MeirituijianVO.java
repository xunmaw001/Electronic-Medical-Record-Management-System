package com.entity.vo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 每日推荐
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("meirituijian")
public class MeirituijianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 名称
     */

    @TableField(value = "meirituijian_name")
    private String meirituijianName;


    /**
     * 日期
     */

    @TableField(value = "meirituijian_time")
    private String meirituijianTime;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 详情
     */

    @TableField(value = "meirituijian_content")
    private String meirituijianContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：名称
	 */
    public String getMeirituijianName() {
        return meirituijianName;
    }


    /**
	 * 获取：名称
	 */

    public void setMeirituijianName(String meirituijianName) {
        this.meirituijianName = meirituijianName;
    }
    /**
	 * 设置：日期
	 */
    public String getMeirituijianTime() {
        return meirituijianTime;
    }


    /**
	 * 获取：日期
	 */

    public void setMeirituijianTime(String meirituijianTime) {
        this.meirituijianTime = meirituijianTime;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：详情
	 */
    public String getMeirituijianContent() {
        return meirituijianContent;
    }


    /**
	 * 获取：详情
	 */

    public void setMeirituijianContent(String meirituijianContent) {
        this.meirituijianContent = meirituijianContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

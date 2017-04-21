package com.shhxzq.fin.cif.model;

import java.math.BigDecimal;
import java.util.Date;

public class HopDailyProfit {
    /** 主键ID */
    private Long id;

    /** TA编号 */
    private String taNo;

    /** 商户号 */
    private String partnerId;

    /** 电商编号 */
    private String ecpayCode;

    /** 基金公司基金账号 */
    private String spUser;

    /** 用户在基金公司的交易账号 */
    private String spTransId;

    /** 直销银行/电商渠道的用户账户 */
    private String partnerFundNo;

    /** 总份额 */
    private BigDecimal totalUnits;

    /** 垫资方收益 */
    private BigDecimal partnerProfit;

    /** 基金代码 */
    private String fundId;

    /** 收费方式 */
    private String chargeType;

    /** D-1日的收益 */
    private BigDecimal beforeDayProfit;

    /** 产生收益的份额 */
    private BigDecimal profitUnits;

    /** 普通赎回的份额（用来展示给用户） */
    private BigDecimal redeemUnits;

    /** 自然日下发日期 */
    private String transferDate;

    /** 是否有效,0:有效，1:无效 */
    private Byte isDelete;

    /** 数据创建时间 */
    private Date createdAt;

    /** 数据更新时间 */
    private Date updatedAt;

    /**
     * 主键ID
     * @return id 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键ID
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * TA编号
     * @return ta_no TA编号
     */
    public String getTaNo() {
        return taNo;
    }

    /**
     * TA编号
     * @param taNo TA编号
     */
    public void setTaNo(String taNo) {
        this.taNo = taNo == null ? null : taNo.trim();
    }

    /**
     * 商户号
     * @return partner_id 商户号
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * 商户号
     * @param partnerId 商户号
     */
    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId == null ? null : partnerId.trim();
    }

    /**
     * 电商编号
     * @return ecpay_code 电商编号
     */
    public String getEcpayCode() {
        return ecpayCode;
    }

    /**
     * 电商编号
     * @param ecpayCode 电商编号
     */
    public void setEcpayCode(String ecpayCode) {
        this.ecpayCode = ecpayCode == null ? null : ecpayCode.trim();
    }

    /**
     * 基金公司基金账号
     * @return sp_user 基金公司基金账号
     */
    public String getSpUser() {
        return spUser;
    }

    /**
     * 基金公司基金账号
     * @param spUser 基金公司基金账号
     */
    public void setSpUser(String spUser) {
        this.spUser = spUser == null ? null : spUser.trim();
    }

    /**
     * 用户在基金公司的交易账号
     * @return sp_trans_id 用户在基金公司的交易账号
     */
    public String getSpTransId() {
        return spTransId;
    }

    /**
     * 用户在基金公司的交易账号
     * @param spTransId 用户在基金公司的交易账号
     */
    public void setSpTransId(String spTransId) {
        this.spTransId = spTransId == null ? null : spTransId.trim();
    }

    /**
     * 直销银行/电商渠道的用户账户
     * @return partner_fund_no 直销银行/电商渠道的用户账户
     */
    public String getPartnerFundNo() {
        return partnerFundNo;
    }

    /**
     * 直销银行/电商渠道的用户账户
     * @param partnerFundNo 直销银行/电商渠道的用户账户
     */
    public void setPartnerFundNo(String partnerFundNo) {
        this.partnerFundNo = partnerFundNo == null ? null : partnerFundNo.trim();
    }

    /**
     * 总份额
     * @return total_units 总份额
     */
    public BigDecimal getTotalUnits() {
        return totalUnits;
    }

    /**
     * 总份额
     * @param totalUnits 总份额
     */
    public void setTotalUnits(BigDecimal totalUnits) {
        this.totalUnits = totalUnits;
    }

    /**
     * 垫资方收益
     * @return partner_profit 垫资方收益
     */
    public BigDecimal getPartnerProfit() {
        return partnerProfit;
    }

    /**
     * 垫资方收益
     * @param partnerProfit 垫资方收益
     */
    public void setPartnerProfit(BigDecimal partnerProfit) {
        this.partnerProfit = partnerProfit;
    }

    /**
     * 基金代码
     * @return fund_id 基金代码
     */
    public String getFundId() {
        return fundId;
    }

    /**
     * 基金代码
     * @param fundId 基金代码
     */
    public void setFundId(String fundId) {
        this.fundId = fundId == null ? null : fundId.trim();
    }

    /**
     * 收费方式
     * @return charge_type 收费方式
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * 收费方式
     * @param chargeType 收费方式
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType == null ? null : chargeType.trim();
    }

    /**
     * D-1日的收益
     * @return before_day_profit D-1日的收益
     */
    public BigDecimal getBeforeDayProfit() {
        return beforeDayProfit;
    }

    /**
     * D-1日的收益
     * @param beforeDayProfit D-1日的收益
     */
    public void setBeforeDayProfit(BigDecimal beforeDayProfit) {
        this.beforeDayProfit = beforeDayProfit;
    }

    /**
     * 产生收益的份额
     * @return profit_units 产生收益的份额
     */
    public BigDecimal getProfitUnits() {
        return profitUnits;
    }

    /**
     * 产生收益的份额
     * @param profitUnits 产生收益的份额
     */
    public void setProfitUnits(BigDecimal profitUnits) {
        this.profitUnits = profitUnits;
    }

    /**
     * 普通赎回的份额（用来展示给用户）
     * @return redeem_units 普通赎回的份额（用来展示给用户）
     */
    public BigDecimal getRedeemUnits() {
        return redeemUnits;
    }

    /**
     * 普通赎回的份额（用来展示给用户）
     * @param redeemUnits 普通赎回的份额（用来展示给用户）
     */
    public void setRedeemUnits(BigDecimal redeemUnits) {
        this.redeemUnits = redeemUnits;
    }

    /**
     * 自然日下发日期
     * @return transfer_date 自然日下发日期
     */
    public String getTransferDate() {
        return transferDate;
    }

    /**
     * 自然日下发日期
     * @param transferDate 自然日下发日期
     */
    public void setTransferDate(String transferDate) {
        this.transferDate = transferDate == null ? null : transferDate.trim();
    }

    /**
     * 是否有效,0:有效，1:无效
     * @return is_delete 是否有效,0:有效，1:无效
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 是否有效,0:有效，1:无效
     * @param isDelete 是否有效,0:有效，1:无效
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 数据创建时间
     * @return created_at 数据创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 数据创建时间
     * @param createdAt 数据创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 数据更新时间
     * @return updated_at 数据更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 数据更新时间
     * @param updatedAt 数据更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
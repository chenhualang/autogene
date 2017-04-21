package com.shhxzq.fin.cif.model;

import java.math.BigDecimal;
import java.util.Date;

public class HopConfirmOrder {
    /** 主键 */
    private Integer id;

    /** 交易流水号 */
    private String tradeReqNo;

    /** 订单号 */
    private String orderNo;

    /** 外部交易流水号 */
    private String outerTransId;

    /** 交易账号 */
    private String tradeAcco;

    /** 产品ID */
    private String prodId;

    /** 申请金额 */
    private BigDecimal applyAmount;

    /** 申请份额 */
    private BigDecimal applyShare;

    /** 机构号 */
    private String companyNo;

    /** 子机构号 */
    private String subCompanyNo;

    /** 支付方式。0：现金宝 1：银行卡 2 : 第三方支付 9: 其他 */
    private String paymentType;

    /** 银行卡号 */
    private String bankAccount;

    /** 银行通道 */
    private String bankNo;

    /** 收费方式。A：前端收费 B：后端收费 （默认填 A） */
    private String chargeType;

    /**  */
    private String workDate;

    /** 业务码 */
    private String apkind;

    /** 订单状态 */
    private String orderStatus;

    /** 应答信息，订单错误信息ect。 */
    private String retMsg;

    /**  */
    private Boolean isDelete;

    /**  */
    private Date createdAt;

    /**  */
    private Date updatedAt;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 交易流水号
     * @return TRADE_REQ_NO 交易流水号
     */
    public String getTradeReqNo() {
        return tradeReqNo;
    }

    /**
     * 交易流水号
     * @param tradeReqNo 交易流水号
     */
    public void setTradeReqNo(String tradeReqNo) {
        this.tradeReqNo = tradeReqNo == null ? null : tradeReqNo.trim();
    }

    /**
     * 订单号
     * @return ORDER_NO 订单号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 订单号
     * @param orderNo 订单号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 外部交易流水号
     * @return OUTER_TRANS_ID 外部交易流水号
     */
    public String getOuterTransId() {
        return outerTransId;
    }

    /**
     * 外部交易流水号
     * @param outerTransId 外部交易流水号
     */
    public void setOuterTransId(String outerTransId) {
        this.outerTransId = outerTransId == null ? null : outerTransId.trim();
    }

    /**
     * 交易账号
     * @return TRADE_ACCO 交易账号
     */
    public String getTradeAcco() {
        return tradeAcco;
    }

    /**
     * 交易账号
     * @param tradeAcco 交易账号
     */
    public void setTradeAcco(String tradeAcco) {
        this.tradeAcco = tradeAcco == null ? null : tradeAcco.trim();
    }

    /**
     * 产品ID
     * @return PROD_ID 产品ID
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * 产品ID
     * @param prodId 产品ID
     */
    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    /**
     * 申请金额
     * @return APPLY_AMOUNT 申请金额
     */
    public BigDecimal getApplyAmount() {
        return applyAmount;
    }

    /**
     * 申请金额
     * @param applyAmount 申请金额
     */
    public void setApplyAmount(BigDecimal applyAmount) {
        this.applyAmount = applyAmount;
    }

    /**
     * 申请份额
     * @return APPLY_SHARE 申请份额
     */
    public BigDecimal getApplyShare() {
        return applyShare;
    }

    /**
     * 申请份额
     * @param applyShare 申请份额
     */
    public void setApplyShare(BigDecimal applyShare) {
        this.applyShare = applyShare;
    }

    /**
     * 机构号
     * @return COMPANY_NO 机构号
     */
    public String getCompanyNo() {
        return companyNo;
    }

    /**
     * 机构号
     * @param companyNo 机构号
     */
    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo == null ? null : companyNo.trim();
    }

    /**
     * 子机构号
     * @return SUB_COMPANY_NO 子机构号
     */
    public String getSubCompanyNo() {
        return subCompanyNo;
    }

    /**
     * 子机构号
     * @param subCompanyNo 子机构号
     */
    public void setSubCompanyNo(String subCompanyNo) {
        this.subCompanyNo = subCompanyNo == null ? null : subCompanyNo.trim();
    }

    /**
     * 支付方式。0：现金宝 1：银行卡 2 : 第三方支付 9: 其他
     * @return PAYMENT_TYPE 支付方式。0：现金宝 1：银行卡 2 : 第三方支付 9: 其他
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 支付方式。0：现金宝 1：银行卡 2 : 第三方支付 9: 其他
     * @param paymentType 支付方式。0：现金宝 1：银行卡 2 : 第三方支付 9: 其他
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    /**
     * 银行卡号
     * @return BANK_ACCOUNT 银行卡号
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * 银行卡号
     * @param bankAccount 银行卡号
     */
    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    /**
     * 银行通道
     * @return BANK_NO 银行通道
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * 银行通道
     * @param bankNo 银行通道
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    /**
     * 收费方式。A：前端收费 B：后端收费 （默认填 A）
     * @return CHARGE_TYPE 收费方式。A：前端收费 B：后端收费 （默认填 A）
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * 收费方式。A：前端收费 B：后端收费 （默认填 A）
     * @param chargeType 收费方式。A：前端收费 B：后端收费 （默认填 A）
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType == null ? null : chargeType.trim();
    }

    /**
     * 
     * @return WORK_DATE 
     */
    public String getWorkDate() {
        return workDate;
    }

    /**
     * 
     * @param workDate 
     */
    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    /**
     * 业务码
     * @return APKIND 业务码
     */
    public String getApkind() {
        return apkind;
    }

    /**
     * 业务码
     * @param apkind 业务码
     */
    public void setApkind(String apkind) {
        this.apkind = apkind == null ? null : apkind.trim();
    }

    /**
     * 订单状态
     * @return ORDER_STATUS 订单状态
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 订单状态
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus == null ? null : orderStatus.trim();
    }

    /**
     * 应答信息，订单错误信息ect。
     * @return RET_MSG 应答信息，订单错误信息ect。
     */
    public String getRetMsg() {
        return retMsg;
    }

    /**
     * 应答信息，订单错误信息ect。
     * @param retMsg 应答信息，订单错误信息ect。
     */
    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg == null ? null : retMsg.trim();
    }

    /**
     * 
     * @return IS_DELETE 
     */
    public Boolean getIsDelete() {
        return isDelete;
    }

    /**
     * 
     * @param isDelete 
     */
    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 
     * @return CREATED_AT 
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 
     * @param createdAt 
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 
     * @return UPDATED_AT 
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 
     * @param updatedAt 
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
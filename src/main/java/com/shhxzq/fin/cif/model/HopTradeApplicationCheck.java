package com.shhxzq.fin.cif.model;

import java.math.BigDecimal;

public class HopTradeApplicationCheck {
    /** 主键 */
    private Long id;

    /** 机构号 */
    private String companyNo;

    /** 子机构号 */
    private String subCompanyNo;

    /** 订单号 */
    private String serialNo;

    /** 合作方客户编号 */
    private String partnerCustNo;

    /** 交易帐号 */
    private String tradeAcco;

    /** 产品编号 */
    private String prodId;

    /** 申请金额 */
    private BigDecimal amount;

    /** 申请份额 */
    private BigDecimal share;

    /** 支付方式 */
    private String paymentType;

    /** 银行卡号 */
    private String bankAccount;

    /** 银行通道 */
    private String bankNo;

    /** 收费方式-A前端B后端 */
    private String chargeType;

    /** 交易码 */
    private String apkind;

    /** 状态:成功:Y 失败:F 初始化:N 处理中:I */
    private String status;

    /**
     * 主键
     * @return ID 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
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
     * 订单号
     * @return SERIAL_NO 订单号
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * 订单号
     * @param serialNo 订单号
     */
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo == null ? null : serialNo.trim();
    }

    /**
     * 合作方客户编号
     * @return PARTNER_CUST_NO 合作方客户编号
     */
    public String getPartnerCustNo() {
        return partnerCustNo;
    }

    /**
     * 合作方客户编号
     * @param partnerCustNo 合作方客户编号
     */
    public void setPartnerCustNo(String partnerCustNo) {
        this.partnerCustNo = partnerCustNo == null ? null : partnerCustNo.trim();
    }

    /**
     * 交易帐号
     * @return TRADE_ACCO 交易帐号
     */
    public String getTradeAcco() {
        return tradeAcco;
    }

    /**
     * 交易帐号
     * @param tradeAcco 交易帐号
     */
    public void setTradeAcco(String tradeAcco) {
        this.tradeAcco = tradeAcco == null ? null : tradeAcco.trim();
    }

    /**
     * 产品编号
     * @return PROD_ID 产品编号
     */
    public String getProdId() {
        return prodId;
    }

    /**
     * 产品编号
     * @param prodId 产品编号
     */
    public void setProdId(String prodId) {
        this.prodId = prodId == null ? null : prodId.trim();
    }

    /**
     * 申请金额
     * @return AMOUNT 申请金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 申请金额
     * @param amount 申请金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 申请份额
     * @return SHARE 申请份额
     */
    public BigDecimal getShare() {
        return share;
    }

    /**
     * 申请份额
     * @param share 申请份额
     */
    public void setShare(BigDecimal share) {
        this.share = share;
    }

    /**
     * 支付方式
     * @return PAYMENT_TYPE 支付方式
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * 支付方式
     * @param paymentType 支付方式
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
     * 收费方式-A前端B后端
     * @return CHARGE_TYPE 收费方式-A前端B后端
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * 收费方式-A前端B后端
     * @param chargeType 收费方式-A前端B后端
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType == null ? null : chargeType.trim();
    }

    /**
     * 交易码
     * @return APKIND 交易码
     */
    public String getApkind() {
        return apkind;
    }

    /**
     * 交易码
     * @param apkind 交易码
     */
    public void setApkind(String apkind) {
        this.apkind = apkind == null ? null : apkind.trim();
    }

    /**
     * 状态:成功:Y 失败:F 初始化:N 处理中:I
     * @return STATUS 状态:成功:Y 失败:F 初始化:N 处理中:I
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态:成功:Y 失败:F 初始化:N 处理中:I
     * @param status 状态:成功:Y 失败:F 初始化:N 处理中:I
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
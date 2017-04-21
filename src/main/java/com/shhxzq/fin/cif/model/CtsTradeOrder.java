package com.shhxzq.fin.cif.model;

import java.math.BigDecimal;
import java.util.Date;

public class CtsTradeOrder {
    /** 主键 */
    private Long id;

    /** 父订单号 */
    private String parentOrderNo;

    /** 订单号 */
    private String orderNo;

    /** 外部流水号 */
    private String outerSerialNo;

    /** 订单交易码(见OrderApkind类) */
    private String orderApkind;

    /** 订单子交易码(见OrderSubApkind类) */
    private String orderSubApkind;

    /** 客户号 */
    private String custNo;

    /** 客户名称 */
    private String custName;

    /** 受理方式 */
    private String accptMode;

    /** 网点号 */
    private String branchCode;

    /** 交易账号 */
    private String tradeAcco;

    /** 收费方式-A前端B后端 */
    private String shareType;

    /** 机构号 */
    private String companyNo;

    /** 子机构号 */
    private String subCompanyNo;

    /** 源产品编号 */
    private String fromProd;

    /** 源产品类别 */
    private Byte fromProdType;

    /** 源TA号 */
    private String fromTano;

    /** 目标产品编号 */
    private String toProd;

    /** 目标产品类别 */
    private Byte toProdType;

    /** 目标TA号 */
    private String toTano;

    /** 银行序列号 */
    private String bankSerialId;

    /** 银行卡号 */
    private String bankAcco;

    /** 银行通道 */
    private String bankNo;

    /** 银行名称 */
    private String bankName;

    /**  */
    private String pledgeOrderNo;

    /** 开放平台收费方式 */
    private String chargeType;

    /** 支付方式 */
    private String paymentType;

    /** 交易码 */
    private String businessCode;

    /** 工作日 */
    private String workDate;

    /** 申请日期 */
    private String apDate;

    /** 申请时间 */
    private String apTime;

    /** 申请金额(份额) */
    private BigDecimal apAmt;

    /** 成功金额(份额) */
    private BigDecimal succAmt;

    /** 失败金额(份额) */
    private BigDecimal failAmt;

    /** 确认金额 */
    private BigDecimal ackAmt;

    /** 确认份额 */
    private BigDecimal ackQuty;

    /** 确认费用 */
    private BigDecimal ackFee;

    /** 确认时间 */
    private Date ackAt;

    /** 状态(处理中，受理中，部分成功，撤销中，撤销成功，成功，失败) */
    private String status;

    /** 定投协议号 */
    private String protocolNo;

    /** 积分支付金额 */
    private BigDecimal pointsAmount;

    /** 积分使用数量 */
    private BigDecimal pointsQuantity;

    /** 积分冻结码 */
    private String pointsFrozenNo;

    /** 极速赎回到账金额 */
    private BigDecimal fastRedeemSubAmt;

    /** 极速赎回手续费 */
    private BigDecimal fastRedeemFee;

    /** 备注 */
    private String remark;

    /** 逻辑删除标记 */
    private Byte isDelete;

    /** 创建时间 */
    private Date createdAt;

    /** 更新时间 */
    private Date updatedAt;

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
     * 父订单号
     * @return PARENT_ORDER_NO 父订单号
     */
    public String getParentOrderNo() {
        return parentOrderNo;
    }

    /**
     * 父订单号
     * @param parentOrderNo 父订单号
     */
    public void setParentOrderNo(String parentOrderNo) {
        this.parentOrderNo = parentOrderNo == null ? null : parentOrderNo.trim();
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
     * 外部流水号
     * @return OUTER_SERIAL_NO 外部流水号
     */
    public String getOuterSerialNo() {
        return outerSerialNo;
    }

    /**
     * 外部流水号
     * @param outerSerialNo 外部流水号
     */
    public void setOuterSerialNo(String outerSerialNo) {
        this.outerSerialNo = outerSerialNo == null ? null : outerSerialNo.trim();
    }

    /**
     * 订单交易码(见OrderApkind类)
     * @return ORDER_APKIND 订单交易码(见OrderApkind类)
     */
    public String getOrderApkind() {
        return orderApkind;
    }

    /**
     * 订单交易码(见OrderApkind类)
     * @param orderApkind 订单交易码(见OrderApkind类)
     */
    public void setOrderApkind(String orderApkind) {
        this.orderApkind = orderApkind == null ? null : orderApkind.trim();
    }

    /**
     * 订单子交易码(见OrderSubApkind类)
     * @return ORDER_SUB_APKIND 订单子交易码(见OrderSubApkind类)
     */
    public String getOrderSubApkind() {
        return orderSubApkind;
    }

    /**
     * 订单子交易码(见OrderSubApkind类)
     * @param orderSubApkind 订单子交易码(见OrderSubApkind类)
     */
    public void setOrderSubApkind(String orderSubApkind) {
        this.orderSubApkind = orderSubApkind == null ? null : orderSubApkind.trim();
    }

    /**
     * 客户号
     * @return CUST_NO 客户号
     */
    public String getCustNo() {
        return custNo;
    }

    /**
     * 客户号
     * @param custNo 客户号
     */
    public void setCustNo(String custNo) {
        this.custNo = custNo == null ? null : custNo.trim();
    }

    /**
     * 客户名称
     * @return CUST_NAME 客户名称
     */
    public String getCustName() {
        return custName;
    }

    /**
     * 客户名称
     * @param custName 客户名称
     */
    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    /**
     * 受理方式
     * @return ACCPT_MODE 受理方式
     */
    public String getAccptMode() {
        return accptMode;
    }

    /**
     * 受理方式
     * @param accptMode 受理方式
     */
    public void setAccptMode(String accptMode) {
        this.accptMode = accptMode == null ? null : accptMode.trim();
    }

    /**
     * 网点号
     * @return BRANCH_CODE 网点号
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * 网点号
     * @param branchCode 网点号
     */
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode == null ? null : branchCode.trim();
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
     * 收费方式-A前端B后端
     * @return SHARE_TYPE 收费方式-A前端B后端
     */
    public String getShareType() {
        return shareType;
    }

    /**
     * 收费方式-A前端B后端
     * @param shareType 收费方式-A前端B后端
     */
    public void setShareType(String shareType) {
        this.shareType = shareType == null ? null : shareType.trim();
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
     * 源产品编号
     * @return FROM_PROD 源产品编号
     */
    public String getFromProd() {
        return fromProd;
    }

    /**
     * 源产品编号
     * @param fromProd 源产品编号
     */
    public void setFromProd(String fromProd) {
        this.fromProd = fromProd == null ? null : fromProd.trim();
    }

    /**
     * 源产品类别
     * @return FROM_PROD_TYPE 源产品类别
     */
    public Byte getFromProdType() {
        return fromProdType;
    }

    /**
     * 源产品类别
     * @param fromProdType 源产品类别
     */
    public void setFromProdType(Byte fromProdType) {
        this.fromProdType = fromProdType;
    }

    /**
     * 源TA号
     * @return FROM_TANO 源TA号
     */
    public String getFromTano() {
        return fromTano;
    }

    /**
     * 源TA号
     * @param fromTano 源TA号
     */
    public void setFromTano(String fromTano) {
        this.fromTano = fromTano == null ? null : fromTano.trim();
    }

    /**
     * 目标产品编号
     * @return TO_PROD 目标产品编号
     */
    public String getToProd() {
        return toProd;
    }

    /**
     * 目标产品编号
     * @param toProd 目标产品编号
     */
    public void setToProd(String toProd) {
        this.toProd = toProd == null ? null : toProd.trim();
    }

    /**
     * 目标产品类别
     * @return TO_PROD_TYPE 目标产品类别
     */
    public Byte getToProdType() {
        return toProdType;
    }

    /**
     * 目标产品类别
     * @param toProdType 目标产品类别
     */
    public void setToProdType(Byte toProdType) {
        this.toProdType = toProdType;
    }

    /**
     * 目标TA号
     * @return TO_TANO 目标TA号
     */
    public String getToTano() {
        return toTano;
    }

    /**
     * 目标TA号
     * @param toTano 目标TA号
     */
    public void setToTano(String toTano) {
        this.toTano = toTano == null ? null : toTano.trim();
    }

    /**
     * 银行序列号
     * @return BANK_SERIAL_ID 银行序列号
     */
    public String getBankSerialId() {
        return bankSerialId;
    }

    /**
     * 银行序列号
     * @param bankSerialId 银行序列号
     */
    public void setBankSerialId(String bankSerialId) {
        this.bankSerialId = bankSerialId == null ? null : bankSerialId.trim();
    }

    /**
     * 银行卡号
     * @return BANK_ACCO 银行卡号
     */
    public String getBankAcco() {
        return bankAcco;
    }

    /**
     * 银行卡号
     * @param bankAcco 银行卡号
     */
    public void setBankAcco(String bankAcco) {
        this.bankAcco = bankAcco == null ? null : bankAcco.trim();
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
     * 银行名称
     * @return BANK_NAME 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 银行名称
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 
     * @return PLEDGE_ORDER_NO 
     */
    public String getPledgeOrderNo() {
        return pledgeOrderNo;
    }

    /**
     * 
     * @param pledgeOrderNo 
     */
    public void setPledgeOrderNo(String pledgeOrderNo) {
        this.pledgeOrderNo = pledgeOrderNo == null ? null : pledgeOrderNo.trim();
    }

    /**
     * 开放平台收费方式
     * @return CHARGE_TYPE 开放平台收费方式
     */
    public String getChargeType() {
        return chargeType;
    }

    /**
     * 开放平台收费方式
     * @param chargeType 开放平台收费方式
     */
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType == null ? null : chargeType.trim();
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
     * 交易码
     * @return BUSINESS_CODE 交易码
     */
    public String getBusinessCode() {
        return businessCode;
    }

    /**
     * 交易码
     * @param businessCode 交易码
     */
    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    /**
     * 工作日
     * @return WORK_DATE 工作日
     */
    public String getWorkDate() {
        return workDate;
    }

    /**
     * 工作日
     * @param workDate 工作日
     */
    public void setWorkDate(String workDate) {
        this.workDate = workDate == null ? null : workDate.trim();
    }

    /**
     * 申请日期
     * @return AP_DATE 申请日期
     */
    public String getApDate() {
        return apDate;
    }

    /**
     * 申请日期
     * @param apDate 申请日期
     */
    public void setApDate(String apDate) {
        this.apDate = apDate == null ? null : apDate.trim();
    }

    /**
     * 申请时间
     * @return AP_TIME 申请时间
     */
    public String getApTime() {
        return apTime;
    }

    /**
     * 申请时间
     * @param apTime 申请时间
     */
    public void setApTime(String apTime) {
        this.apTime = apTime == null ? null : apTime.trim();
    }

    /**
     * 申请金额(份额)
     * @return AP_AMT 申请金额(份额)
     */
    public BigDecimal getApAmt() {
        return apAmt;
    }

    /**
     * 申请金额(份额)
     * @param apAmt 申请金额(份额)
     */
    public void setApAmt(BigDecimal apAmt) {
        this.apAmt = apAmt;
    }

    /**
     * 成功金额(份额)
     * @return SUCC_AMT 成功金额(份额)
     */
    public BigDecimal getSuccAmt() {
        return succAmt;
    }

    /**
     * 成功金额(份额)
     * @param succAmt 成功金额(份额)
     */
    public void setSuccAmt(BigDecimal succAmt) {
        this.succAmt = succAmt;
    }

    /**
     * 失败金额(份额)
     * @return FAIL_AMT 失败金额(份额)
     */
    public BigDecimal getFailAmt() {
        return failAmt;
    }

    /**
     * 失败金额(份额)
     * @param failAmt 失败金额(份额)
     */
    public void setFailAmt(BigDecimal failAmt) {
        this.failAmt = failAmt;
    }

    /**
     * 确认金额
     * @return ACK_AMT 确认金额
     */
    public BigDecimal getAckAmt() {
        return ackAmt;
    }

    /**
     * 确认金额
     * @param ackAmt 确认金额
     */
    public void setAckAmt(BigDecimal ackAmt) {
        this.ackAmt = ackAmt;
    }

    /**
     * 确认份额
     * @return ACK_QUTY 确认份额
     */
    public BigDecimal getAckQuty() {
        return ackQuty;
    }

    /**
     * 确认份额
     * @param ackQuty 确认份额
     */
    public void setAckQuty(BigDecimal ackQuty) {
        this.ackQuty = ackQuty;
    }

    /**
     * 确认费用
     * @return ACK_FEE 确认费用
     */
    public BigDecimal getAckFee() {
        return ackFee;
    }

    /**
     * 确认费用
     * @param ackFee 确认费用
     */
    public void setAckFee(BigDecimal ackFee) {
        this.ackFee = ackFee;
    }

    /**
     * 确认时间
     * @return ACK_AT 确认时间
     */
    public Date getAckAt() {
        return ackAt;
    }

    /**
     * 确认时间
     * @param ackAt 确认时间
     */
    public void setAckAt(Date ackAt) {
        this.ackAt = ackAt;
    }

    /**
     * 状态(处理中，受理中，部分成功，撤销中，撤销成功，成功，失败)
     * @return STATUS 状态(处理中，受理中，部分成功，撤销中，撤销成功，成功，失败)
     */
    public String getStatus() {
        return status;
    }

    /**
     * 状态(处理中，受理中，部分成功，撤销中，撤销成功，成功，失败)
     * @param status 状态(处理中，受理中，部分成功，撤销中，撤销成功，成功，失败)
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 定投协议号
     * @return PROTOCOL_NO 定投协议号
     */
    public String getProtocolNo() {
        return protocolNo;
    }

    /**
     * 定投协议号
     * @param protocolNo 定投协议号
     */
    public void setProtocolNo(String protocolNo) {
        this.protocolNo = protocolNo == null ? null : protocolNo.trim();
    }

    /**
     * 积分支付金额
     * @return POINTS_AMOUNT 积分支付金额
     */
    public BigDecimal getPointsAmount() {
        return pointsAmount;
    }

    /**
     * 积分支付金额
     * @param pointsAmount 积分支付金额
     */
    public void setPointsAmount(BigDecimal pointsAmount) {
        this.pointsAmount = pointsAmount;
    }

    /**
     * 积分使用数量
     * @return POINTS_QUANTITY 积分使用数量
     */
    public BigDecimal getPointsQuantity() {
        return pointsQuantity;
    }

    /**
     * 积分使用数量
     * @param pointsQuantity 积分使用数量
     */
    public void setPointsQuantity(BigDecimal pointsQuantity) {
        this.pointsQuantity = pointsQuantity;
    }

    /**
     * 积分冻结码
     * @return POINTS_FROZEN_NO 积分冻结码
     */
    public String getPointsFrozenNo() {
        return pointsFrozenNo;
    }

    /**
     * 积分冻结码
     * @param pointsFrozenNo 积分冻结码
     */
    public void setPointsFrozenNo(String pointsFrozenNo) {
        this.pointsFrozenNo = pointsFrozenNo == null ? null : pointsFrozenNo.trim();
    }

    /**
     * 极速赎回到账金额
     * @return FAST_REDEEM_SUB_AMT 极速赎回到账金额
     */
    public BigDecimal getFastRedeemSubAmt() {
        return fastRedeemSubAmt;
    }

    /**
     * 极速赎回到账金额
     * @param fastRedeemSubAmt 极速赎回到账金额
     */
    public void setFastRedeemSubAmt(BigDecimal fastRedeemSubAmt) {
        this.fastRedeemSubAmt = fastRedeemSubAmt;
    }

    /**
     * 极速赎回手续费
     * @return FAST_REDEEM_FEE 极速赎回手续费
     */
    public BigDecimal getFastRedeemFee() {
        return fastRedeemFee;
    }

    /**
     * 极速赎回手续费
     * @param fastRedeemFee 极速赎回手续费
     */
    public void setFastRedeemFee(BigDecimal fastRedeemFee) {
        this.fastRedeemFee = fastRedeemFee;
    }

    /**
     * 备注
     * @return REMARK 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 逻辑删除标记
     * @return IS_DELETE 逻辑删除标记
     */
    public Byte getIsDelete() {
        return isDelete;
    }

    /**
     * 逻辑删除标记
     * @param isDelete 逻辑删除标记
     */
    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 创建时间
     * @return CREATED_AT 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     * @param createdAt 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 更新时间
     * @return UPDATED_AT 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 更新时间
     * @param updatedAt 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
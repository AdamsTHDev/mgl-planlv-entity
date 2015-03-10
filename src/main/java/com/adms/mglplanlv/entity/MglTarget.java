package com.adms.mglplanlv.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.adms.common.domain.BaseAuditDomain;

@Entity
@Table(name="MGL_TARGET")
public class MglTarget extends BaseAuditDomain {

	private static final long serialVersionUID = 3864669539897670114L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CAMPAIGN_CODE", referencedColumnName="CAMPAIGN_CODE", nullable=false)
	private Campaign campaign;
	
	@Column(name="ISSUED_RATE", nullable=false)
	private BigDecimal issuedRate;
	
	@Column(name="PAID_RATE", nullable=false)
	private BigDecimal paidRate;
	
	@Column(name="TARGET_YEAR", nullable=false)
	private String targetYear;
	
	public MglTarget() {

	}

	public MglTarget(String targetYear) {
		this.targetYear = targetYear;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Campaign getCampaign() {
		return campaign;
	}

	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}

	public BigDecimal getIssuedRate() {
		return issuedRate;
	}

	public void setIssuedRate(BigDecimal issuedRate) {
		this.issuedRate = issuedRate;
	}

	public BigDecimal getPaidRate() {
		return paidRate;
	}

	public void setPaidRate(BigDecimal paidRate) {
		this.paidRate = paidRate;
	}

	public String getTargetYear() {
		return targetYear;
	}

	public void setTargetYear(String targetYear) {
		this.targetYear = targetYear;
	}

	@Override
	public String toString() {
		return "MglTarget [id=" + id + ", campaign=" + campaign
				+ ", issuedRate=" + issuedRate + ", paidRate=" + paidRate
				+ ", effectiveDate=" + targetYear + "]";
	}
	
}

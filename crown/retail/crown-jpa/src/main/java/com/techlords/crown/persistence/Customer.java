package com.techlords.crown.persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * The persistent class for the customer database table.
 * 
 */
@Entity
@Table(name = "customer")
@NamedQueries({ @NamedQuery(name = "Customer.findActiveCustomers", query = "select CU from Customer CU where CU.statusBean.statusId=1 order by CU.customerName") })
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "CUSTOMER_CUSTOMERID_GENERATOR", sequenceName = "CUSTOMER_CUSTOMER_ID_SEQ", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_CUSTOMERID_GENERATOR")
	@Column(name = "customer_id", unique = true, nullable = false)
	private Integer customerId;

	@Column(name = "address", length = 2147483647)
	private String address;

	@Column(name = "customer_code", nullable = false, length = 25)
	private String customerCode;

	@Column(name = "customer_name", length = 50)
	private String customerName;

	@Column(name = "phone", length = 50)
	private String phone;

	@Column(name = "remarks", length = 2147483647)
	private String remarks;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "anniversary")
	private Date anniversary;

	// bi-directional many-to-one association to CreditNote
	@OneToMany(mappedBy = "customer")
	private Set<CreditNote> creditNotes;

	// bi-directional many-to-one association to Receipt
	@OneToMany(mappedBy = "customerBean")
	private Set<Receipt> receipts;

	// bi-directional many-to-one association to CustomerType
	@ManyToOne
	@JoinColumn(name = "customer_type")
	private CustomerType customerTypeBean;

	// bi-directional many-to-one association to Status
	@ManyToOne
	@JoinColumn(name = "status")
	private Status statusBean;

	// bi-directional many-to-one association to Invoice
	@OneToMany(mappedBy = "customer")
	private Set<Invoice> invoices;

	public Customer() {
	}

	public Integer getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomerCode() {
		return this.customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Set<CreditNote> getCreditNotes() {
		return this.creditNotes;
	}

	public void setCreditNotes(Set<CreditNote> creditNotes) {
		this.creditNotes = creditNotes;
	}

	public CustomerType getCustomerTypeBean() {
		return this.customerTypeBean;
	}

	public void setCustomerTypeBean(CustomerType customerTypeBean) {
		this.customerTypeBean = customerTypeBean;
	}

	public Status getStatusBean() {
		return this.statusBean;
	}

	public void setStatusBean(Status statusBean) {
		this.statusBean = statusBean;
	}

	public Set<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(Set<Invoice> invoices) {
		this.invoices = invoices;
	}

	public final Set<Receipt> getReceipts() {
		return receipts;
	}

	public final void setReceipts(Set<Receipt> receipts) {
		this.receipts = receipts;
	}
	
	@Version
	@Column(name = "version", unique = true, nullable = false)
	private long version;

	public final long getVersion() {
		return version;
	}

	public final void setVersion(long version) {
		this.version = version;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the anniversary
	 */
	public Date getAnniversary() {
		return anniversary;
	}

	/**
	 * @param anniversary the anniversary to set
	 */
	public void setAnniversary(Date anniversary) {
		this.anniversary = anniversary;
	}
}
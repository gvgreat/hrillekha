/**
 * 
 */
package com.techlords.crown.helpers;

import com.techlords.crown.business.model.CompanyBO;
import com.techlords.crown.business.model.CompanyTypeBO;
import com.techlords.crown.business.model.enums.StatusBO;
import com.techlords.crown.persistence.Company;
import com.techlords.crown.persistence.CompanyType;
import com.techlords.crown.persistence.Location;

/**
 * @author gv
 * 
 */
public final class CompanyHelper {

	public CompanyBO createCompanyBO(Company company) {
		CompanyBO companyBO = new CompanyBO();
		companyBO.setId(company.getCompanyId());
		companyBO.setVersion(company.getVersion());
		companyBO.setCompanyName(company.getCompanyName());
		companyBO.setAddress(company.getAddress());
		companyBO.setDescription(company.getDescription());
		companyBO.setPhone(company.getPhone());
		companyBO.setTin(company.getTin());

		Location loc = company.getLocationBean();
		companyBO.setLocationBO(new LocationHelper().createLocationBO(loc));
		companyBO.setLocation(loc.getLocationId());

		CompanyType type = company.getCompanyTypeBean();
		companyBO.setCompanyTypeBO(createCompanyTypeBO(type));
		companyBO.setCompanyType(type.getCompanyTypeId());

		companyBO.setStatus(StatusBO.valueOf(company.getStatusBean()
				.getStatusId()));

		return companyBO;
	}

	public Company createCompany(CompanyBO companyBO) {
		return createCompany(companyBO, null);
	}

	public Company createCompany(CompanyBO companyBO, Company toEdit) {
		Company company = (toEdit == null) ? new Company() : toEdit;

		if (toEdit == null) {
			company.setCompanyName(companyBO.getCompanyName());
		}
		company.setVersion(companyBO.getVersion());
		company.setAddress(companyBO.getAddress());
		company.setDescription(companyBO.getDescription());
		company.setPhone(companyBO.getPhone());
		company.setTin(companyBO.getTin());

		return company;
	}

	public CompanyTypeBO createCompanyTypeBO(CompanyType companyType) {
		CompanyTypeBO companyTypeBO = new CompanyTypeBO();
		companyTypeBO.setId(companyType.getCompanyTypeId());
		companyTypeBO.setVersion(companyType.getVersion());
		companyTypeBO.setCompanyType(companyType.getCompanyType());
		companyTypeBO.setDescription(companyType.getDescription());
		return companyTypeBO;
	}

	public CompanyType createCompanyType(CompanyTypeBO companyTypeBO) {
		CompanyType type = new CompanyType();
		type.setCompanyTypeId(companyTypeBO.getId());
		type.setVersion(companyTypeBO.getVersion());
		type.setCompanyType(companyTypeBO.getCompanyType());
		type.setDescription(companyTypeBO.getDescription());
		return type;
	}
}

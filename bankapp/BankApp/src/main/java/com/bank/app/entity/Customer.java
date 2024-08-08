package com.bank.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;

	/**
	 * @return the cid
	 */
	public int getCid() {
		return cid;
	}

	/**
	 * @param cid the cid to set
	 */
	public void setCid(int cid) {
		this.cid = cid;
	}

	private String customerNo;

	private String customerAccNo;

	private String customerName;

	private String dob;

	private String qualification;

	private String gender;

	private String aadhaarNo;

	private String panNo;

	private String address;

	private String fatherName;

	private String motherName;

	private String guardianName;

	/**
	 * @param customerNo
	 * @param customerAccNo
	 * @param customerName
	 * @param dob
	 * @param qualification
	 * @param gender
	 * @param aadhaarNo
	 * @param panNo
	 * @param address
	 * @param fatherName
	 * @param motherName
	 * @param guardianName
	 */
	public Customer(String customerNo, String customerAccNo, String customerName, String dob, String qualification,
			String gender, String aadhaarNo, String panNo, String address, String fatherName, String motherName,
			String guardianName) {
		super();
		this.customerNo = customerNo;
		this.customerAccNo = customerAccNo;
		this.customerName = customerName;
		this.dob = dob;
		this.qualification = qualification;
		this.gender = gender;
		this.aadhaarNo = aadhaarNo;
		this.panNo = panNo;
		this.address = address;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.guardianName = guardianName;
	}

	/**
	 * 
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the customerNo
	 */
	public String getCustomerNo() {
		return customerNo;
	}

	/**
	 * @param customerNo the customerNo to set
	 */
	public void setCustomerNo(String customerNo) {
		this.customerNo = customerNo;
	}

	/**
	 * @return the customerAccNo
	 */
	public String getCustomerAccNo() {
		return customerAccNo;
	}

	/**
	 * @param customerAccNo the customerAccNo to set
	 */
	public void setCustomerAccNo(String customerAccNo) {
		this.customerAccNo = customerAccNo;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the qualification
	 */
	public String getQualification() {
		return qualification;
	}

	/**
	 * @param qualification the qualification to set
	 */
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the aadhaarNo
	 */
	public String getAadhaarNo() {
		return aadhaarNo;
	}

	/**
	 * @param aadhaarNo the aadhaarNo to set
	 */
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}

	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}

	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the fatherName
	 */
	public String getFatherName() {
		return fatherName;
	}

	/**
	 * @param fatherName the fatherName to set
	 */
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	/**
	 * @return the motherName
	 */
	public String getMotherName() {
		return motherName;
	}

	/**
	 * @param motherName the motherName to set
	 */
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	/**
	 * @return the guardianName
	 */
	public String getGuardianName() {
		return guardianName;
	}

	/**
	 * @param guardianName the guardianName to set
	 */
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

}

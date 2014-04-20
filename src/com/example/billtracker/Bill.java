package com.example.billtracker;

/**
 * Bill POJO for encapsulating the data pertaining to a Bill
 * @author Josiah Mortenson
 *
 */
public class Bill {

	/**
	 * Contains the unique ID for this Bill.
	 */
	public long m_nBillID;
	
	/**
	 * Contains the type of this Bill.
	 */
	public String m_strBillType;
	
	/**
	 * Contains the (optional) description of this Bill.
	 */
	public String m_strBillDesc;
	
	/**
	 * Contains the dollar amount related to this Bill.
	 */
	public long m_nBillAmount;
	
	/**
	 * Contains the date that this Bill is due.  (Will be an integer between 1-31)
	 */
	public int m_intBillDate;
	
	/**
	 * Initializes an empty bill.
	 */
	public Bill() {
		this.m_strBillType = "";
		this.m_nBillID = 0;
		this.m_nBillAmount = 0;
		this.m_intBillDate = 0;
		this.m_strBillDesc = "";
		
	}
	
	/**
	 * Initializes a bill passed in.
	 * 
	 * This constructor should be used when instantiating a bill
	 * from the database.
	 * 
	 * @param strBillType
	 * 			Bill String representing what type of bill this is.
	 * 
	 */
	public Bill(String strBillType) {
		this.m_strBillType = strBillType;
		this.m_nBillID = 0;
		this.m_nBillAmount = 0;
		this.m_intBillDate = 0;
		this.m_strBillDesc = "";
	}
	
	/**
	 * Initializes a bill with all data except for description passed in.
	 * 
	 * This constructor should be used when instantiating a bill
	 * from the database.
	 * 
	 * @param strBillType
	 * 			Bill String representing what type of bill this is.
	 * 
	 * @param nBillID
	 * 			Long representing the unique ID of the bill.
	 * 
	 * @param nBillAmount
	 * 			Long representing the amount that this bill is due for.
	 * 
	 * @param intBillDate
	 * 			Integer representing what day of the month this bill is due.
	 * 
	 */
	public Bill(String strBillType, long nBillID, long nBillAmount, int intBillDate) {
		this.m_strBillType = strBillType;
		this.m_nBillID = nBillID ;
		this.m_nBillAmount = nBillAmount;
		this.m_intBillDate = intBillDate;
		this.m_strBillDesc = "";
	}
	
	/**
	 * Initializes a bill with all data passed in, including description
	 * 
	 * This constructor should be used when instantiating a bill from
	 * the database.
	 * 
	 * @param strBillType
	 * 			Bill String representing what type of bill this is.
	 * 
	 * @param nBillID
	 * 			Long representing the unique ID of the bill.
	 * 
	 * @param nBillAmount
	 * 			Long representing the amount that this bill is due for.
	 * 
	 * @param intBillDate
	 * 			Integer representing what day of the month this bill is due.
	 * 
	 * @param strBillDesc
	 * 			String representing the [optional] description of this bill.
	 */

	public Bill(String strBillType, long nBillID, long nBillAmount, int intBillDate, String strBillDesc) {
		this.m_strBillType = strBillType;
		this.m_nBillID = nBillID ;
		this.m_nBillAmount = nBillAmount;
		this.m_intBillDate = intBillDate;
		this.m_strBillDesc = strBillDesc;
	}

	// Getters and Setters
	public long getnBillID() {
		return this.m_nBillID;
	}

	public void setM_nBillID(long nBillID) {
		this.m_nBillID = nBillID;
	}

	public String getM_strBillType() {
		return this.m_strBillType;
	}

	public void setM_strBillType(String strBillType) {
		this.m_strBillType = strBillType;
	}

	public String getM_strBillDesc() {
		return m_strBillDesc;
	}

	public void setM_strBillDesc(String strBillDesc) {
		this.m_strBillDesc = strBillDesc;
	}

	public long getM_nBillAmount() {
		return m_nBillAmount;
	}

	public void setM_nBillAmount(long nBillAmount) {
		this.m_nBillAmount = nBillAmount;
	}

	public int getM_intBillDate() {
		return m_intBillDate;
	}

	public void setM_intBillDate(int intBillDate) {
		this.m_intBillDate = intBillDate;
	}
	
}

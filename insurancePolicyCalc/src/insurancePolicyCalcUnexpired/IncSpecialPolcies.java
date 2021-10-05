package insurancePolicyCalcUnexpired;

public class IncSpecialPolcies {
	
	private String seqNo;
	private String policyType;
	
	//derived from System Date
	private String incSatrtDate;
	private int incPeriod;
	private double incAmount;
	private double incCoverage1;
	private double incCovarage2;
	
	//derived from calc date
	private String calcDate;

	/**
	 * @param policyType
	 * @param incSatrtDate
	 * @param incPeriod
	 * @param incAmount
	 * @param incCoverage1
	 * @param incCovarage2
	 * @param calcDate
	 */
	public IncSpecialPolcies(String policyType, String incSatrtDate, int incPeriod, double incAmount,
			double incCoverage1, double incCovarage2, String calcDate) {
		super();
		this.policyType = policyType;
		this.incSatrtDate = incSatrtDate;
		this.incPeriod = incPeriod;
		this.incAmount = incAmount;
		this.incCoverage1 = incCoverage1;
		this.incCovarage2 = incCovarage2;
		this.calcDate = calcDate;
	}

	/**
	 * 
	 */
	public IncSpecialPolcies() {
		super();
	}

	/**
	 * @return the policyType
	 */
	public String getPolicyType() {
		return policyType;
	}

	/**
	 * @param policyType the policyType to set
	 */
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	/**
	 * @return the incSatrtDate
	 */
	public String getIncSatrtDate() {
		return incSatrtDate;
	}

	/**
	 * @param incSatrtDate the incSatrtDate to set
	 */
	public void setIncSatrtDate(String incSatrtDate) {
		this.incSatrtDate = incSatrtDate;
	}

	/**
	 * @return the incPeriod
	 */
	public int getIncPeriod() {
		return incPeriod;
	}

	/**
	 * @param incPeriod the incPeriod to set
	 */
	public void setIncPeriod(int incPeriod) {
		this.incPeriod = incPeriod;
	}

	/**
	 * @return the incAmount
	 */
	public double getIncAmount() {
		return incAmount;
	}

	/**
	 * @param incAmount the incAmount to set
	 */
	public void setIncAmount(double incAmount) {
		this.incAmount = incAmount;
	}

	/**
	 * @return the incCoverage1
	 */
	public double getIncCoverage1() {
		return incCoverage1;
	}

	/**
	 * @param incCoverage1 the incCoverage1 to set
	 */
	public void setIncCoverage1(double incCoverage1) {
		this.incCoverage1 = incCoverage1;
	}

	/**
	 * @return the incCovarage2
	 */
	public double getIncCovarage2() {
		return incCovarage2;
	}

	/**
	 * @param incCovarage2 the incCovarage2 to set
	 */
	public void setIncCovarage2(double incCovarage2) {
		this.incCovarage2 = incCovarage2;
	}

	/**
	 * @return the calcDate
	 */
	public String getCalcDate() {
		return calcDate;
	}

	/**
	 * @param calcDate the calcDate to set
	 */
	public void setCalcDate(String calcDate) {
		this.calcDate = calcDate;
	}
	
	

}

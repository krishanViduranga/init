package insurancePolicyCalcUnexpired;

public class PolicyBasedCovarage {
	
	private String policyType;
	private double covarageType1;
	/**
	 * @param policyType
	 * @param covarageType1
	 */
	public PolicyBasedCovarage(String policyType, double covarageType1) {
		super();
		this.policyType = policyType;
		this.covarageType1 = covarageType1;
	}
	/**
	 * 
	 */
	public PolicyBasedCovarage() {
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
	 * @return the covarageType1
	 */
	public double getCovarageType1() {
		return covarageType1;
	}
	/**
	 * @param covarageType1 the covarageType1 to set
	 */
	public void setCovarageType1(double covarageType1) {
		this.covarageType1 = covarageType1;
	}
	
	
	

}

package insurancePolicyCalcUnexpired;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <IncSpecialPolcies> incSpecialPolicyList = new ArrayList<IncSpecialPolcies>();
		
		/*
		 * @param policyType
		 * @param incSatrtDate
		 * @param incPeriod
		 * @param incAmount
		 * @param incCoverage1
		 * @param incCovarage2
		 * @param calcDate
		*/
		
		//only for dummy data,instead of db values
		
		incSpecialPolicyList.add(new IncSpecialPolcies("p1","200602",59, 20450.00, 15300.00, 150300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p2","200602",59, 23450.00, 18300.00, 180300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p3","200602",59, 22450.00, 14300.00, 130300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p4","200602",59, 50450.00, 18300.00, 180300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p1","200602",59, 60450.00, 18300.00, 180300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p4","200602",59, 60450.00, 18300.00, 180300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p2","200602",59, 270450.00, 185300.00, 180300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p3","200602",59, 208450.00, 184300.00, 180300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p1","200602",59, 20750.00, 13300.00, 180300.00, "202110"));
		incSpecialPolicyList.add(new IncSpecialPolcies("p2","200602",59, 204650.00, 63300.00, 70300.00, "202110"));
		
		double p1_covarage1 =0; 
		double p2_covarage1 =0;
		double p3_covarage1 =0;
		double p4_covarage1 =0;
		
		for(IncSpecialPolcies temp:incSpecialPolicyList) {
			
			String tempPolicyType = temp.getPolicyType(); 
			switch(tempPolicyType) {
			case "p1":
				p1_covarage1 = p1_covarage1 + temp.getIncCoverage1();
				break;
			case "p2":
				p2_covarage1 = p2_covarage1 + temp.getIncCoverage1();
				break;
			case "p3":
				p3_covarage1 = p3_covarage1 + temp.getIncCoverage1();
				break;
			case "p4":
				p4_covarage1 = p4_covarage1 + temp.getIncCoverage1();
				break;
			}
			
			
		}
		
		
		List <PolicyBasedCovarage> policyBasedCovarageList = new ArrayList<PolicyBasedCovarage>();
		
		policyBasedCovarageList.add(new PolicyBasedCovarage("p1",p1_covarage1));
		policyBasedCovarageList.add(new PolicyBasedCovarage("p2",p2_covarage1));
		policyBasedCovarageList.add(new PolicyBasedCovarage("p3",p3_covarage1));
		policyBasedCovarageList.add(new PolicyBasedCovarage("p4",p4_covarage1));
		
		//return policyBasedCovarageList to jasperSub report as a parameter 
		
		
		
	}

}

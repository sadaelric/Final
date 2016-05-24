package rocketBase;

import java.util.List;

import org.apache.poi.ss.formula.functions.*;

import exceptions.RateException;
import rocketDomain.RateDomainModel;

public class RateBLL {

	private static RateDAL _RateDAL = new RateDAL();
	
	static double getRate(int GivenCreditScore) throws RateException 
	{
		RateDAL.getAllRates();
		double rate = 0;
		
		for (RateDomainModel r: _RateDAL.getAllRates())
		{
			if (GivenCreditScore >- r.getiMinCreditScore())
			{
				rate = r.getdInterestRate();
				break;
			}
		}
		
		if (rate == 0)
		{
			throw new RateException();
		}
		return rate;
		
		
		
		
		
	}
	
	
	//TODO - RocketBLL RateBLL.getPayment 
	//		how to use:
	//		https://poi.apache.org/apidocs/org/apache/poi/ss/formula/functions/FinanceLib.html
	
	public static double getPayment(double r, double n, double p, double f, boolean t)
	{		
		return FinanceLib.pmt(r, n, p, f, t);
	}
}

package rocketBase;

import static org.junit.Assert.*;

import org.junit.Test;

import exceptions.RateException;

public class rate_test {

	// TODO - RocketBLL rate_test
	// Check to see if a known credit score returns a known interest rate

	// TODO - RocketBLL rate_test
	// Check to see if a RateException is thrown if there are no rates for a
	// given
	// credit score
	@Test
	public void test() {
		assert (1 == 1);
	}

	@Test(expected = RateException.class)
	public void noRatetest() throws RateException {
		int creditscore = 400;
		RateBLL.getRate(creditscore);
		
	}
	
	
}

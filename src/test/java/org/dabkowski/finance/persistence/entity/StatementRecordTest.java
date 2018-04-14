package org.dabkowski.finance.persistence.entity;

import org.junit.Test;

import ski.dabkow.finance.persistence.entity.StatementRecord;

public class StatementRecordTest {

	@Test
	public void test() {
		String line = "05.11.2015;0285 00420959;;0285 00420959.40Z;CH70 0028 5285 4209 5940 Z;CHF;07.10.2015;06.11.2015;UBS Personal Account;05.11.2015;06.11.2015;05.11.2015;Maestro Payment;CARD 15029307-0 1807;Migros M Z¸rich-P¸nt, 9930810BN7968889;9930810BN7968889;;;45.50;;69'906.65";

		StatementRecord record = new StatementRecord(line);

	}

}

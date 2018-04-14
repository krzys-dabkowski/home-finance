package ski.dabkowi.finance.parsing;

import ski.dabkow.finance.persistence.entity.StatementRecord;

public class RecordParser {

	StatementRecord parse(String line) {
		if (!line.isEmpty()) {
			StatementRecord record = new StatementRecord(line);

			return record;
		} else {
			return null;
		}
	}
}

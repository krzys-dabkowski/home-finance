package ski.dabkow.finance.persistence.entity;

import java.util.Date;

import javax.persistence.Entity;

import ski.dabkowi.finance.parsing.UnparseableRecordException;

@Entity
public class StatementRecord extends BaseEntity {

	private final static int NUMBER_OF_MEMBERS = 21;
	private final static String DATE_SEPARATOR = "\\.";

	public StatementRecord(String line) {

		String[] lineSplit = line.split(";");

		if (lineSplit.length != NUMBER_OF_MEMBERS) {
			throw new UnparseableRecordException(
					"Number of elements in the record is not " + NUMBER_OF_MEMBERS + " but " + lineSplit.length);
		}

		String valuationDateString = lineSplit[0];
		if (!valuationDateString.isEmpty()) {
			valuationDate = new Date();
			String[] valuationDateElements = valuationDateString.split(DATE_SEPARATOR);
			valuationDate.setDate(Integer.parseInt(valuationDateElements[0]));
			valuationDate.setMonth(Integer.parseInt(valuationDateElements[1]));
			valuationDate.setYear(Integer.parseInt(valuationDateElements[2]));
		}

		bankingRelationship = lineSplit[1];
		portfolio = lineSplit[2];
		product = lineSplit[3];
		iban = lineSplit[4];
		ccy = lineSplit[5];
		fromDate = lineSplit[6];
		toDate = lineSplit[7];
		descrpition = lineSplit[8];
		tradeDate = lineSplit[9];
		bookingDate = lineSplit[10];
		valueDate = lineSplit[11];
		description1 = lineSplit[12];
		description2 = lineSplit[13];
		description3 = lineSplit[14];
		transactionNo = lineSplit[15];

		String exchangeRateString = lineSplit[16];
		if (!exchangeRateString.isEmpty()) {
			exchangeRate = Float.parseFloat(exchangeRateString);
		}

		String individualAmountString = lineSplit[17];
		if (!individualAmountString.isEmpty()) {
			individualAmount = Float.parseFloat(individualAmountString);
		}

		String debitString = lineSplit[18];
		if (!debitString.isEmpty()) {
			debit = Float.parseFloat(debitString);
		}

		String creditString = lineSplit[19];
		if (!creditString.isEmpty()) {
			credit = Float.parseFloat(creditString);
		}

		String balanceString = lineSplit[19];
		if (!balanceString.isEmpty()) {
			balance = Float.parseFloat(balanceString);
		}

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// 1
	private Date valuationDate;

	// 2
	private String bankingRelationship;

	// 3
	private String portfolio;

	// 4
	private String product;

	// 5
	private String iban;

	// 6
	private String ccy;

	// 7
	private String fromDate;

	// 8
	private String toDate;

	// 9
	private String descrpition;

	// 10
	private String tradeDate;

	// 11
	private String bookingDate;

	// 12
	private String valueDate;

	// 13
	private String description1;

	// 14
	private String description2;

	// 15
	private String description3;

	// 16
	private String transactionNo;

	// 17
	private float exchangeRate;

	// 18
	private float individualAmount;

	// 19
	private float debit;

	// 20
	private float credit;

	// 21
	private float balance;

	void setDescrpition(String descrpition) {
		this.descrpition = descrpition;
	}

	void setTradeDate(String tradeDate) {
		this.tradeDate = tradeDate;
	}

	void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getDescrpition() {
		return descrpition;
	}

	public String getTradeDate() {
		return tradeDate;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public String getValueDate() {
		return valueDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Date getValuationDate() {
		return valuationDate;
	}

	public String getBankingRelationship() {
		return bankingRelationship;
	}

	public String getPortfolio() {
		return portfolio;
	}

	public String getProduct() {
		return product;
	}

	public String getIban() {
		return iban;
	}

	public String getCcy() {
		return ccy;
	}

	public String getFromDate() {
		return fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public String getDescription1() {
		return description1;
	}

	public String getDescription2() {
		return description2;
	}

	public String getDescription3() {
		return description3;
	}

	public String getTransactionNo() {
		return transactionNo;
	}

	public float getExchangeRate() {
		return exchangeRate;
	}

	public float getIndividualAmount() {
		return individualAmount;
	}

	public float getDebit() {
		return debit;
	}

	public float getCredit() {
		return credit;
	}

	public float getBalance() {
		return balance;
	}

	void setValuationDate(Date valuationDate) {
		this.valuationDate = valuationDate;
	}

	void setBankingRelationship(String bankingRelationship) {
		this.bankingRelationship = bankingRelationship;
	}

	void setPortfolio(String portfolio) {
		this.portfolio = portfolio;
	}

	void setProduct(String product) {
		this.product = product;
	}

	void setIban(String iban) {
		this.iban = iban;
	}

	void setCcy(String ccy) {
		this.ccy = ccy;
	}

	void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	void setToDate(String toDate) {
		this.toDate = toDate;
	}

	void setDescription1(String description1) {
		this.description1 = description1;
	}

	void setDescription2(String description2) {
		this.description2 = description2;
	}

	void setDescription3(String description3) {
		this.description3 = description3;
	}

	void setTransactionNo(String transactionNo) {
		this.transactionNo = transactionNo;
	}

	void setExchangeRate(float exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	void setIndividualAmount(float individualAmount) {
		this.individualAmount = individualAmount;
	}

	void setDebit(float debit) {
		this.debit = debit;
	}

	void setCredit(float credit) {
		this.credit = credit;
	}

	void setBalance(float balance) {
		this.balance = balance;
	}
	// Valuation date;Banking relationship;Portfolio;Product;IBAN;Ccy.;Date
	// from;Date to;Description;Trade date;Booking date;Value date;Description
	// 1;Description 2;Description 3;Transaction no.;Exchange rate in the
	// original amount in settlement currency;Individual
	// amount;Debit;Credit;Balance

	// Bewertungsdatum;Bankbeziehung;Portfolio;Produkt;IBAN;Whrg.;Datum
	// von;Datum
	// bis;Beschreibung;Abschlussdatum;Buchungsdatum;Valuta;Beschreibung
	// 1;Beschreibung 2;Beschreibung 3;Transaktions-Nr.;Devisenkurs zum
	// Originalbetrag in
	// Abrechnungswährung;Einzelbetrag;Belastung;Gutschrift;Saldo
}

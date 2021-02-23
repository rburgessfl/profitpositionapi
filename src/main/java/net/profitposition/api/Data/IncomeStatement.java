package net.profitposition.api.Data;

import java.util.List;

public class IncomeStatement {
    public String symbol;
    public List<IncomeStatementAnnualReport> incomeStatementAnnualReports;
    public List<IncomeStatementQuarterlyReport> incomeStatementQuarterlyReports;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<IncomeStatementAnnualReport> getIncomeStatementAnnualReports() {
        return incomeStatementAnnualReports;
    }

    public void setIncomeStatementAnnualReports(List<IncomeStatementAnnualReport> incomeStatementAnnualReports) {
        this.incomeStatementAnnualReports = incomeStatementAnnualReports;
    }

    public List<IncomeStatementQuarterlyReport> getIncomeStatementQuarterlyReports() {
        return incomeStatementQuarterlyReports;
    }

    public void setIncomeStatementQuarterlyReports(List<IncomeStatementQuarterlyReport> incomeStatementQuarterlyReports) {
        this.incomeStatementQuarterlyReports = incomeStatementQuarterlyReports;
    }
}
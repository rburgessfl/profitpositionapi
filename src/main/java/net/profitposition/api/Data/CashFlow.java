package net.profitposition.api.Data;

import java.util.List;

public class CashFlow {
    public String symbol;
    public List<CashFlowAnnualReport> cashFlowAnnualReports;
    public List<CashFlowQuarterlyReport> cashFlowQuarterlyReports;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<CashFlowAnnualReport> getCashFlowAnnualReports() {
        return cashFlowAnnualReports;
    }

    public void setCashFlowAnnualReports(List<CashFlowAnnualReport> cashFlowAnnualReports) {
        this.cashFlowAnnualReports = cashFlowAnnualReports;
    }

    public List<CashFlowQuarterlyReport> getCashFlowQuarterlyReports() {
        return cashFlowQuarterlyReports;
    }

    public void setCashFlowQuarterlyReports(List<CashFlowQuarterlyReport> cashFlowQuarterlyReports) {
        this.cashFlowQuarterlyReports = cashFlowQuarterlyReports;
    }
}

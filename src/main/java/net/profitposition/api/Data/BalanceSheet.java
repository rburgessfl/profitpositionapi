package net.profitposition.api.Data;

import java.util.List;

public class BalanceSheet {
    public String symbol;
    public List<BalanceSheetAnnualReport> balanceSheetAnnualReports;
    public List<BalanceSheetQuarterlyReport> balanceSheetQuarterlyReports;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public List<BalanceSheetAnnualReport> getBalanceSheetAnnualReports() {
        return balanceSheetAnnualReports;
    }

    public void setBalanceSheetAnnualReports(List<BalanceSheetAnnualReport> balanceSheetAnnualReports) {
        this.balanceSheetAnnualReports = balanceSheetAnnualReports;
    }

    public List<BalanceSheetQuarterlyReport> getBalanceSheetQuarterlyReports() {
        return balanceSheetQuarterlyReports;
    }

    public void setBalanceSheetQuarterlyReports(List<BalanceSheetQuarterlyReport> balanceSheetQuarterlyReports) {
        this.balanceSheetQuarterlyReports = balanceSheetQuarterlyReports;
    }
}

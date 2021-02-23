package net.profitposition.api.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompanyOverview {
    @JsonProperty("Symbol")
    public String symbol;
    @JsonProperty("AssetType")
    public String assetType;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Description")
    public String description;
    @JsonProperty("Exchange")
    public String exchange;
    @JsonProperty("Currency")
    public String currency;
    @JsonProperty("Country")
    public String country;
    @JsonProperty("Sector")
    public String sector;
    @JsonProperty("Industry")
    public String industry;
    @JsonProperty("Address")
    public String address;
    @JsonProperty("FullTimeEmployees")
    public String fullTimeEmployees;
    @JsonProperty("FiscalYearEnd")
    public String fiscalYearEnd;
    @JsonProperty("LatestQuarter")
    public String latestQuarter;
    @JsonProperty("MarketCapitalization")
    public String marketCapitalization;
    @JsonProperty("EBITDA")
    public String eBITDA;
    @JsonProperty("PERatio")
    public String pERatio;
    @JsonProperty("PEGRatio")
    public String pEGRatio;
    @JsonProperty("BookValue")
    public String bookValue;
    @JsonProperty("DividendPerShare")
    public String dividendPerShare;
    @JsonProperty("DividendYield")
    public String dividendYield;
    @JsonProperty("EPS")
    public String ePS;
    @JsonProperty("RevenuePerShareTTM")
    public String revenuePerShareTTM;
    @JsonProperty("ProfitMargin")
    public String profitMargin;
    @JsonProperty("OperatingMarginTTM")
    public String operatingMarginTTM;
    @JsonProperty("ReturnOnAssetsTTM")
    public String returnOnAssetsTTM;
    @JsonProperty("ReturnOnEquityTTM")
    public String returnOnEquityTTM;
    @JsonProperty("RevenueTTM")
    public String revenueTTM;
    @JsonProperty("GrossProfitTTM")
    public String grossProfitTTM;
    @JsonProperty("DilutedEPSTTM")
    public String dilutedEPSTTM;
    @JsonProperty("QuarterlyEarningsGrowthYOY")
    public String quarterlyEarningsGrowthYOY;
    @JsonProperty("QuarterlyRevenueGrowthYOY")
    public String quarterlyRevenueGrowthYOY;
    @JsonProperty("AnalystTargetPrice")
    public String analystTargetPrice;
    @JsonProperty("TrailingPE")
    public String trailingPE;
    @JsonProperty("ForwardPE")
    public String forwardPE;
    @JsonProperty("PriceToSalesRatioTTM")
    public String priceToSalesRatioTTM;
    @JsonProperty("PriceToBookRatio")
    public String priceToBookRatio;
    @JsonProperty("EVToRevenue")
    public String eVToRevenue;
    @JsonProperty("EVToEBITDA")
    public String eVToEBITDA;
    @JsonProperty("Beta")
    public String beta;
    @JsonProperty("52WeekHigh")
    public String _52WeekHigh;
    @JsonProperty("52WeekLow")
    public String _52WeekLow;
    @JsonProperty("50DayMovingAverage")
    public String _50DayMovingAverage;
    @JsonProperty("200DayMovingAverage")
    public String _200DayMovingAverage;
    @JsonProperty("SharesOutstanding")
    public String sharesOutstanding;
    @JsonProperty("SharesFloat")
    public String sharesFloat;
    @JsonProperty("SharesShort")
    public String sharesShort;
    @JsonProperty("SharesShortPriorMonth")
    public String sharesShortPriorMonth;
    @JsonProperty("ShortRatio")
    public String shortRatio;
    @JsonProperty("ShortPercentOutstanding")
    public String shortPercentOutstanding;
    @JsonProperty("ShortPercentFloat")
    public String shortPercentFloat;
    @JsonProperty("PercentInsiders")
    public String percentInsiders;
    @JsonProperty("PercentInstitutions")
    public String percentInstitutions;
    @JsonProperty("ForwardAnnualDividendRate")
    public String forwardAnnualDividendRate;
    @JsonProperty("ForwardAnnualDividendYield")
    public String forwardAnnualDividendYield;
    @JsonProperty("PayoutRatio")
    public String payoutRatio;
    @JsonProperty("DividendDate")
    public String dividendDate;
    @JsonProperty("ExDividendDate")
    public String exDividendDate;
    @JsonProperty("LastSplitFactor")
    public String lastSplitFactor;
    @JsonProperty("LastSplitDate")
    public String lastSplitDate;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFullTimeEmployees() {
        return fullTimeEmployees;
    }

    public void setFullTimeEmployees(String fullTimeEmployees) {
        this.fullTimeEmployees = fullTimeEmployees;
    }

    public String getFiscalYearEnd() {
        return fiscalYearEnd;
    }

    public void setFiscalYearEnd(String fiscalYearEnd) {
        this.fiscalYearEnd = fiscalYearEnd;
    }

    public String getLatestQuarter() {
        return latestQuarter;
    }

    public void setLatestQuarter(String latestQuarter) {
        this.latestQuarter = latestQuarter;
    }

    public String getMarketCapitalization() {
        return marketCapitalization;
    }

    public void setMarketCapitalization(String marketCapitalization) {
        this.marketCapitalization = marketCapitalization;
    }

    public String geteBITDA() {
        return eBITDA;
    }

    public void seteBITDA(String eBITDA) {
        this.eBITDA = eBITDA;
    }

    public String getpERatio() {
        return pERatio;
    }

    public void setpERatio(String pERatio) {
        this.pERatio = pERatio;
    }

    public String getpEGRatio() {
        return pEGRatio;
    }

    public void setpEGRatio(String pEGRatio) {
        this.pEGRatio = pEGRatio;
    }

    public String getBookValue() {
        return bookValue;
    }

    public void setBookValue(String bookValue) {
        this.bookValue = bookValue;
    }

    public String getDividendPerShare() {
        return dividendPerShare;
    }

    public void setDividendPerShare(String dividendPerShare) {
        this.dividendPerShare = dividendPerShare;
    }

    public String getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(String dividendYield) {
        this.dividendYield = dividendYield;
    }

    public String getePS() {
        return ePS;
    }

    public void setePS(String ePS) {
        this.ePS = ePS;
    }

    public String getRevenuePerShareTTM() {
        return revenuePerShareTTM;
    }

    public void setRevenuePerShareTTM(String revenuePerShareTTM) {
        this.revenuePerShareTTM = revenuePerShareTTM;
    }

    public String getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(String profitMargin) {
        this.profitMargin = profitMargin;
    }

    public String getOperatingMarginTTM() {
        return operatingMarginTTM;
    }

    public void setOperatingMarginTTM(String operatingMarginTTM) {
        this.operatingMarginTTM = operatingMarginTTM;
    }

    public String getReturnOnAssetsTTM() {
        return returnOnAssetsTTM;
    }

    public void setReturnOnAssetsTTM(String returnOnAssetsTTM) {
        this.returnOnAssetsTTM = returnOnAssetsTTM;
    }

    public String getReturnOnEquityTTM() {
        return returnOnEquityTTM;
    }

    public void setReturnOnEquityTTM(String returnOnEquityTTM) {
        this.returnOnEquityTTM = returnOnEquityTTM;
    }

    public String getRevenueTTM() {
        return revenueTTM;
    }

    public void setRevenueTTM(String revenueTTM) {
        this.revenueTTM = revenueTTM;
    }

    public String getGrossProfitTTM() {
        return grossProfitTTM;
    }

    public void setGrossProfitTTM(String grossProfitTTM) {
        this.grossProfitTTM = grossProfitTTM;
    }

    public String getDilutedEPSTTM() {
        return dilutedEPSTTM;
    }

    public void setDilutedEPSTTM(String dilutedEPSTTM) {
        this.dilutedEPSTTM = dilutedEPSTTM;
    }

    public String getQuarterlyEarningsGrowthYOY() {
        return quarterlyEarningsGrowthYOY;
    }

    public void setQuarterlyEarningsGrowthYOY(String quarterlyEarningsGrowthYOY) {
        this.quarterlyEarningsGrowthYOY = quarterlyEarningsGrowthYOY;
    }

    public String getQuarterlyRevenueGrowthYOY() {
        return quarterlyRevenueGrowthYOY;
    }

    public void setQuarterlyRevenueGrowthYOY(String quarterlyRevenueGrowthYOY) {
        this.quarterlyRevenueGrowthYOY = quarterlyRevenueGrowthYOY;
    }

    public String getAnalystTargetPrice() {
        return analystTargetPrice;
    }

    public void setAnalystTargetPrice(String analystTargetPrice) {
        this.analystTargetPrice = analystTargetPrice;
    }

    public String getTrailingPE() {
        return trailingPE;
    }

    public void setTrailingPE(String trailingPE) {
        this.trailingPE = trailingPE;
    }

    public String getForwardPE() {
        return forwardPE;
    }

    public void setForwardPE(String forwardPE) {
        this.forwardPE = forwardPE;
    }

    public String getPriceToSalesRatioTTM() {
        return priceToSalesRatioTTM;
    }

    public void setPriceToSalesRatioTTM(String priceToSalesRatioTTM) {
        this.priceToSalesRatioTTM = priceToSalesRatioTTM;
    }

    public String getPriceToBookRatio() {
        return priceToBookRatio;
    }

    public void setPriceToBookRatio(String priceToBookRatio) {
        this.priceToBookRatio = priceToBookRatio;
    }

    public String geteVToRevenue() {
        return eVToRevenue;
    }

    public void seteVToRevenue(String eVToRevenue) {
        this.eVToRevenue = eVToRevenue;
    }

    public String geteVToEBITDA() {
        return eVToEBITDA;
    }

    public void seteVToEBITDA(String eVToEBITDA) {
        this.eVToEBITDA = eVToEBITDA;
    }

    public String getBeta() {
        return beta;
    }

    public void setBeta(String beta) {
        this.beta = beta;
    }

    public String get_52WeekHigh() {
        return _52WeekHigh;
    }

    public void set_52WeekHigh(String _52WeekHigh) {
        this._52WeekHigh = _52WeekHigh;
    }

    public String get_52WeekLow() {
        return _52WeekLow;
    }

    public void set_52WeekLow(String _52WeekLow) {
        this._52WeekLow = _52WeekLow;
    }

    public String get_50DayMovingAverage() {
        return _50DayMovingAverage;
    }

    public void set_50DayMovingAverage(String _50DayMovingAverage) {
        this._50DayMovingAverage = _50DayMovingAverage;
    }

    public String get_200DayMovingAverage() {
        return _200DayMovingAverage;
    }

    public void set_200DayMovingAverage(String _200DayMovingAverage) {
        this._200DayMovingAverage = _200DayMovingAverage;
    }

    public String getSharesOutstanding() {
        return sharesOutstanding;
    }

    public void setSharesOutstanding(String sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    public String getSharesFloat() {
        return sharesFloat;
    }

    public void setSharesFloat(String sharesFloat) {
        this.sharesFloat = sharesFloat;
    }

    public String getSharesShort() {
        return sharesShort;
    }

    public void setSharesShort(String sharesShort) {
        this.sharesShort = sharesShort;
    }

    public String getSharesShortPriorMonth() {
        return sharesShortPriorMonth;
    }

    public void setSharesShortPriorMonth(String sharesShortPriorMonth) {
        this.sharesShortPriorMonth = sharesShortPriorMonth;
    }

    public String getShortRatio() {
        return shortRatio;
    }

    public void setShortRatio(String shortRatio) {
        this.shortRatio = shortRatio;
    }

    public String getShortPercentOutstanding() {
        return shortPercentOutstanding;
    }

    public void setShortPercentOutstanding(String shortPercentOutstanding) {
        this.shortPercentOutstanding = shortPercentOutstanding;
    }

    public String getShortPercentFloat() {
        return shortPercentFloat;
    }

    public void setShortPercentFloat(String shortPercentFloat) {
        this.shortPercentFloat = shortPercentFloat;
    }

    public String getPercentInsiders() {
        return percentInsiders;
    }

    public void setPercentInsiders(String percentInsiders) {
        this.percentInsiders = percentInsiders;
    }

    public String getPercentInstitutions() {
        return percentInstitutions;
    }

    public void setPercentInstitutions(String percentInstitutions) {
        this.percentInstitutions = percentInstitutions;
    }

    public String getForwardAnnualDividendRate() {
        return forwardAnnualDividendRate;
    }

    public void setForwardAnnualDividendRate(String forwardAnnualDividendRate) {
        this.forwardAnnualDividendRate = forwardAnnualDividendRate;
    }

    public String getForwardAnnualDividendYield() {
        return forwardAnnualDividendYield;
    }

    public void setForwardAnnualDividendYield(String forwardAnnualDividendYield) {
        this.forwardAnnualDividendYield = forwardAnnualDividendYield;
    }

    public String getPayoutRatio() {
        return payoutRatio;
    }

    public void setPayoutRatio(String payoutRatio) {
        this.payoutRatio = payoutRatio;
    }

    public String getDividendDate() {
        return dividendDate;
    }

    public void setDividendDate(String dividendDate) {
        this.dividendDate = dividendDate;
    }

    public String getExDividendDate() {
        return exDividendDate;
    }

    public void setExDividendDate(String exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    public String getLastSplitFactor() {
        return lastSplitFactor;
    }

    public void setLastSplitFactor(String lastSplitFactor) {
        this.lastSplitFactor = lastSplitFactor;
    }

    public String getLastSplitDate() {
        return lastSplitDate;
    }

    public void setLastSplitDate(String lastSplitDate) {
        this.lastSplitDate = lastSplitDate;
    }
}

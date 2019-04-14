
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import io.restassured.RestAssured;

import java.util.ArrayList;
import java.util.List;

public class Account {

    @SerializedName("design_url")
    @Expose
    private String designUrl;
    @SerializedName("transactions_total_amount")
    @Expose
    private int transactionsTotalAmount;
    @SerializedName("tariff_avg_month_balance")
    @Expose
    private int tariffAvgMonthBalance;
    @SerializedName("type")
    @Expose
    private int type;
    @SerializedName("closing_date")
    @Expose
    private String closingDate;
    @SerializedName("partial_withdraw_available")
    @Expose
    private int partialWithdrawAvailable;
    @SerializedName("refill_available")
    @Expose
    private int refillAvailable;
    @SerializedName("blocked_amount")
    @Expose
    private float blockedAmount;
    @SerializedName("scheme_id")
    @Expose
    private String schemeId;
    @SerializedName("pan")
    @Expose
    private String pan;
    @SerializedName("account_id")
    @Expose
    private int accountId;
    @SerializedName("title_small")
    @Expose
    private String titleSmall;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("balance")
    @Expose
    private float balance;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("isSalary")
    @Expose
    private boolean isSalary;

    public String getDesignUrl() {
        return designUrl;
    }

    public void setDesignUrl(String designUrl) {
        this.designUrl = designUrl;
    }

    public int getTransactionsTotalAmount() {
        return transactionsTotalAmount;
    }

    public void setTransactionsTotalAmount(int transactionsTotalAmount) {
        this.transactionsTotalAmount = transactionsTotalAmount;
    }

    public int getTariffAvgMonthBalance() {
        return tariffAvgMonthBalance;
    }

    public void setTariffAvgMonthBalance(int tariffAvgMonthBalance) {
        this.tariffAvgMonthBalance = tariffAvgMonthBalance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }

    public int getPartialWithdrawAvailable() {
        return partialWithdrawAvailable;
    }

    public void setPartialWithdrawAvailable(int partialWithdrawAvailable) {
        this.partialWithdrawAvailable = partialWithdrawAvailable;
    }

    public int getRefillAvailable() {
        return refillAvailable;
    }

    public void setRefillAvailable(int refillAvailable) {
        this.refillAvailable = refillAvailable;
    }

    public float getBlockedAmount() {
        return blockedAmount;
    }

    public void setBlockedAmount(float blockedAmount) {
        this.blockedAmount = blockedAmount;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getTitleSmall() {
        return titleSmall;
    }

    public void setTitleSmall(String titleSmall) {
        this.titleSmall = titleSmall;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public boolean isIsSalary() {
        return isSalary;
    }

    public void setIsSalary(boolean isSalary) {
        this.isSalary = isSalary;
    }

    public static Account create(String json) {
        String string = RestAssured.get(json).asString();
        Gson gson = new Gson();
        Account account = gson.fromJson(string, Account.class);
        return account;
    }

    public static List<Object[]> createList(String listOfJson) {
        List<Object[]> list = new ArrayList<>();
        String string = RestAssured.get(listOfJson).asString();
        Gson gson = new Gson();
        Account[] accounts = gson.fromJson(string, Account[].class);
        for (Account account : accounts) {
            list.add(new Object[]{account});
        }
        return list;
    }

}
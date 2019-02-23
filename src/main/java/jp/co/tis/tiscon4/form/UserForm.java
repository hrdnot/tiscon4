package jp.co.tis.tiscon4.form;

import jp.co.tis.tiscon4.common.code.JobType;
import jp.co.tis.tiscon4.common.code.TreatedType;
import nablarch.core.util.StringUtil;
import nablarch.core.validation.ee.Domain;
import nablarch.core.validation.ee.Required;

import javax.validation.constraints.AssertTrue;
import java.io.Serializable;

public class UserForm implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 漢字氏名 */
    @Required
    @Domain("kanjiName")
    private String kanjiName1;

    @Required
    @Domain("kanjiName")
    private String kanjiName2;

    /** カナ氏名 */
    @Required
    @Domain("kanaName")
    private String kanaName1;

    @Required
    @Domain("kanaName")
    private String kanaName2;

    /** 英字氏名 */
    @Required
    @Domain("alphabetName")
    private String alphabetName1;

    @Required
    @Domain("alphabetName")
    private String alphabetName2;

    /** 性別 */
    @Required
    @Domain("gender")
    private String gender;

    /** 生年月日 */
    @Required
    @Domain("year")
    private String dateOfBirth1;

    @Required
    @Domain("month")
    private String dateOfBirth2;

    @Required
    @Domain("day")
    private String dateOfBirth3;

    /** 郵便番号 */
    @Required
    @Domain("zipCode1")
    private String zipCode1;

    @Required
    @Domain("zipCode2")
    private String zipCode2;

    /** 住所 */
    @Required
    @Domain("address")
    private String address;

    /** 自宅電話番号 */
    @Required
    @Domain("homePhoneNumber1")
    private String homePhoneNumber1;

    @Required
    @Domain("homePhoneNumber2")
    private String homePhoneNumber2;

     @Required
     @Domain("homePhoneNumber3")
     private String homePhoneNumber3;

    /** 携帯電話番号 */
    @Required
    @Domain("mobilePhoneNumber1")
    private String mobilePhoneNumber1;

    @Required
    @Domain("mobilePhoneNumber2")
    private String mobilePhoneNumber2;

    @Required
    @Domain("mobilePhoneNumber3")
    private String mobilePhoneNumber3;

    /** メールアドレス */
    @Required
    @Domain("emailAddress")
    private String emailAddress;

    /** 配偶者有無 */
    @Required
    @Domain("married")
    private String married;

    /** 所得金額 */
    @Required
    @Domain("income")
    private String income;

    /** 職業 */
    @Required
    @Domain("job")
    private String job;

    /** その他の職業 */
    @Domain("otherJob")
    private String otherJob;

    /** 治療歴有無 */
    @Required
    @Domain("treated")
    private String treated;

    /** 既往歴 */
    @Domain("medicalHistory")
    private String medicalHistory;

    public String getKanjiName1() {
        return kanjiName1;
    }


    public void setKanjiName1(String kanjiName) {
        this.kanjiName1 = kanjiName;
    }

    public String getKanjiName2() {
        return kanjiName2;
    }                                                                    


    public void setKanjiName2(String kanjiName) {
        this.kanjiName2 = kanjiName;
    }

    public String getKanaName1() {
        return kanaName1;
    }

    public void setKanaName1(String kanaName) {
        this.kanaName1 = kanaName;
    }

    public String getKanaName2() {
        return kanaName2;
    }

    public void setKanaName2(String kanaName) {
        this.kanaName2 = kanaName;
    }

    public String getAlphabetName1() {
        return alphabetName1;
    }

    public void setAlphabetName1(String alphabetName) {
        this.alphabetName1 = alphabetName;
    }

    public String getAlphabetName2() {
        return alphabetName2;
    }

    public void setAlphabetName2(String alphabetName) {
        this.alphabetName2 = alphabetName;
    }

    public String getDateOfBirth1() {
        return dateOfBirth1;
    }

    public void setDateOfBirth1(String dateOfBirth) {
        this.dateOfBirth1 = dateOfBirth;
    }

    public String getDateOfBirth2() {
        return dateOfBirth2;
    }

    public void setDateOfBirth2(String dateOfBirth) {
        this.dateOfBirth2 = dateOfBirth;
    }

    public String getDateOfBirth3() {
        return dateOfBirth3;
    }

    public void setDateOfBirth3(String dateOfBirth) {
        this.dateOfBirth3 = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getZipCode1() {
        return zipCode1;
    }

    public void setZipCode1(String zipCode) {
        this.zipCode1 = zipCode;
    }

    public String getZipCode2() {
        return zipCode2;
    }

    public void setZipCode2(String zipCode) {
        this.zipCode2 = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHomePhoneNumber1() {
        return homePhoneNumber1;
    }

    public void setHomePhoneNumber1(String homePhoneNumber) {
        this.homePhoneNumber1 = homePhoneNumber;
    }

    public String getHomePhoneNumber2() {
        return homePhoneNumber2;
    }

    public void setHomePhoneNumber2(String homePhoneNumber) {
        this.homePhoneNumber2 = homePhoneNumber;
    }

    public String getHomePhoneNumber3() {
        return homePhoneNumber3;
    }

    public void setHomePhoneNumber3(String homePhoneNumber) {
        this.homePhoneNumber3 = homePhoneNumber;
    }

    public String getMobilePhoneNumber1() {
        return mobilePhoneNumber1;
    }

    public void setMobilePhoneNumber1(String mobilePhoneNumber) {
        this.mobilePhoneNumber1 = mobilePhoneNumber;
    }

    public String getMobilePhoneNumber2() {
        return mobilePhoneNumber2;
    }

    public void setMobilePhoneNumber2(String mobilePhoneNumber) {
        this.mobilePhoneNumber2 = mobilePhoneNumber;
    }

    public String getMobilePhoneNumber3() {
        return mobilePhoneNumber3;
    }

    public void setMobilePhoneNumber3(String mobilePhoneNumber) {
        this.mobilePhoneNumber3 = mobilePhoneNumber;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getOtherJob() {
        return otherJob;
    }

    public void setOtherJob(String otherJob) {
        this.otherJob = otherJob;
    }

    public String getTreated() {
        return treated;
    }

    public void setTreated(String treated) {
        this.treated = treated;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    /**
     * その他の職業欄が正しく入力されているかどうか判定する。
     * 職業で「その他（有職）」を選択し、その他の職業欄に何らかの値が入力された場合、正しく入力されたと判定する。
     *
     * @return その他の職業欄に入力がある場合にtrue
     */
    @AssertTrue(message = "{tiscon4.order.inputUser.error.hasValueOtherJob}")
    public boolean hasValueOtherJob() {
        if (StringUtil.isNullOrEmpty(job)) {
            // 職業が未入力の場合は、相関バリデーションは実施しない。(バリデーションOKとする)
            return true;
        } else if (JobType.EMPLOYED.getCode().equals(job) && StringUtil.isNullOrEmpty(otherJob)) {
            return false;
        }
        return true;
    }

    /**
     * 既往歴が正しく入力されているかどうか判定する。
     * 治療有無で「はい」を選択し、既往歴に何らかの値が入力された場合、正しく入力されたと判定する。
     *
     * @return 既往歴に入力がある場合にtrue
     */
    @AssertTrue(message = "{tiscon4.order.inputUser.error.hasValueMedicalHistory}")
    public boolean hasValueMedicalHistory() {
        if (StringUtil.isNullOrEmpty(treated)) {
            // 治療有無が未入力の場合は、相関バリデーションは実施しない。(バリデーションOKとする)
            return true;
        } else if (TreatedType.TREATED.getCode().equals(treated) && StringUtil.isNullOrEmpty(medicalHistory)) {
            return false;
        }
        return true;
    }

}

CREATE TABLE PUBLIC.INSURANCE_ORDER (
  RECEIPT_NO NUMBER(9) NOT NULL DEFAULT 0 AUTO_INCREMENT,
  INSURANCE_TYPE VARCHAR(9) NOT NULL,
  KANJI_NAME VARCHAR(120) NOT NULL,
  KANA_NAME VARCHAR(180) NOT NULL,
  ALPHABET_NAME VARCHAR(120) NOT NULL,
  GENDER VARCHAR(6) NOT NULL,
  DATE_OF_BIRTH CHAR(10) NOT NULL,
  ZIP_CODE CHAR(8) NOT NULL,
  ADDRESS VARCHAR(510) NOT NULL,
  HOME_PHONE_NUMBER VARCHAR(13) NOT NULL,
  MOBILE_PHONE_NUMBER VARCHAR(13) NOT NULL,
  EMAIL_ADDRESS VARCHAR(255) NOT NULL,
  MARRIED CHAR(1) NOT NULL,
  INCOME VARCHAR(9) NOT NULL,
  JOB VARCHAR(20) NOT NULL,
  OTHER_JOB VARCHAR(240),
  TREATED CHAR(1) NOT NULL,
  MEDICAL_HISTORY VARCHAR(240),
  EMPLOYER_NAME VARCHAR(510),
  EMPLOYER_ZIP_CODE CHAR(8),
  EMPLOYER_ADDRESS VARCHAR(510),
  EMPLOYER_PHONE_NUMBER VARCHAR(13),
  INDUSTRY_TYPE VARCHAR(20),
  PRIMARY KEY (RECEIPT_NO)
);
COMMENT ON table PUBLIC.INSURANCE_ORDER is '保険申し込み';
COMMENT ON column PUBLIC.INSURANCE_ORDER.RECEIPT_NO is '受付番号';
COMMENT ON column PUBLIC.INSURANCE_ORDER.INSURANCE_TYPE is '保険区分';
COMMENT ON column PUBLIC.INSURANCE_ORDER.KANJI_NAME is '漢字氏名';
COMMENT ON column PUBLIC.INSURANCE_ORDER.KANA_NAME is 'カナ氏名';
COMMENT ON column PUBLIC.INSURANCE_ORDER.ALPHABET_NAME is '英字氏名';
COMMENT ON column PUBLIC.INSURANCE_ORDER.GENDER is '性別';
COMMENT ON column PUBLIC.INSURANCE_ORDER.DATE_OF_BIRTH is '生年月日';
COMMENT ON column PUBLIC.INSURANCE_ORDER.ZIP_CODE is '郵便番号';
COMMENT ON column PUBLIC.INSURANCE_ORDER.ADDRESS is '住所';
COMMENT ON column PUBLIC.INSURANCE_ORDER.HOME_PHONE_NUMBER is '自宅電話番号';
COMMENT ON column PUBLIC.INSURANCE_ORDER.MOBILE_PHONE_NUMBER is '携帯電話番号';
COMMENT ON column PUBLIC.INSURANCE_ORDER.EMAIL_ADDRESS is 'メールアドレス';
COMMENT ON column PUBLIC.INSURANCE_ORDER.MARRIED is '配偶者有無';
COMMENT ON column PUBLIC.INSURANCE_ORDER.INCOME is '所得金額';
COMMENT ON column PUBLIC.INSURANCE_ORDER.JOB is '職業';
COMMENT ON column PUBLIC.INSURANCE_ORDER.OTHER_JOB is 'その他の職業';
COMMENT ON column PUBLIC.INSURANCE_ORDER.TREATED is '治療歴有無';
COMMENT ON column PUBLIC.INSURANCE_ORDER.MEDICAL_HISTORY is '既往歴';
COMMENT ON column PUBLIC.INSURANCE_ORDER.EMPLOYER_NAME is '勤務先';
COMMENT ON column PUBLIC.INSURANCE_ORDER.EMPLOYER_ZIP_CODE is '勤務先郵便番号';
COMMENT ON column PUBLIC.INSURANCE_ORDER.EMPLOYER_ADDRESS is '勤務先住所';
COMMENT ON column PUBLIC.INSURANCE_ORDER.EMPLOYER_PHONE_NUMBER is '勤務先電話番号';
COMMENT ON column PUBLIC.INSURANCE_ORDER.INDUSTRY_TYPE is '業種';

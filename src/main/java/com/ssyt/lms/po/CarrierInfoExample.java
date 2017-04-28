package com.ssyt.lms.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CarrierInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarrierInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCarrierIdIsNull() {
            addCriterion("carrier_Id is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIsNotNull() {
            addCriterion("carrier_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierIdEqualTo(Integer value) {
            addCriterion("carrier_Id =", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotEqualTo(Integer value) {
            addCriterion("carrier_Id <>", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThan(Integer value) {
            addCriterion("carrier_Id >", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("carrier_Id >=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThan(Integer value) {
            addCriterion("carrier_Id <", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdLessThanOrEqualTo(Integer value) {
            addCriterion("carrier_Id <=", value, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdIn(List<Integer> values) {
            addCriterion("carrier_Id in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotIn(List<Integer> values) {
            addCriterion("carrier_Id not in", values, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdBetween(Integer value1, Integer value2) {
            addCriterion("carrier_Id between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andCarrierIdNotBetween(Integer value1, Integer value2) {
            addCriterion("carrier_Id not between", value1, value2, "carrierId");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIsNull() {
            addCriterion("send_Company is null");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIsNotNull() {
            addCriterion("send_Company is not null");
            return (Criteria) this;
        }

        public Criteria andSendCompanyEqualTo(String value) {
            addCriterion("send_Company =", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNotEqualTo(String value) {
            addCriterion("send_Company <>", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyGreaterThan(String value) {
            addCriterion("send_Company >", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("send_Company >=", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyLessThan(String value) {
            addCriterion("send_Company <", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyLessThanOrEqualTo(String value) {
            addCriterion("send_Company <=", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyLike(String value) {
            addCriterion("send_Company like", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNotLike(String value) {
            addCriterion("send_Company not like", value, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyIn(List<String> values) {
            addCriterion("send_Company in", values, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNotIn(List<String> values) {
            addCriterion("send_Company not in", values, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyBetween(String value1, String value2) {
            addCriterion("send_Company between", value1, value2, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendCompanyNotBetween(String value1, String value2) {
            addCriterion("send_Company not between", value1, value2, "sendCompany");
            return (Criteria) this;
        }

        public Criteria andSendAddressIsNull() {
            addCriterion("send_Address is null");
            return (Criteria) this;
        }

        public Criteria andSendAddressIsNotNull() {
            addCriterion("send_Address is not null");
            return (Criteria) this;
        }

        public Criteria andSendAddressEqualTo(String value) {
            addCriterion("send_Address =", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressNotEqualTo(String value) {
            addCriterion("send_Address <>", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressGreaterThan(String value) {
            addCriterion("send_Address >", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressGreaterThanOrEqualTo(String value) {
            addCriterion("send_Address >=", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressLessThan(String value) {
            addCriterion("send_Address <", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressLessThanOrEqualTo(String value) {
            addCriterion("send_Address <=", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressLike(String value) {
            addCriterion("send_Address like", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressNotLike(String value) {
            addCriterion("send_Address not like", value, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressIn(List<String> values) {
            addCriterion("send_Address in", values, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressNotIn(List<String> values) {
            addCriterion("send_Address not in", values, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressBetween(String value1, String value2) {
            addCriterion("send_Address between", value1, value2, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendAddressNotBetween(String value1, String value2) {
            addCriterion("send_Address not between", value1, value2, "sendAddress");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanIsNull() {
            addCriterion("send_Linkman is null");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanIsNotNull() {
            addCriterion("send_Linkman is not null");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanEqualTo(String value) {
            addCriterion("send_Linkman =", value, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanNotEqualTo(String value) {
            addCriterion("send_Linkman <>", value, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanGreaterThan(String value) {
            addCriterion("send_Linkman >", value, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("send_Linkman >=", value, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanLessThan(String value) {
            addCriterion("send_Linkman <", value, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanLessThanOrEqualTo(String value) {
            addCriterion("send_Linkman <=", value, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanLike(String value) {
            addCriterion("send_Linkman like", value, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanNotLike(String value) {
            addCriterion("send_Linkman not like", value, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanIn(List<String> values) {
            addCriterion("send_Linkman in", values, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanNotIn(List<String> values) {
            addCriterion("send_Linkman not in", values, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanBetween(String value1, String value2) {
            addCriterion("send_Linkman between", value1, value2, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendLinkmanNotBetween(String value1, String value2) {
            addCriterion("send_Linkman not between", value1, value2, "sendLinkman");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIsNull() {
            addCriterion("send_Phone is null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIsNotNull() {
            addCriterion("send_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andSendPhoneEqualTo(String value) {
            addCriterion("send_Phone =", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotEqualTo(String value) {
            addCriterion("send_Phone <>", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneGreaterThan(String value) {
            addCriterion("send_Phone >", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("send_Phone >=", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLessThan(String value) {
            addCriterion("send_Phone <", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLessThanOrEqualTo(String value) {
            addCriterion("send_Phone <=", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneLike(String value) {
            addCriterion("send_Phone like", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotLike(String value) {
            addCriterion("send_Phone not like", value, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneIn(List<String> values) {
            addCriterion("send_Phone in", values, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotIn(List<String> values) {
            addCriterion("send_Phone not in", values, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneBetween(String value1, String value2) {
            addCriterion("send_Phone between", value1, value2, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andSendPhoneNotBetween(String value1, String value2) {
            addCriterion("send_Phone not between", value1, value2, "sendPhone");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIsNull() {
            addCriterion("receive_Company is null");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIsNotNull() {
            addCriterion("receive_Company is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyEqualTo(String value) {
            addCriterion("receive_Company =", value, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNotEqualTo(String value) {
            addCriterion("receive_Company <>", value, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyGreaterThan(String value) {
            addCriterion("receive_Company >", value, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("receive_Company >=", value, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyLessThan(String value) {
            addCriterion("receive_Company <", value, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyLessThanOrEqualTo(String value) {
            addCriterion("receive_Company <=", value, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyLike(String value) {
            addCriterion("receive_Company like", value, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNotLike(String value) {
            addCriterion("receive_Company not like", value, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyIn(List<String> values) {
            addCriterion("receive_Company in", values, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNotIn(List<String> values) {
            addCriterion("receive_Company not in", values, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyBetween(String value1, String value2) {
            addCriterion("receive_Company between", value1, value2, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveCompanyNotBetween(String value1, String value2) {
            addCriterion("receive_Company not between", value1, value2, "receiveCompany");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNull() {
            addCriterion("receive_Address is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNotNull() {
            addCriterion("receive_Address is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressEqualTo(String value) {
            addCriterion("receive_Address =", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotEqualTo(String value) {
            addCriterion("receive_Address <>", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThan(String value) {
            addCriterion("receive_Address >", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("receive_Address >=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThan(String value) {
            addCriterion("receive_Address <", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("receive_Address <=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLike(String value) {
            addCriterion("receive_Address like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotLike(String value) {
            addCriterion("receive_Address not like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIn(List<String> values) {
            addCriterion("receive_Address in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotIn(List<String> values) {
            addCriterion("receive_Address not in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressBetween(String value1, String value2) {
            addCriterion("receive_Address between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("receive_Address not between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanIsNull() {
            addCriterion("receive_Linkman is null");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanIsNotNull() {
            addCriterion("receive_Linkman is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanEqualTo(String value) {
            addCriterion("receive_Linkman =", value, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanNotEqualTo(String value) {
            addCriterion("receive_Linkman <>", value, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanGreaterThan(String value) {
            addCriterion("receive_Linkman >", value, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanGreaterThanOrEqualTo(String value) {
            addCriterion("receive_Linkman >=", value, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanLessThan(String value) {
            addCriterion("receive_Linkman <", value, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanLessThanOrEqualTo(String value) {
            addCriterion("receive_Linkman <=", value, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanLike(String value) {
            addCriterion("receive_Linkman like", value, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanNotLike(String value) {
            addCriterion("receive_Linkman not like", value, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanIn(List<String> values) {
            addCriterion("receive_Linkman in", values, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanNotIn(List<String> values) {
            addCriterion("receive_Linkman not in", values, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanBetween(String value1, String value2) {
            addCriterion("receive_Linkman between", value1, value2, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceiveLinkmanNotBetween(String value1, String value2) {
            addCriterion("receive_Linkman not between", value1, value2, "receiveLinkman");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNull() {
            addCriterion("receive_Phone is null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIsNotNull() {
            addCriterion("receive_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneEqualTo(String value) {
            addCriterion("receive_Phone =", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotEqualTo(String value) {
            addCriterion("receive_Phone <>", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThan(String value) {
            addCriterion("receive_Phone >", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("receive_Phone >=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThan(String value) {
            addCriterion("receive_Phone <", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLessThanOrEqualTo(String value) {
            addCriterion("receive_Phone <=", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneLike(String value) {
            addCriterion("receive_Phone like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotLike(String value) {
            addCriterion("receive_Phone not like", value, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneIn(List<String> values) {
            addCriterion("receive_Phone in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotIn(List<String> values) {
            addCriterion("receive_Phone not in", values, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneBetween(String value1, String value2) {
            addCriterion("receive_Phone between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andReceivePhoneNotBetween(String value1, String value2) {
            addCriterion("receive_Phone not between", value1, value2, "receivePhone");
            return (Criteria) this;
        }

        public Criteria andLeaverDateIsNull() {
            addCriterion("leaver_Date is null");
            return (Criteria) this;
        }

        public Criteria andLeaverDateIsNotNull() {
            addCriterion("leaver_Date is not null");
            return (Criteria) this;
        }

        public Criteria andLeaverDateEqualTo(Date value) {
            addCriterion("leaver_Date =", value, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateNotEqualTo(Date value) {
            addCriterion("leaver_Date <>", value, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateGreaterThan(Date value) {
            addCriterion("leaver_Date >", value, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateGreaterThanOrEqualTo(Date value) {
            addCriterion("leaver_Date >=", value, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateLessThan(Date value) {
            addCriterion("leaver_Date <", value, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateLessThanOrEqualTo(Date value) {
            addCriterion("leaver_Date <=", value, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateIn(List<Date> values) {
            addCriterion("leaver_Date in", values, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateNotIn(List<Date> values) {
            addCriterion("leaver_Date not in", values, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateBetween(Date value1, Date value2) {
            addCriterion("leaver_Date between", value1, value2, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andLeaverDateNotBetween(Date value1, Date value2) {
            addCriterion("leaver_Date not between", value1, value2, "leaverDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("receive_Date is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("receive_Date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterion("receive_Date =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterion("receive_Date <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterion("receive_Date >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterion("receive_Date >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterion("receive_Date <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterion("receive_Date <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterion("receive_Date in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterion("receive_Date not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterion("receive_Date between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterion("receive_Date not between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andCarrierStateIsNull() {
            addCriterion("carrier_state is null");
            return (Criteria) this;
        }

        public Criteria andCarrierStateIsNotNull() {
            addCriterion("carrier_state is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierStateEqualTo(Integer value) {
            addCriterion("carrier_state =", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateNotEqualTo(Integer value) {
            addCriterion("carrier_state <>", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateGreaterThan(Integer value) {
            addCriterion("carrier_state >", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("carrier_state >=", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateLessThan(Integer value) {
            addCriterion("carrier_state <", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateLessThanOrEqualTo(Integer value) {
            addCriterion("carrier_state <=", value, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateIn(List<Integer> values) {
            addCriterion("carrier_state in", values, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateNotIn(List<Integer> values) {
            addCriterion("carrier_state not in", values, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateBetween(Integer value1, Integer value2) {
            addCriterion("carrier_state between", value1, value2, "carrierState");
            return (Criteria) this;
        }

        public Criteria andCarrierStateNotBetween(Integer value1, Integer value2) {
            addCriterion("carrier_state not between", value1, value2, "carrierState");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNull() {
            addCriterion("insurance_Cost is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIsNotNull() {
            addCriterion("insurance_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostEqualTo(Double value) {
            addCriterion("insurance_Cost =", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotEqualTo(Double value) {
            addCriterion("insurance_Cost <>", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThan(Double value) {
            addCriterion("insurance_Cost >", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostGreaterThanOrEqualTo(Double value) {
            addCriterion("insurance_Cost >=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThan(Double value) {
            addCriterion("insurance_Cost <", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostLessThanOrEqualTo(Double value) {
            addCriterion("insurance_Cost <=", value, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostIn(List<Double> values) {
            addCriterion("insurance_Cost in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotIn(List<Double> values) {
            addCriterion("insurance_Cost not in", values, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostBetween(Double value1, Double value2) {
            addCriterion("insurance_Cost between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andInsuranceCostNotBetween(Double value1, Double value2) {
            addCriterion("insurance_Cost not between", value1, value2, "insuranceCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostIsNull() {
            addCriterion("transport_Cost is null");
            return (Criteria) this;
        }

        public Criteria andTransportCostIsNotNull() {
            addCriterion("transport_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andTransportCostEqualTo(Double value) {
            addCriterion("transport_Cost =", value, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostNotEqualTo(Double value) {
            addCriterion("transport_Cost <>", value, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostGreaterThan(Double value) {
            addCriterion("transport_Cost >", value, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostGreaterThanOrEqualTo(Double value) {
            addCriterion("transport_Cost >=", value, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostLessThan(Double value) {
            addCriterion("transport_Cost <", value, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostLessThanOrEqualTo(Double value) {
            addCriterion("transport_Cost <=", value, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostIn(List<Double> values) {
            addCriterion("transport_Cost in", values, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostNotIn(List<Double> values) {
            addCriterion("transport_Cost not in", values, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostBetween(Double value1, Double value2) {
            addCriterion("transport_Cost between", value1, value2, "transportCost");
            return (Criteria) this;
        }

        public Criteria andTransportCostNotBetween(Double value1, Double value2) {
            addCriterion("transport_Cost not between", value1, value2, "transportCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostIsNull() {
            addCriterion("other_Cost is null");
            return (Criteria) this;
        }

        public Criteria andOtherCostIsNotNull() {
            addCriterion("other_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCostEqualTo(Double value) {
            addCriterion("other_Cost =", value, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostNotEqualTo(Double value) {
            addCriterion("other_Cost <>", value, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostGreaterThan(Double value) {
            addCriterion("other_Cost >", value, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostGreaterThanOrEqualTo(Double value) {
            addCriterion("other_Cost >=", value, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostLessThan(Double value) {
            addCriterion("other_Cost <", value, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostLessThanOrEqualTo(Double value) {
            addCriterion("other_Cost <=", value, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostIn(List<Double> values) {
            addCriterion("other_Cost in", values, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostNotIn(List<Double> values) {
            addCriterion("other_Cost not in", values, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostBetween(Double value1, Double value2) {
            addCriterion("other_Cost between", value1, value2, "otherCost");
            return (Criteria) this;
        }

        public Criteria andOtherCostNotBetween(Double value1, Double value2) {
            addCriterion("other_Cost not between", value1, value2, "otherCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("total_Cost is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("total_Cost is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(Double value) {
            addCriterion("total_Cost =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(Double value) {
            addCriterion("total_Cost <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(Double value) {
            addCriterion("total_Cost >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(Double value) {
            addCriterion("total_Cost >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(Double value) {
            addCriterion("total_Cost <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(Double value) {
            addCriterion("total_Cost <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<Double> values) {
            addCriterion("total_Cost in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<Double> values) {
            addCriterion("total_Cost not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(Double value1, Double value2) {
            addCriterion("total_Cost between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(Double value1, Double value2) {
            addCriterion("total_Cost not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNull() {
            addCriterion("checkInTime is null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIsNotNull() {
            addCriterion("checkInTime is not null");
            return (Criteria) this;
        }

        public Criteria andCheckintimeEqualTo(Date value) {
            addCriterion("checkInTime =", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotEqualTo(Date value) {
            addCriterion("checkInTime <>", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThan(Date value) {
            addCriterion("checkInTime >", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkInTime >=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThan(Date value) {
            addCriterion("checkInTime <", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeLessThanOrEqualTo(Date value) {
            addCriterion("checkInTime <=", value, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeIn(List<Date> values) {
            addCriterion("checkInTime in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotIn(List<Date> values) {
            addCriterion("checkInTime not in", values, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeBetween(Date value1, Date value2) {
            addCriterion("checkInTime between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andCheckintimeNotBetween(Date value1, Date value2) {
            addCriterion("checkInTime not between", value1, value2, "checkintime");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_Delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_Delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_Delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_Delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_Delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_Delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_Delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_Delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_Delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_Delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_Delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_Delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIsNull() {
            addCriterion("alter_Time is null");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIsNotNull() {
            addCriterion("alter_Time is not null");
            return (Criteria) this;
        }

        public Criteria andAlterTimeEqualTo(Date value) {
            addCriterion("alter_Time =", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotEqualTo(Date value) {
            addCriterion("alter_Time <>", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeGreaterThan(Date value) {
            addCriterion("alter_Time >", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("alter_Time >=", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeLessThan(Date value) {
            addCriterion("alter_Time <", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeLessThanOrEqualTo(Date value) {
            addCriterion("alter_Time <=", value, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeIn(List<Date> values) {
            addCriterion("alter_Time in", values, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotIn(List<Date> values) {
            addCriterion("alter_Time not in", values, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeBetween(Date value1, Date value2) {
            addCriterion("alter_Time between", value1, value2, "alterTime");
            return (Criteria) this;
        }

        public Criteria andAlterTimeNotBetween(Date value1, Date value2) {
            addCriterion("alter_Time not between", value1, value2, "alterTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
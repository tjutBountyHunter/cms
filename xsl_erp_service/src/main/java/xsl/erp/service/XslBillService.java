package xsl.erp.service;

import xsl.erp.pojo.common.PageObject;

public interface XslBillService {

    PageObject inputMoneyBill(Integer page, Integer rows);

    PageObject outputMoneyBill(Integer page, Integer rows);

}

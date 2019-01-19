package com.natsuki;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuzhiwei
 * created at 2018-12-04
 */
public class CompanyContainer extends Company {

    private List<Company> companies = new ArrayList<>();

    void addCompanyUnit(Company unit){
        companies.add(unit);
    }

    @Override
    void sendNotification() {
        for (Company company : companies) {
            company.sendNotification();
        }
    }
}

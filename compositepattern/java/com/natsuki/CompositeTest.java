package com.natsuki;

/**
 * @author xuzhiwei
 * created at 2018-12-04
 */
public class CompositeTest {
    public static void main(String[] args) {
        Company techUnit = new TechnologyUnit();
        Company hrUnit = new HRUnit();
        CompanyContainer container = new CompanyContainer();
        container.addCompanyUnit(techUnit);
        container.addCompanyUnit(hrUnit);
        
        container.sendNotification();
    }
}

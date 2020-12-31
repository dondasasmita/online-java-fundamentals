package labs_examples.enumerations.labs;


/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

enum CEO {
    APPLE("Tim Cook"),
    GOOGLE("Sundar Pichai"),
    MICROSOFT("Satya Nadela");

    private String ceoName;

    CEO(String company) {
        this.ceoName = company;
    }

    public String getCEO() {
        return ceoName;
    }
}


class Company {

    CEO theCEO;
    String nameOfCompany;

    Company(String companyName) {
        this.nameOfCompany = companyName;
        switch (companyName) {
            case "APPLE":
                this.theCEO = CEO.APPLE;
                break;
            case "MICROSOFT" :
                this.theCEO = CEO.MICROSOFT;
                break;
            case "GOOGLE" :
                this.theCEO = CEO.GOOGLE;
                break;
        }
    }

    public static void main(String[] args) {

        Company company = new Company("APPLE");
        System.out.println(company.theCEO.getCEO());

    }


}
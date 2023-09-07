package ch08InterfacesPolymorphism;

class BuzzwordsReport extends Report {
    void runReport() {
        super.runReport();  // invokes superclass version.
        buzzwordCompliance();
        printReport();
    }

    void buzzwordCompliance() {}
}

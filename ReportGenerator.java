abstract class ReportGenerator {

    public final void generateReport() {
        fetchData();
        formatData();
        saveReport();
    }

    abstract void fetchData();
    abstract void formatData();

    void saveReport() {
        System.out.println("Saving report...");
    }
}

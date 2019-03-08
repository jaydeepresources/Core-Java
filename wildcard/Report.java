package wildcard;

public class Report {
	
	public void printReport(ServiceCenter<?> sc){
		System.out.println("Printing Report");
		sc.printServiceCenter();
	}
	
	public void printReportCar(ServiceCenter<? extends Car> sc){
		System.out.println("Printing Report for Cars only");
		sc.printServiceCenter();
	}
	
	public void printReportSportsBike(ServiceCenter<? super SportsBike> sc){
		System.out.println("Printing Report upto SportsBike only");
		sc.printServiceCenter();
	}
	
}

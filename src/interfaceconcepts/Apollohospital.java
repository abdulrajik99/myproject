package interfaceconcepts;

public class Apollohospital implements usinterface , ukinterface,Indiainterface{

	@Override
	public void physioservices() {
		System.out.println("ap physioservices");
	}

	@Override
	public void oncologyservices() {
		System.out.println("ap oncologyservices");
		
	}

	@Override
	public void orthopedicservices() {
		System.out.println("ap orthopedicservices");
		
	}

	@Override
	public void entservices() {
		System.out.println("ap entservices");
		
	}

	@Override
	public void ambulanceservices() {
		System.out.println("ap ambulanceservices");
		
	}

	@Override
	public void emergencyservices() {
		System.out.println("ap emergencyservices");
		
	}

	@Override
	public void neuroservices() {
		System.out.println("ap neuroservices");
		
	}

	@Override
	public void peditricservices() {
		System.out.println("ap peditricservices");
		
	}
	//non implemented methods
	public void opservices()
	{
		System.out.println("ap opservices");
	
	}

	public void medicalinsurance()
	{
		System.out.println("ap medicalinsurance");
	
	}
	public void appathologyservices()
	{
		System.out.println("ap appathologyservices");
	
	}
}

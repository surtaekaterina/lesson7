
public class MainAppMedPersonal {

	public static void main(String[] args) {
		
		Doc doc  = new Doc();
		Nurse nurse = new Nurse();
		Surgeon surgeon = new Surgeon();
		
		
		MedPersonal[] hospital = new MedPersonal[3];
		hospital[0] = doc;
		hospital[1] = nurse;
		hospital[2] = surgeon;

	
	for(MedPersonal p:hospital) {
		p.writePrescription();
		
		if ( p instanceof Doc) {
			((Doc) p).treatPatients();
		}
		if (p instanceof Surgeon) {
			((Surgeon) p).treatPatients();
			((Surgeon) p).doOperation();
		}
	}
	
	
	/*doc.treatPatients();
	surgeon.treatPatients();
	surgeon.doOperation();*/
}
}
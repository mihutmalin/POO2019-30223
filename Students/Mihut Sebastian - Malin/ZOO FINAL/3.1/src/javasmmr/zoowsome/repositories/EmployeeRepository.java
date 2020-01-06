package javasmmr.zoowsome.repositories;
import java.math.BigDecimal;
import org.w3c.dom.Element;
import javasmmr.zoowsome.models.employees.Caretaker;
import javasmmr.zoowsome.models.employees.Employee;
import javasmmr.zoowsome.services.factories.Constants;

public class EmployeeRepository extends EntityRepository<Employee> {
		private static final String XML_FILENAME = "Employees.xml";
		
		public 	EmployeeRepository() {
			super(XML_FILENAME, Constants.XML_TAGS.EMPLOYEE);
		}

		@Override
		protected Employee getEntityFromXmlElement(Element element) {
			String discriminant =element.getElementsByTagName(Constants.XML_TAGS.DISCRIMINANT).item(0).getTextContent();
			switch (discriminant) {
			case Constants.Employees.Caretaker:
				BigDecimal b=new BigDecimal(1500.0);
				Employee caretaker = new Caretaker("Adrian",b,false,15.0);
				caretaker.decodeFromXml(element);
				return caretaker;
			default:
				break;
			}
			return null;
		}

}

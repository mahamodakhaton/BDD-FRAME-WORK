package baseUtil;

import progressive.bdd.utils.ReadProperties;
import static progressive.bdd.utils.IConstant.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	BaseClass baseClass;
	ReadProperties envVar = new ReadProperties();

	@Before
	public void initBaseClass() {
		baseClass = new BaseClass();
		baseClass.setUpDriver(envVar.getProperties(BROWSER));

	}

	@After
	public void exitingDriver() {
		baseClass.teareUp();
	}
}

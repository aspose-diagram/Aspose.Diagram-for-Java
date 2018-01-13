package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.Diagram;
import java.io.FileInputStream;
import java.io.InputStream;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.VbaModule;
import com.aspose.diagram.VbaProject;
import com.aspose.diagram.examples.Utils;

public class ModifyVBAModuleCode {
	public static void main(String[] args) throws Exception {
		// load an existing Visio diagram
		String dataDir = Utils.getSharedDataDir(ModifyVBAModuleCode.class) + "Diagrams/";
		InputStream input = new FileInputStream(dataDir + "macro.vsdm");
		com.aspose.diagram.Diagram diagram = new com.aspose.diagram.Diagram(input);
		// extract VBA project
		VbaProject v = diagram.getVbaProject();
		// Iterate through the modules and modify VBA macro code
		for (int i = 0; i < diagram.getVbaProject().getModules().getCount(); i++) {
			VbaModule module = diagram.getVbaProject().getModules().get(i);
			String code = module.getCodes();
			if (code.contains("This is test message."))
				code = code.replace("This is test message.", "This is Aspose.Diagram message.");
			module.setCodes(code);
		}
		// save the Visio diagram
		diagram.save(dataDir + "out.vssm", SaveFileFormat.VSSM);
	}
}

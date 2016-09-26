package com.aspose.diagram.examples.VisioActiveXControls;

import com.aspose.diagram.ControlType;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class InsertanActiveControl {
	public static void main(String[] args) throws Exception {
		// ExStart:CreateUserDefinedCellInShapeSheet
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(InsertanActiveControl.class) + "VisioActiveXControls/";
		// Instantiate Diagram Object
		Diagram diagram = new Diagram();
		// Insert an ActiveX control
		diagram.getPages().get(0).addActiveXControl(ControlType.IMAGE, 1, 1, 1, 1);
		// Save diagram
		diagram.save(dataDir + "InsertActiveXControl_out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:InsertanActiveControl
	}
}

package com.aspose.diagram.examples.Window;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Window;
import com.aspose.diagram.examples.Utils;

public class DisplayGridsRulersGuidesAndPageBreaks {

	public static void main(String[] args) throws Exception {
		// ExStart:DisplayGridsRulersGuidesAndPageBreaks
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(DisplayGridsRulersGuidesAndPageBreaks.class) + "Window/";
		// load source Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// get window object by index
		Window window = diagram.getWindows().get(0);
		// set visibility of grid
		window.setShowGrid(BOOL.TRUE);
		// set visibility of guides
		window.setShowGuides(BOOL.TRUE);
		// set visibility of rulers
		window.setShowRulers(BOOL.TRUE);
		// set visibility of page breaks
		window.setShowPageBreaks(BOOL.TRUE);

		// save diagram
		diagram.save(dataDir + "DisplayGridsRulersGuidesAndPageBreaks_Out.vsdx", SaveFileFormat.VSDX);
		// ExEnd:DisplayGridsRulersGuidesAndPageBreaks
	}

}

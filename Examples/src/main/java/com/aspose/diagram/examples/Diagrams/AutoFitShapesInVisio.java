package com.aspose.diagram.examples.Diagrams;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.DiagramSaveOptions;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.Comments.AddPageLevelCommentInVisio;
import com.aspose.diagram.examples.Comments.EditPageLevelCommentInVisio;

public class AutoFitShapesInVisio {

	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AutoFitShapesInVisio.class) + "Diagrams/";
		// load a Visio diagram
		Diagram diagram = new Diagram(dataDir + "BFlowcht.vsdx");

		// use saving options
		DiagramSaveOptions options = new DiagramSaveOptions(SaveFileFormat.VSDX);
		// set Auto fit page property
		options.setAutoFitPageToDrawingContent(true);

		// save Visio diagram
		diagram.save(dataDir + "AutoFitShapesInVisio-out.vsdx", options);
	}

}

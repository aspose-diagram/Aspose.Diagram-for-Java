package com.aspose.diagram.examples.Comments;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.Diagrams.CreateDiagram;

public class AddPageLevelCommentInVisio {

	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AddPageLevelCommentInVisio.class) + "Comments/";
		// Call the diagram constructor to load diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// Add comment
		diagram.getPages().getPage(0).addComment(7.205905511811023, 3.880708661417323, "test@");

		// Save diagram
		diagram.save(dataDir + "AddPageLevelCommentInVisio-out.vsdx", SaveFileFormat.VSDX);
	}

}

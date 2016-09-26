package com.aspose.diagram.examples.Hyperlinks;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Hyperlink;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.HeadersFooters.ManageHeadersandFooters;

public class AddHyperlinkToShape {

	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(AddHyperlinkToShape.class) + "Hyperlinks/";
		// load source Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page by name
		Page page = diagram.getPages().getPage("Page-1");
		// get shape by ID
		Shape shape = page.getShapes().getShape(2);

		// initialize Hyperlink object
		Hyperlink hyperlink = new Hyperlink();
		// set address value
		hyperlink.getAddress().setValue("http://www.google.com/");
		// set sub address value
		hyperlink.getSubAddress().setValue("Sub address here");
		// set description value
		hyperlink.getDescription().setValue("Description here");
		// set name
		hyperlink.setName("MyHyperLink");

		// add hyperlink to the shape
		shape.getHyperlinks().add(hyperlink);
		// save diagram to local space
		diagram.save(dataDir + "AddHyperlinkToShape_Out.vsdx", SaveFileFormat.VSDX);
	}

}

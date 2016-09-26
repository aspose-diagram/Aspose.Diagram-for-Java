package com.aspose.diagram.examples.Shapes;

import java.util.Enumeration;
import java.util.Hashtable;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.Page;
import com.aspose.diagram.PdfSaveOptions;
import com.aspose.diagram.Shape;
import com.aspose.diagram.examples.Utils;

public class SaveVisioShapeInOtherFormats {

	public static void main(String[] args) throws Exception {
		// ExStart:SaveVisioShapeInOtherFormats
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(SaveVisioShapeInOtherFormats.class) + "Protection/";

		double shapeWidth = 0;
		double shapeHeight = 0;

		// call a Diagram class constructor to load the VSDX diagram
		Diagram srcVisio = new Diagram(dataDir + "Drawing1.vsdx");
		// get Visio page
		Page srcPage = srcVisio.getPages().get(1);
		// remove background page
		srcPage.setBackPage(null);

		// get hash table of shapes, it holds id and name
		Hashtable<Long, String> remShapes = new Hashtable<Long, String>();
		for (Shape shape : (Iterable<Shape>) srcPage.getShapes())
			// for the normal shape
			remShapes.put(shape.getID(), shape.getName());

		// iterate through the hash table
		Enumeration<Long> enumKey = remShapes.keys();
		while (enumKey.hasMoreElements()) {
			Long key = enumKey.nextElement();
			String val = remShapes.get(key);
			Shape shape = srcPage.getShapes().getShape(key);
			// check of the shape name
			if (val.equals("GroupShape1")) {
				// move shape to the origin corner
				shapeWidth = shape.getXForm().getWidth().getValue();
				shapeHeight = shape.getXForm().getHeight().getValue();
				shape.moveTo(shapeWidth * 0.5, shapeHeight * 0.5);
				// trim page size
				srcPage.getPageSheet().getPageProps().getPageWidth().setValue(shapeWidth);
				srcPage.getPageSheet().getPageProps().getPageHeight().setValue(shapeHeight);
			} else {
				// remove shape from the Visio page and hash table
				srcPage.getShapes().remove(shape);
				remShapes.remove(key);
			}
		}

		// specify saving options
		PdfSaveOptions opts = new PdfSaveOptions();
		// set page count to save
		opts.setPageCount(1);
		// set starting index of the page
		opts.setPageIndex(1);
		// save it
		srcVisio.save(dataDir + "SaveVisioShapeInOtherFormats_Out.pdf", opts);
		// ExEnd:SaveVisioShapeInOtherFormats
	}

}

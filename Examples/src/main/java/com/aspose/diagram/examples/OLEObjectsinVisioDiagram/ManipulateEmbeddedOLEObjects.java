package com.aspose.diagram.examples.OLEObjectsinVisioDiagram;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.ForeignType;
import com.aspose.diagram.Page;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.TypeValue;
import com.aspose.diagram.examples.Utils;
import com.sun.xml.internal.txw2.Document;

public class ManipulateEmbeddedOLEObjects {
	public static void main(String[] args) throws Exception {
		String dataDir = Utils.getSharedDataDir(ManipulateEmbeddedOLEObjects.class) + "OLEObjectsinVisioDiagram/";
		System.out.println(dataDir);
		// load a Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
		// get page of the Visio diagram by name
		Page page = diagram.getPages().getPage("Page-1");
		// get shape of the Visio diagram by ID
		Shape OLE_Shape = page.getShapes().getShape(2);

		// filter shapes by type Foreign
		if (OLE_Shape.getType() == TypeValue.FOREIGN) {
			if (OLE_Shape.getForeignData().getForeignType() == ForeignType.OBJECT) {
				ByteArrayInputStream Ole_stream = new ByteArrayInputStream(OLE_Shape.getForeignData().getObjectData());
				// get format of the OLE file object
				com.aspose.words.FileFormatInfo info = com.aspose.words.FileFormatUtil.detectFileFormat(Ole_stream);
				if (info.getLoadFormat() == com.aspose.words.LoadFormat.DOC
						|| info.getLoadFormat() == com.aspose.words.LoadFormat.DOCX) {					
					// modify an OLE object using Aspose.Words API
					com.aspose.words.Document doc = new com.aspose.words.Document(new ByteArrayInputStream(OLE_Shape.getForeignData().getObjectData()));
					doc.getRange().replace("testing", "Aspose", false, true);
					ByteArrayOutputStream outStream = new ByteArrayOutputStream();
					doc.save(outStream, com.aspose.words.SaveFormat.DOCX);
					// replace an OLE object
					OLE_Shape.getForeignData().setObjectData(outStream.toByteArray());
				}
			}
		}
		// save Visio diagram
		diagram.save(dataDir + "modified.vsdx", SaveFileFormat.VSDX);
	}
}

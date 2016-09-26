package com.aspose.diagram.examples.HeadersFooters;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.Color;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.Geometry.EditConnectorGeometry;

public class ManageHeadersandFooters {

	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ManageHeadersandFooters.class) + "HeadersFooters/";
		// call the diagram constructor to a load Visio diagram
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		// add page number at the right corner of header
		diagram.getHeaderFooter().setHeaderRight("&p");

		// set text at the center
		diagram.getHeaderFooter().setHeaderCenter("Center of the header");

		// set text at the left side
		diagram.getHeaderFooter().setHeaderLeft("Left of the header");

		// add text at the right corner of footer
		diagram.getHeaderFooter().setFooterRight("Right of the footer");

		// set text at the center
		diagram.getHeaderFooter().setFooterCenter("Center of the footer");

		// set text at the left side
		diagram.getHeaderFooter().setFooterLeft("Left of the footer");

		// set header & footer color
		diagram.getHeaderFooter().setHeaderFooterColor(Color.getRed());

		// set text font properties
		diagram.getHeaderFooter().getHeaderFooterFont().setItalic(BOOL.TRUE);
		diagram.getHeaderFooter().getHeaderFooterFont().setUnderline(BOOL.FALSE);

		// save Visio diagram
		diagram.save(dataDir + "EditConnectorGeometry_Out.vsdx", SaveFileFormat.VSDX);
	}

}

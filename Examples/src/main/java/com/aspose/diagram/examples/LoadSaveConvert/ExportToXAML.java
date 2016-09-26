package com.aspose.diagram.examples.LoadSaveConvert;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class ExportToXAML {

	public static void main(String[] args) throws Exception {
		// ExStart:ExportToXAML
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ExportToXAML.class) + "LoadSaveConvert/";

		// call the diagram constructor to load diagram from a VSD file
		Diagram diagram = new Diagram(dataDir + "ExportToXAML.vsd");

		// save as XAML
		diagram.save(dataDir + "ExportToXAML_Out.xaml", SaveFileFormat.XAML);
		// ExEnd:ExportToXAML
	}

}

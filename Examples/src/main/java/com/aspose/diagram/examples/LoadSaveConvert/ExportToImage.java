/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Diagram. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.diagram.examples.LoadSaveConvert;

import com.aspose.diagram.*;
import com.aspose.diagram.examples.Utils;

public class ExportToImage {
	public static void main(String[] args) throws Exception {
		// ExStart:ExportToImage
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ExportToImage.class) + "LoadSaveConvert/";

		// Call the diagram constructor to load diagram from a VSD file
		Diagram diagram = new Diagram(dataDir + "ExportToImage.vsd");

		// Save as PNG
		diagram.save(dataDir + "ExportToImage_Out.png", SaveFileFormat.PNG);
		// ExEnd:ExportToImage
	}
}

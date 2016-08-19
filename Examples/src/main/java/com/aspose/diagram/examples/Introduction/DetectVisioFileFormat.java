package com.aspose.diagram.examples.Introduction;

import com.aspose.diagram.FileFormatInfo;
import com.aspose.diagram.FileFormatUtil;
import com.aspose.diagram.examples.Utils;

public class DetectVisioFileFormat {

	public static void main(String[] args) throws Exception 
	{
		//ExStart:DetectVisioFileFormat
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DetectVisioFileFormat.class);

		// detect file format using the direct file path
		FileFormatInfo info = FileFormatUtil.detectFileFormat(dataDir + "Drawing1.vsdx");

		// get the detected file format
		System.out.println("The spreadsheet format is: " + info.getFileFormatType());
		//ExEnd:DetectVisioFileFormat
	}

}

package com.aspose.diagram.examples.Introduction;

import java.io.FileInputStream;
import java.io.InputStream;

import com.aspose.diagram.FileFormatInfo;
import com.aspose.diagram.FileFormatUtil;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.Hyperlinks.AddHyperlinkToShape;

public class DetectFormatfromInputStream {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(DetectFormatfromInputStream.class) + "Introduction/";

		// Open the stream. Read only access to load a Visio diagram.
		String stream = new String(dataDir + "Drawing1.vsdx");
		// detect file format using an input stream
		FileFormatInfo info = FileFormatUtil.detectFileFormat(stream);

		// get the detected file format
		System.out.println("The spreadsheet format is: " + info.getFileFormatType());
	}
}

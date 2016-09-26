package com.aspose.diagram.examples.LoadSaveConvert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class ExportHTMLinStream {
	public static void main(String[] args) throws Exception {
		// ExStart:ExportHTMLinStream
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(ExportHTMLinStream.class) + "LoadSaveConvert/";
		// load diagram
		Diagram diagram = new Diagram(dataDir + "ExportToHTML.vsd");

		// save resultant HTML directly to a stream
		ByteArrayOutputStream dstStream = new ByteArrayOutputStream();
		diagram.save(dstStream, SaveFileFormat.HTML);
		// In you want to read the result into a Diagram object again, in Java
		// you need to get the
		// data bytes and wrap into an input stream.
		ByteArrayInputStream srcStream = new ByteArrayInputStream(dstStream.toByteArray());
		// ExEnd:ExportHTMLinStream
	}

}

package com.aspose.diagram.examples.LoadSaveConvert;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.aspose.diagram.Diagram;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.examples.Utils;

public class SaveVisioDiagram {

	public static void main(String[] args) throws Exception
	{
		//ExStart:SaveVisioDiagram
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveVisioDiagram.class);
        // load an existing Visio diagram
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");
        // save diagram using the direct path
        diagram.save(dataDir + "SaveVisioDiagram_Out.vsdx", SaveFileFormat.VSDX);

		ByteArrayOutputStream dstStream = new ByteArrayOutputStream();
        // save diagram in the stream
		diagram.save(dstStream, SaveFileFormat.VSDX);
		// In you want to read the result into a Diagram object again, in Java you need to get the
		// data bytes and wrap into an input stream.
		ByteArrayInputStream srcStream = new ByteArrayInputStream(dstStream.toByteArray());
		//ExEnd:SaveVisioDiagram

	}

}

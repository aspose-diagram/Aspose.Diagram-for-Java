package com.aspose.diagram.examples.LoadSaveConvert.VisioSaveOptions;

import com.aspose.diagram.DateTime;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.PageSize;
import com.aspose.diagram.PaperSizeFormat;
import com.aspose.diagram.PdfCompliance;
import com.aspose.diagram.PdfDigitalSignatureDetails;
import com.aspose.diagram.PdfDigitalSignatureHashAlgorithm;
import com.aspose.diagram.PdfEncryptionAlgorithm;
import com.aspose.diagram.PdfEncryptionDetails;
import com.aspose.diagram.PdfSaveOptions;
import com.aspose.diagram.X509Certificate2;
import com.aspose.diagram.examples.Utils;

public class UsePDFSaveOptions {

	public static void main(String[] args) throws Exception
	{
    	//ExStart:UsePDFSaveOptions
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UsePDFSaveOptions.class);    
        // call the diagram constructor to load diagram from a VSDX file
        Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

        // Options when saving a diagram into the PDF format
        PdfSaveOptions options = new PdfSaveOptions();

        // discard saving background pages of the Visio diagram
        options.setSaveForegroundPagesOnly(true);

        // specify the quality of JPEG compression for images (if JPEG compression is used). Default is 95.
        options.setJpegQuality(100);

        // specify default font name
        options.setDefaultFont("Arial");

        // conformance level for generated PDF document.
        options.setCompliance(PdfCompliance.PDF_15);

        // Load the certificate from disk.
        // The other constructor overloads can be used to load certificates from different locations.
        X509Certificate2 cert = new X509Certificate2(); //"c:\\temp\\certificate.pfx", "feyb4lgcfbme");
        // sets a digital signature details. If not set, then no signing will be performed.
        options.setDigitalSignatureDetails(new PdfDigitalSignatureDetails(cert, "Test Signing", "Aspose Office", DateTime.getNow(), PdfDigitalSignatureHashAlgorithm.SHA_256));

        // set encription details
        PdfEncryptionDetails encriptionDetails = new PdfEncryptionDetails("user password", "Owner Password", PdfEncryptionAlgorithm.RC_4_128);
        options.setEncryptionDetails(encriptionDetails);
        // sets the number of pages to render in PDF.
        options.setPageCount(2);
        // sets the 0-based index of the first page to render. Default is 0.
        options.setPageIndex(0);

        // set page size
        PageSize pgSize = new PageSize(PaperSizeFormat.A_1);
        options.setPageSize(pgSize);
        // save in any supported file format
        diagram.save(dataDir + "UsePDFSaveOptions_Out.pdf", options);
        //ExEnd:UsePDFSaveOptions
	}

}

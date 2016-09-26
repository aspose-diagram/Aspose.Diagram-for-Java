package com.aspose.diagram.examples.LoadSaveConvert.VisioSaveOptions;

import com.aspose.diagram.CompositingQuality;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.ImageColorMode;
import com.aspose.diagram.ImageSaveOptions;
import com.aspose.diagram.InterpolationMode;
import com.aspose.diagram.PageSize;
import com.aspose.diagram.PaperSizeFormat;
import com.aspose.diagram.PixelOffsetMode;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.SmoothingMode;
import com.aspose.diagram.TiffCompression;
import com.aspose.diagram.examples.Utils;

public class UseImageSaveOptions {

	public static void main(String[] args) throws Exception {
		// ExStart:UseImageSaveOptions
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(UseImageSaveOptions.class) + "VisioSaveOptions/";
		// Call the diagram constructor to load diagram from a VSDX file
		Diagram diagram = new Diagram(dataDir + "Drawing1.vsdx");

		ImageSaveOptions options = new ImageSaveOptions(SaveFileFormat.JPEG);
		// specify the quality level to use during compositing.
		options.setCompositingQuality(CompositingQuality.HIGH_QUALITY);

		// sets the brightness for the the generated images.
		// this property has effect only when saving to raster image formats.
		// The default value is 0.5. The value must be in the range between 0
		// and 1.
		options.setImageBrightness(1f);

		// Summary:
		// value or the font is not installed locally, they may appear as a
		// block,
		// set the DefaultFont such as MingLiu or MS Gothic to show these
		// characters.
		options.setDefaultFont("MS Gothic");
		// sets the number of pages to render in image.
		options.setPageCount(2);
		// sets the 0-based index of the first page to render. Default is 0.
		options.setPageIndex(0);

		// set page size
		PageSize pgSize = new PageSize(PaperSizeFormat.A_1);
		options.setPageSize(pgSize);
		// discard saving background pages of the Visio diagram
		options.setSaveForegroundPagesOnly(true);

		// sets the color mode for the generated images.
		options.setImageColorMode(ImageColorMode.BLACK_AND_WHITE);

		// sets the contrast for the generated images.
		// this property has effect only when saving to raster image formats.
		// the default value is 0.5. The value must be in the range between 0
		// and 1.
		options.setImageContrast(1f);

		// specify the algorithm that is used when images are scaled or rotated.
		// this property has effect only when saving to raster image formats.
		options.setInterpolationMode(InterpolationMode.NEAREST_NEIGHBOR);

		// the value may vary from 0 to 100 where 0 means worst quality,
		// but maximum compression and 100 means best quality but minimum
		// compression.
		// the default value is 95.
		options.setJpegQuality(100);

		// set a value specifying how pixels are offset during rendering.
		options.setPixelOffsetMode(PixelOffsetMode.HIGH_SPEED);

		// sets the resolution for the generated images, in dots per inch. The
		// default value is 96.
		options.setResolution(2f);

		// sets the zoom factor for the generated images.
		// the default value is 1.0. The value must be greater than 0.
		options.setScale(1f);

		// specify whether smoothing (antialiasing) is applied to lines
		// and curves and the edges of filled areas.
		options.setSmoothingMode(SmoothingMode.HIGH_QUALITY);
		// sets the type of compression to apply when saving generated images to
		// the TIFF format.
		options.setTiffCompression(TiffCompression.CCITT_3);

		// save in any supported file format
		diagram.save(dataDir + "UseImageSaveOptions_Out.jpeg", options);
		// ExEnd:UseImageSaveOptions
	}

}

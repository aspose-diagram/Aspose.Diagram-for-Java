package com.aspose.diagram.examples.Masters;

import java.awt.Label;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.aspose.diagram.BOOL;
import com.aspose.diagram.CompressionType;
import com.aspose.diagram.Connection;
import com.aspose.diagram.Diagram;
import com.aspose.diagram.ForeignType;
import com.aspose.diagram.Master;
import com.aspose.diagram.SaveFileFormat;
import com.aspose.diagram.Shape;
import com.aspose.diagram.TypeValue;
import com.aspose.diagram.b.a.g;
import com.aspose.diagram.examples.Utils;
import com.aspose.diagram.examples.Masters.BASE64Encoder;

public class CreateMasterfromScratch {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(CreateMasterfromScratch.class) + "Masters/";

		// create a new template
		Diagram diagram = new Diagram();
		// add master
		diagram.getMasters().add(createMaster(101, "Regular", new ImageIcon(dataDir + "icon.png").getImage()));
		// save template
		diagram.save(dataDir + "template_Out.vtx", SaveFileFormat.VTX);
	}

	// create master
	public static Master createMaster(final int masterId, final String name, final java.awt.Image image) throws Exception {
		// set master properties
		Master ms = new Master();
		ms.setID(masterId);
		ms.setName(name);
		ms.setIconSize(1);
		ms.setAlignName(2);
		ms.setMatchByName(0);
		ms.setIconUpdate(1);
		ms.setUniqueID(new g("00000000-0000-0000-0000-100000000" + masterId));
		ms.setUniqueID(new g("00000000-0000-0000-0000-100000000" + masterId));
		ms.setPatternFlags(0);
		ms.setHidden(0);

		// set master's shape properties
		final Shape shape = new Shape();
		ms.getShapes().add(shape);

		final String encodedImage = loadImage(image);
		final double width = 0.5443889263424177;
		final double height = 0.432916947568133;

		shape.setID(5);
		shape.setType(TypeValue.FOREIGN);

		shape.getXForm().getPinX().setValue(0.2221944631712089);
		shape.getXForm().getPinY().setValue(0.1666458473784065);
		shape.getXForm().getWidth().setValue(width);
		shape.getXForm().getHeight().setValue(height);
		shape.getXForm().getLocPinX().getUfe().setF("Width*0.5");
		shape.getXForm().getLocPinY().getUfe().setF("Height*0.5");
		shape.getXForm().getResizeMode().setValue(0);

		shape.getTextXForm().getTxtPinY().getUfe().setF("-TxtHeight/2");
		shape.getTextXForm().getTxtWidth().getUfe().setF("TEXTWIDTH(TheText)");
		shape.getTextXForm().getTxtHeight().getUfe().setF("TEXTHEIGHT(TheText, TxtWidth)");

		// set connection properties
		final Connection connection = new Connection();
		shape.getConnections().add(connection);

		connection.setID(1);
		connection.setNameU("All");
		connection.getX().setValue(0.22);
		connection.getX().getUfe().setF("Width*0.5");
		connection.getY().setValue(0.16);
		connection.getY().getUfe().setF("Height*0.5");
		connection.getDirX().setValue(0);
		connection.getDirY().setValue(0);
		connection.getType().setValue(0);
		connection.getAutoGen().setValue(BOOL.FALSE);
		connection.getPrompt().getUfe().setF("No Formula");

		shape.getForeignData().setForeignType(ForeignType.BITMAP);
		shape.getForeignData().setCompressionType(CompressionType.PNG);
		shape.getForeignData().setValue(encodedImage.getBytes());

		return ms;
	}

	private static String loadImage(final java.awt.Image image) {
		String imageDataString = "";
		try {

			// Label als ImageObserver
			final ImageObserver dummyObserver = new Label();

			final int width = image.getWidth(dummyObserver);
			final int height = image.getHeight(dummyObserver);

			// create new Image
			final BufferedImage bImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

			// draw Image to BufferedImage
			bImage.getGraphics().drawImage(image, 0, 0, dummyObserver);

			final ByteArrayOutputStream os = new ByteArrayOutputStream();
			ImageIO.write(bImage, "png", os);

			final byte[] imageData = os.toByteArray();

			final BASE64Encoder encoder = new BASE64Encoder();
			imageDataString = encoder.encodeBuffer(imageData);

		} catch (final IOException ioe) {
			System.out.println("Exception while reading the Image " + ioe);
		}

		return imageDataString;
	}

}
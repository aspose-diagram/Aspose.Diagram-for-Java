module Asposediagramjava
  module AddHyperlinkToShape
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Initialize Hyperlink object
        hyperlink = Rjb::import('com.aspose.diagram.Hyperlink').new
        
        # Set address value
        hyperlink.getAddress().setValue("http://www.google.com/")
        
        # Set sub address value
        hyperlink.getSubAddress().setValue("Sub address here")
        
        # Set description value
        hyperlink.getDescription().setValue("Description here")
        
        # Set name
        hyperlink.setName("MyHyperLink")

        # Add hyperlink to the shape
        diagram.getPages().getPage("Flow 1").getShapes().getShape(1).getHyperlinks().add(hyperlink)

        # Save diagram
        diagram.save(data_dir + "Hyperlinks.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Added hyperlik to shape successfully!"
    end
  end
end

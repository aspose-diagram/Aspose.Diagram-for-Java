module Asposediagramjava
  module SetShapeAppearance
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'

        # Create instance of Diagram
        diagram = Rjb::import('com.aspose.diagram.Diagram').new(data_dir + "Drawing.vsd")

        # Access a particular page
        page = diagram.getPages().getPage("Flow 1")

        # get a particular connector shape
        shape = page.getShapes().getShape(1)
        
        # set dynamic connector appearance
        shape.setConnectorsType(Rjb::import('com.aspose.diagram.ConnectorsTypeValue').STRAIGHT_LINES)

        # Save diagram
        diagram.save(data_dir + "SetShapeAppearance.vdx", Rjb::import('com.aspose.diagram.SaveFileFormat').VDX)

        puts "Set appearnce of the connector type shape."
    end
  end
end
